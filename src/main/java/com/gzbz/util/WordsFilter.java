package com.gzbz.util;

import com.gzbz.model.GameModelPool;
import com.gzbz.spring.ApplicationContextProvider;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsFilter {
   private static Node rootNode = null;
   private static final char FILTER = '*';

   public static boolean hasBadWords(String content) {
      String newStr = regexMatcherFace(content);
      newStr = regexMatcherShare(newStr);
      int a = 0;
      char[] chars = newStr.toCharArray();

      for(Node node = rootNode; a < chars.length; ++a) {
         node = findNode(node, chars[a]);
         if (node == null) {
            node = rootNode;
         } else if (node.flag == 1) {
            System.out.println("badWords warn - content:" + content + " char:" + node.c);
            return true;
         }
      }

      return false;
   }

   public static StringBuilder getBadWords(String content, boolean bContains) {
      String newStr = regexMatcherFace(content);
      newStr = regexMatcherShare(newStr);
      StringBuilder stringBuilder = new StringBuilder();
      StringBuilder temp = new StringBuilder();
      int a = 0;
      int idx = 0;
      char[] chars = newStr.toCharArray();
      int limitCount = 0;

      for(Node node = rootNode; a < chars.length && limitCount < 10000; ++limitCount) {
         node = findNode(node, chars[a]);
         if (node == null) {
            temp.delete(0, temp.length());
            node = rootNode;
            ++idx;
            a = idx - 1;
         } else {
            temp.append(node.c);
            if (node.flag == 1) {
               stringBuilder.append(temp);
               stringBuilder.append(",");
               temp.delete(0, temp.length());
               if (bContains) {
                  break;
               }
            }
         }

         ++a;
      }

      if (stringBuilder.length() > 0) {
         stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      }

      return stringBuilder;
   }

   public static String regexMatcherFace(String content) {
      String REGEX = "<img[A-Za-z0-9\\s'=]+/>";
      String newStr = content.replaceAll(REGEX, "*");
      return newStr;
   }

   public static String regexMatcherShare(String content) {
      String REGEX = "%CSB[\\u4E00-\\u9FA5A-Za-z0-9\\s]+%CSE";
      String newStr = content.replaceAll(REGEX, "*");
      return newStr;
   }

   public static void load(String path) {
      Set<String> badWords = new HashSet();
      FileInputStream is = null;
      GameModelPool gameModelPool = (GameModelPool)ApplicationContextProvider.getContext().getBean(GameModelPool.class);
      BufferedReader reader = null;

      try {
         is = new FileInputStream(path);
         reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

         String line;
         while((line = reader.readLine()) != null) {
            badWords.add(line);
         }

         reader.close();
         is.close();
         gameModelPool.systemOperationLog("加载敏感词文件成功!", System.currentTimeMillis());
      } catch (Exception e) {
         e.printStackTrace();
         gameModelPool.systemOperationLog("加载敏感词文件失败!", System.currentTimeMillis());
      } finally {
         try {
            if (reader != null) {
               reader.close();
            }

            if (is != null) {
               is.close();
            }
         } catch (Exception e) {
            e.printStackTrace();
         }

      }

      insertNode(badWords);
   }

   public static void insertNode(Set<String> badWords) {
      if (rootNode != null) {
         rootNode.nodes.clear();
      } else {
         rootNode = new Node('R');
      }

      for(String str : badWords) {
         if (str != null && str.length() > 0) {
            char[] chars = str.toCharArray();
            if (chars.length > 0) {
               insertNode(rootNode, chars, 0);
            }
         }
      }

   }

   private static void insertNode(Node node, char[] cs, int index) {
      Node n = findNode(node, cs[index]);
      if (n == null) {
         n = new Node(cs[index]);
         node.nodes.add(n);
      }

      if (index == cs.length - 1) {
         n.flag = 1;
      }

      ++index;
      if (index < cs.length) {
         insertNode(n, cs, index);
      }

   }

   private static Node findNode(Node node, char c) {
      for(Node n : node.nodes) {
         if (n.c == c) {
            return n;
         }
      }

      return null;
   }

   private static class Node {
      public char c;
      public int flag;
      public List<Node> nodes = new ArrayList();

      public Node(char c) {
         this.c = c;
         this.flag = 0;
      }
   }
}
