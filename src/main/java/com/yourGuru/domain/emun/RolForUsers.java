package com.yourGuru.domain.emun;

public enum RolForUsers {
  GAMER(1),
  READER(2),
  AUDIOVISUAL(3);
  private int value;

  RolForUsers(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
