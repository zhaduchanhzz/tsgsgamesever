package com.gzbz.http.vo;

public class SimpleResult<T> {
   private static int SUC = 0;
   private static int FAIL = -1;
   private int code;
   private String message;
   private T data;

   public int getCode() {
      return this.code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public String getMessage() {
      return this.message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public T getData() {
      return this.data;
   }

   public void setData(T data) {
      this.data = data;
   }

   public static <T> SimpleResult<T> suc(T data) {
      SimpleResult<T> simpleResult = new SimpleResult<T>();
      simpleResult.setCode(SUC);
      simpleResult.setData(data);
      simpleResult.setMessage("success");
      return simpleResult;
   }

   public static <T> SimpleResult<T> fail() {
      return fail(FAIL, "fail");
   }

   public static <T> SimpleResult<T> fail(String message) {
      return fail(FAIL, message);
   }

   public static <T> SimpleResult<T> fail(int code, String message) {
      SimpleResult<T> simpleResult = new SimpleResult<T>();
      simpleResult.setCode(code);
      simpleResult.setMessage(message);
      return simpleResult;
   }
}
