package com.furkanceylan.ticketmanagement.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TicketStatus {
  OPEN("OPEN"), ANSWERED("ANSWERED"), CLOSED("CLOSED");

  private final String value;

  TicketStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @JsonCreator
  public static TicketStatus fromValue(String v) {
    return TicketStatus.valueOf(v.toUpperCase());
  }
}