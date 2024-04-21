package org.lowes.config;

import org.lowes.definitions.TutorialStepDefinitions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TutorialStepDefinitions.class})
public class ComponentTestConfig {
  public static void setUp() {
    System.out.println("Context initiated");
  }
}
