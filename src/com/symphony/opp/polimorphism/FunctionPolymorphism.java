package com.symphony.opp.polimorphism;

public class FunctionPolymorphism {

  public static void main(String[] args) {
    A a = new A();
    a.method("A");
  }
}

class A{
  public void method(int i){
    System.out.println("One int");
  }
  public void method(int i, int j){
    System.out.println("Two int");

  }
  public void method(String i){
    System.out.println("String");

  }
}
