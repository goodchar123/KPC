/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:09:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10587;
import java.text.DateFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
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
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.RFC_1123_DATE_TIME;
      Format format0 = dateTimeFormatter0.toFormat();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(format0, "8k~1A:xSf8YG(8}*+_&");
      } catch(IllegalArgumentException e) {
         //
         // Unsupported format type: java.time.format.DateTimeFormatter$ClassicFormat
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance();
      task_10587.applyPattern(numberFormat0, "Y7tj");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance();
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

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      DateFormat dateFormat0 = MockDateFormat.getDateTimeInstance(0, 0, locale0);
      // Undeclared exception!
      try { 
        task_10587.applyPattern(dateFormat0, "q");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'q'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
  }
}
