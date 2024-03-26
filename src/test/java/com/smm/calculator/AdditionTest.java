package com.smm.calculator;

import com.smm.calculator.service.AdditionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AdditionTest {

  private AdditionService as = new AdditionService();

  @Test
  public void testSum() {
    assertEquals(5, as.sum(3, 2));
  }
}
