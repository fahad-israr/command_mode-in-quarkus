package org.acme.getting.started;

import io.quarkus.runtime.QuarkusApplication;


public class HelloWorldMain implements QuarkusApplication {
  @Override
  public int run(String... args) throws Exception {   
    System.out.println("Hello World");
    System.out.println(args[0]);
    return 10;
 }
}