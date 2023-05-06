/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:11:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14585;
import java.io.File;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14585_ESTest extends task_14585_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14585 task_14585_0 = new task_14585();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      boolean boolean0 = task_14585.hasNextLong(scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Scanner scanner0 = new Scanner("9");
      boolean boolean0 = task_14585.hasNextLong(scanner0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Scanner scanner0 = new Scanner("rd]zm4;)Ge`13");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner1);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14585.hasNextLong((Scanner) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14585", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner0);
      } catch(NotYetConnectedException e) {
      }
  }
}