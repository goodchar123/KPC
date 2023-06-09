/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 02:56:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14585;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14585_ESTest extends task_14585_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14585 task_14585_0 = new task_14585();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scanner scanner0 = new Scanner("com.example.task_eval(ated.task_145i");
      boolean boolean0 = task_14585.hasNextLong(scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-22), 438);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Scanner scanner0 = new Scanner(bufferedInputStream0);
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Scanner scanner0 = new Scanner("com.example.task_evaluated.task_14585");
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
  public void test4()  throws Throwable  {
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
}
