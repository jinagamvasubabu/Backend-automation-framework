package org.lowes;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.lowes", "commons"})
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}