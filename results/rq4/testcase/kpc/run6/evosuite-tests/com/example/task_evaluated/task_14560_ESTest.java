/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:17:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14560;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.PipedReader;
import java.nio.CharBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14560_ESTest extends task_14560_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", (Scanner) null);
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
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", scanner0);
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      PipedReader pipedReader0 = new PipedReader();
      Scanner scanner0 = new Scanner(pipedReader0);
      String string0 = task_14560_0.getNextToken("TtclG\u00029", scanner0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("Scanner is closed", scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14560", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("XC=Tt,R;z");
      String string0 = task_14560_0.getNextToken("XC=Tt,R;z", scanner0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("XC=Tt,R;z");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("XC=Tt,R;z", scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      char[] charArray0 = new char[2];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Scanner scanner0 = new Scanner(charBuffer0);
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
  public void test6()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, (-980));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Scanner scanner0 = new Scanner(bufferedInputStream0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("0N!{}!f$x<]f~_$NXh", scanner0);
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 2
         // 0N!{}!f$x<]f~_$NXh
         //   ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
