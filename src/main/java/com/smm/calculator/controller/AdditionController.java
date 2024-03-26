package com.smm.calculator.controller;

import com.smm.calculator.service.AdditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

  @Autowired
  private AdditionService as;

  @RequestMapping("/sum")
  String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
    return String.valueOf(as.sum(a, b));
  }
}
