package com.gzbz.util;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public class CycleQueue<E> implements Collection<E>, Serializable {
   private transient Node<E> first;
   private transient Node<E> last;
   private transient Node<E> foNode;
   private transient Node<E> reNode;
   private transient int size;

   public CycleQueue() {
   }

   public CycleQueue(Collection<? extends E> c) {
      this.addAll(c);
   }

   public boolean addAll(Collection<? extends E> c) {
      return this.addAll(this.size, c);
   }

   public boolean removeAll(Collection<?> c) {
      this.rejectOp("removeAll");
      return false;
   }

   public boolean retainAll(Collection<?> c) {
      this.rejectOp("retainAll");
      return false;
   }

   public void clear() {
      Node<E> now = this.first;

      for(int i = 0; i < this.size; ++i) {
         Node<E> temp = now.next;
         now.item = null;
         now.next = null;
         now.prev = null;
         now = temp;
      }

      this.first = this.last = this.foNode = this.reNode = null;
      this.size = 0;
   }

   public boolean addAll(int index, Collection<? extends E> c) {
      this.checkIndex(index);
      if (c != null && !c.isEmpty()) {
         Object[] array = c.toArray();
         Node<E> next = this.node(index);
         Node<E> pred = next == null ? null : next.prev;

         for(Object o : array) {
            Node<E> newNode = new Node<E>(pred, o, (Node)null);
            if (pred == null) {
               this.first = newNode;
            } else {
               pred.next = newNode;
            }

            pred = newNode;
         }

         if (next == null) {
            this.last = pred;
         } else {
            next.prev = pred;
            pred.next = next;
         }

         this.last.next = this.first;
         this.first.prev = this.last;
         if (this.foNode == null) {
            this.foNode = this.first;
         }

         if (this.reNode == null) {
            this.reNode = this.last;
         }

         this.size += array.length;
         return true;
      } else {
         return false;
      }
   }

   Node<E> node(int index) {
      Node<E> x;
      if (index < this.size >> 1) {
         x = this.first;

         for(int i = 0; i < index; ++i) {
            x = x.next;
         }
      } else {
         x = this.last;

         for(int i = this.size - 1; i > index; --i) {
            x = x.prev;
         }
      }

      return x;
   }

   public E get(int index) {
      this.checkIndex(index);
      return this.node(index).item;
   }

   private Node<E> node(Object o) {
      Node<E> x = this.first;

      for(int i = 0; i < this.size; ++i) {
         if (x.item.equals(o)) {
            return x;
         }

         x = x.next;
      }

      return null;
   }

   public E poll() {
      if (this.foNode == null) {
         return null;
      } else {
         E item = this.foNode.item;
         this.foNode = this.foNode.next;
         return item;
      }
   }

   public E rePoll() {
      if (this.reNode == null) {
         return null;
      } else {
         E item = this.reNode.item;
         this.reNode = this.reNode.prev;
         return item;
      }
   }

   public boolean add(E e) {
      this.addLast(e);
      return true;
   }

   public boolean remove(Object o) {
      this.rejectOp("remove");
      return false;
   }

   public boolean containsAll(Collection<?> c) {
      this.rejectOp("containsAll");
      return false;
   }

   public void addFirst(E e) {
      this.first = this.link(e);
      this.foNode = this.first;
      if (this.reNode == null) {
         this.reNode = this.last;
      }

      ++this.size;
   }

   public void addLast(E e) {
      this.last = this.link(e);
      this.reNode = this.last;
      if (this.foNode == null) {
         this.foNode = this.first;
      }

      ++this.size;
   }

   private Node<E> link(E e) {
      Node<E> node = new Node<E>(this.last, e, this.first);
      if (this.first == null) {
         this.first = node;
         node.next = this.first;
      }

      if (this.last == null) {
         this.last = node;
         node.prev = this.last;
      }

      this.last.next = node;
      this.first.prev = node;
      return node;
   }

   public int size() {
      return this.size;
   }

   public boolean isEmpty() {
      return this.size <= 0;
   }

   public boolean contains(Object o) {
      return this.node(o) != null;
   }

   public Iterator<E> iterator() {
      this.rejectOp("iterator");
      return null;
   }

   private void rejectOp(String log) {
      throw new UnsupportedOperationException("循环队列暂不支持 " + log + " 方法的调用，如果使用请自行实现！！！");
   }

   public Object[] toArray() {
      Object[] result = new Object[this.size];
      Node<E> now = this.first;

      for(int i = 0; i < this.size; ++i) {
         result[i] = now.item;
         now = now.next;
      }

      return result;
   }

   public <T> T[] toArray(T[] a) {
      if (a.length < this.size) {
         a = (T[])((Object[])Array.newInstance(a.getClass().getComponentType(), this.size));
      }

      int i = 0;
      Object[] result = a;

      for(Node<E> x = this.first; x != null; x = x.next) {
         result[i++] = x.item;
      }

      if (a.length > this.size) {
         a[this.size] = null;
      }

      return a;
   }

   private void checkIndex(int index) {
      if (index < 0 || index > this.size) {
         throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
      }
   }

   private static class Node<E> {
      E item;
      Node<E> next;
      Node<E> prev;

      Node(Node<E> prev, E element, Node<E> next) {
         this.item = element;
         this.next = next;
         this.prev = prev;
      }
   }
}
