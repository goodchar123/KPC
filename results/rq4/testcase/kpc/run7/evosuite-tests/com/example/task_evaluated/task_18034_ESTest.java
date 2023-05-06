/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:14:11 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18034;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18034_ESTest extends task_18034_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18034 task_18034_0 = new task_18034();
      try { 
        task_18034_0.partiallyResolveName(" &*C");
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid name format
         //
         verifyException("com.example.task_evaluated.task_18034", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18034 task_18034_0 = new task_18034();
      try { 
        task_18034_0.partiallyResolveName("");
      } catch(PatternSyntaxException e) {
         //
         // Invalid name format
         //
         verifyException("com.example.task_evaluated.task_18034", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18034 task_18034_0 = new task_18034();
      String string0 = task_18034_0.partiallyResolveName("Invalid name format");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_18034 task_18034_0 = new task_18034();
      // Undeclared exception!
      try { 
        task_18034_0.partiallyResolveName((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18034", e);
      }
  }
}
