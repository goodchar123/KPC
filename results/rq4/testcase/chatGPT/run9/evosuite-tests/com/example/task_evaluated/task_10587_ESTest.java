/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:19:18 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10587;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
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
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      task_10587.applyPattern(numberFormat0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      MessageFormat messageFormat0 = new MessageFormat("", locale0);
      // Undeclared exception!
      try { 
        task_10587.applyPattern(messageFormat0, "");
      } catch(IllegalArgumentException e) {
         //
         // Unsupported format type: java.text.MessageFormat
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getInstance();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(dateFormat0, "s/lM1>YvneY");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'l'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DateFormat dateFormat0 = DateFormat.getDateInstance(0);
      // Undeclared exception!
      try { 
        task_10587.applyPattern(dateFormat0, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }
}
