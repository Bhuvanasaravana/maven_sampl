package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  //TODO: Add javadoc comment
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
try {
                ((Script) receiver).getBinding().getVariable(property); // do not let it go to Script.super.getProperty
                return super.onGetProperty(invoker, receiver, property);
            } catch (MissingPropertyException x) {
                if (receiver.getClass() != Script.class) { // Only check declared fields of subclasses, not Script itself
