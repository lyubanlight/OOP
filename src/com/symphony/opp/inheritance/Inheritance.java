package com.symphony.opp.inheritance;

public class Inheritance {

  public static void main(String[] args) {

  }
}


class Shape {
  protected String color;

  public Shape(String color) {
    this.color = color;
  }

  protected boolean sizeValid(double size) {
    return size >= 0;
  }
}


class Circle extends Shape {
  private double radius;

  public Circle(String color) {
    super(color);
  }

  public void setRadius(double radius) {
    if (!sizeValid(radius)) {
      this.radius = radius;
    } else {
      throw new IllegalArgumentException("Size should be positive");
    }
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Circle{");
    sb.append("color='").append(color).append('\'');
    sb.append(", radius=").append(radius);
    sb.append('}');
    return sb.toString();
  }
}

class Rectangle extends Shape {
  private double height;
  private double width;

  public Rectangle(String color) {
    super(color);
  }

  public void setHeight(double height) {
    if (!sizeValid(height)) {
      this.height = height;
    } else {
      throw new IllegalArgumentException("Size should be positive");
    }

  }

  public void setWeight(double width) {
    if (!sizeValid(width)) {
      this.width = width;
    } else {
      throw new IllegalArgumentException("Size should be positive");
    }
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Rectangle{");
    sb.append("color='").append(color).append('\'');
    sb.append(", height=").append(height);
    sb.append(", width=").append(width);
    sb.append('}');
    return sb.toString();
  }
}

