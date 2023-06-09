/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:28:47 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10587;
import java.text.DateFormat;
import java.text.Format;
import java.text.NumberFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10587_ESTest extends task_10587_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10587 task_10587_0 = new task_10587();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(dateFormat0, "com.example.task_evaluated.task_10587");
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern: com.example.task_evaluated.task_10587
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getInstance();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(numberFormat0, (String) null);
      } catch(NullPointerException e) {
         //
         // Pattern cannot be null
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      task_10587.applyPattern(numberFormat0, "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10587.applyPattern((Format) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(dateFormat0, (String) null);
      } catch(NullPointerException e) {
         //
         // Pattern cannot be null
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }
}
