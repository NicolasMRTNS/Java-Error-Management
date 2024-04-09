package com.test.errormanagement.controller.advice;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorEnvelope {
    private int statusCode;
    private Date date;
    private String message;
  
    public ErrorEnvelope(int statusCode, String message) {
      this.statusCode = statusCode;
      this.message = message;
      this.date = new Date();
    }
}
