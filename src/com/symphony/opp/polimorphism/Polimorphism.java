package com.symphony.opp.polimorphism;

public class Polimorphism {

  public static void main(String[] args) {
    Shape cicle1 = new Circle(5);
    Shape rectangle1 = new Rectangle(2,3);

    System.out.println(cicle1.calcArea());
    System.out.println(rectangle1.calcArea());

  }
}

abstract class Shape {

  public abstract double calcArea();
}


class Circle extends Shape {
  private double radius;

  public Circle( double radius) {
    this.radius = radius;
  }

  public double calcArea(){
    return Math.PI * radius;
  }
}

class Rectangle extends Shape {
  private double height;
  private double width;

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double calcArea(){
    return height * width;
  }
}
