/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:34:38 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10587;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10587_ESTest extends task_10587_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10587 task_10587_0 = new task_10587();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.US;
      DateFormat dateFormat0 = DateFormat.getDateInstance(1, locale0);
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

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DecimalFormat decimalFormat0 = new DecimalFormat("Zhel`BrtKG1");
      task_10587.applyPattern(decimalFormat0, "Zhel`BrtKG1");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
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
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10587.applyPattern((Format) null, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getInstance();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(dateFormat0, "Ji?G)7");
      } catch(IllegalArgumentException e) {
         //
         // Invalid pattern: Ji?G)7
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }
}