package com.leetcode.problems.code.systemdesign.toyrobot.domain;

import com.leetcode.problems.code.systemdesign.toyrobot.domain.Direction;

public class Position {

  private int x;
  private int y;
  private Direction f;

  public Position(int x, int y, Direction f) {
    this.x = x;
    this.y = y;
    this.f = f;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public Direction getF() {
    return f;
  }

  public void setF(Direction f) {
    this.f = f;
  }
}

