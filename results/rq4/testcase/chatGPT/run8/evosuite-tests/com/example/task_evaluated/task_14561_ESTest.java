/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:44:48 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14561;
import java.io.ByteArrayInputStream;
import java.net.ProtocolFamily;
import java.net.SocketException;
import java.net.StandardProtocolFamily;
import java.nio.channels.DatagramChannel;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14561_ESTest extends task_14561_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14561 task_14561_0 = new task_14561();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-108), (byte)91);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14561.matchNextToken((Scanner) null, "com.example.task_evaluated.task_14561");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      try { 
        DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      } catch(SocketException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "(Z1Y/tZU]1");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 10
         // (Z1Y/tZU]1
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
