package com.smm.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
  public int sum(int a, int b) {
    return a + b;
  }
}
