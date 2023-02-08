package com.driver;

public class Main {

  public static void main(String[] args){
    B b1 = new B();
    B.meth();
  }
  public static class A{
    static String meth(){
      return "Invoking method from class A";
    }
  }

  public static class B extends A{
    static String meth(){
      return "Method is overridden in Extendend class B";
    }
  }
}

