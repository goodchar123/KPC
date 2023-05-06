/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:12:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14560;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14560_ESTest extends task_14560_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("5U\u0006b[=8V]'g8b3/j0B", (Scanner) null);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14560", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      String string0 = task_14560_0.getNextToken("ayuTGSj}J62*", scanner0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14560", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner(">");
      String string0 = task_14560_0.getNextToken(">", scanner0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", scanner1);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("ZEOn4~',95");
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken((String) null, scanner0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      String string0 = "";
      try { 
        DatagramChannel.open();
      } catch(SocketException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("$");
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("%]),w${^T", scanner0);
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 1
         // %]),w${^T
         //  ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}