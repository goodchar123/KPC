/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:46:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14561;
import java.io.PipedInputStream;
import java.lang.reflect.Array;
import java.net.ProtocolFamily;
import java.net.SocketException;
import java.net.StandardProtocolFamily;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14561_ESTest extends task_14561_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14561 task_14561_0 = new task_14561();
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      try { 
        DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      } catch(SocketException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14561.matchNextToken((Scanner) null, "Invalid pattern syntax");
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
      boolean boolean0 = scanner0.hasNextInt();
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, (String) null);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("Ur9c!1&(\"tmD");
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "#5{#/gir/duHT");
      } catch(PatternSyntaxException e) {
         //
         // Invalid pattern syntax near index 1
         // #5{#/gir/duHT
         //  ^
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }
}
