/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 04:53:41 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14561;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14561_ESTest extends task_14561_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14561 task_14561_0 = new task_14561();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14561.matchNextToken((Scanner) null, "X00:SPMd");
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      BufferedReader bufferedReader0 = new BufferedReader(mockFileReader0);
      Scanner scanner0 = new Scanner(bufferedReader0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "Invalid pattern syntax");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      boolean boolean0 = scanner0.hasNextShort(0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "");
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "Invalid pattern syntax");
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Scanner scanner0 = new Scanner("9K`,F(aW'6a?QzO;");
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "9K`,F(aW'6a?QzO;");
      } catch(PatternSyntaxException e) {
         //
         // Invalid pattern syntax near index 16
         // 9K`,F(aW'6a?QzO;
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }
}
