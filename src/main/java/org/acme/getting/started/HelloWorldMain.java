package org.acme.getting.started;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;


public class HelloWorldMain implements QuarkusApplication {
  @Override
  public int run(String... args) throws Exception {   
    System.out.println("Hello World");
    return 10;
 }
}