package com.symphony.opp.encapsulation;

public class Encapsulation {

  public static void main(String[] args) {
    Rectangle redRectangle = new Rectangle("Red");
    redRectangle.setHeight(10);
    redRectangle.setWeight(20);
    System.out.println(redRectangle.toString());
  }
}


class Rectangle {
  private String color;
  private double height;
  private double width;

  public Rectangle(String color) {
    this.color = color;
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

  private boolean sizeValid(double size) {
    return size >= 0;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Rectangle{");
    sb.append("color='").append(color).append('\'');
    sb.append(", height='").append(height).append('\'');
    sb.append(", weight='").append(width).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
