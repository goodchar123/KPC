/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:39:32 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14560;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
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
        task_14560_0.getNextToken("com.example.task_evaluated.task_14560", (Scanner) null);
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
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
      String string0 = task_14560_0.getNextToken("No match result available", scanner0);
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
      Scanner scanner0 = new Scanner("r>or0FSu");
      String string0 = task_14560_0.getNextToken("r>or0FSu", scanner0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("r>or0FSu");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("r>or0FSu", scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1, 1);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
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
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", scanner0);
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("exGV.yl<6k=\f~K>s");
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("jU!:qCY!_D6A+00{By^", scanner0);
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 14
         // jU!:qCY!_D6A+00{By^
         //               ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
