package com.gepardec.examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HelloWorldAppTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStream() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStream() {
    System.setOut(System.out);
  }

  @Test
  public void helloWorldMainOutput() {
    HelloWorldApp.main(null);
    assertEquals("Hello World!\n", outContent.toString());
  }
}
