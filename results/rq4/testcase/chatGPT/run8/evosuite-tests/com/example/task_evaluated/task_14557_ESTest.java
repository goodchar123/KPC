/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:20:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14557;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14557_ESTest extends task_14557_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      Scanner scanner0 = new Scanner("");
      String string0 = task_14557_0.getNextToken(scanner0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      Scanner scanner0 = new Scanner("FN39e#OEf");
      String string0 = task_14557_0.getNextToken(scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      Scanner scanner0 = new Scanner("FN39e#OEf");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      Scanner scanner0 = new Scanner("FN39e#OEf");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken((Scanner) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(NotYetConnectedException e) {
      }
  }
}