package proto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ProtoLastFile {
   public static HashMap<String, String> fileRecord = new HashMap();

   public static void main(String[] args) {
      String inPath = args[0];
      String outPath = args[1];
      String recordFile = inPath + "record.txt";
      readRecordFile(recordFile);
      traverseFile(inPath, outPath);
      writeRecordFile(recordFile);
   }

   public static void readRecordFile(String filePath) {
      try {
         File file = new File(filePath);
         if (!file.exists()) {
            return;
         }

         BufferedReader reader = new BufferedReader(new FileReader(file));
         System.out.println("解析文件" + file.getName());

         String tmpStr;
         while((tmpStr = reader.readLine()) != null) {
            String[] detail = tmpStr.split("=");
            fileRecord.put(detail[0], detail[1]);
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public static void writeRecordFile(String filePath) {
      try {
         File file = new File(filePath);
         if (file.exists()) {
            file.delete();
         }

         BufferedWriter writer = new BufferedWriter(new FileWriter(file));
         System.out.println("保存文件" + file.getName());

         for(Map.Entry<String, String> entry : fileRecord.entrySet()) {
            writer.write(String.format("%s=%s\r\n", entry.getKey(), entry.getValue()));
         }

         writer.flush();
         writer.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public static void traverseFile(String inPath, String outPath) {
      File file = new File(inPath);
      LinkedList<File> allFiles = new LinkedList();
      allFiles.add(file);

      while(allFiles.size() > 0) {
         File tmpFile = (File)allFiles.poll();
         if (tmpFile.isDirectory()) {
            for(File sonFile : tmpFile.listFiles()) {
               allFiles.add(sonFile);
            }
         } else if (tmpFile.getName().endsWith(".proto")) {
            String fileTime = (String)fileRecord.get(tmpFile.getName());
            long time = tmpFile.lastModified();
            if (fileTime == null || fileTime.equals("") || Long.parseLong(fileTime) != time) {
               convertFile(inPath, outPath, tmpFile);
               fileRecord.put(tmpFile.getName(), time + "");
            }
         }
      }

   }

   public static void convertFile(String inPath, String outPath, File file) {
      try {
         String cmd = String.format("protoc --proto_path=%s --java_out=%s %s", inPath, outPath, file.getAbsolutePath());
         System.out.println("解析文件：" + cmd);
         execCmd(cmd);
      } catch (Exception e) {
         e.printStackTrace();
      }

   }

   public static void execCmd(String cmd) {
      BufferedReader br1 = null;
      BufferedReader br2 = null;

      try {
         String[] cmds = new String[]{"cmd", "/c", cmd};
         Process _process = Runtime.getRuntime().exec(cmds);
         _process.waitFor(5L, TimeUnit.MINUTES);
         br1 = new BufferedReader(new InputStreamReader(_process.getInputStream()));
         String line = null;

         while((line = br1.readLine()) != null) {
            System.out.println(line);
         }

         br2 = new BufferedReader(new InputStreamReader(_process.getErrorStream()));

         while((line = br2.readLine()) != null) {
            System.out.println(line);
         }

         System.out.println("exit code" + _process.exitValue());
         _process.destroy();
      } catch (Exception e1) {
         e1.printStackTrace();
      } finally {
         try {
            br1.close();
            br2.close();
         } catch (IOException e) {
            e.printStackTrace();
         }

      }

   }
}
