/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 10:19:54 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10587;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
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
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance();
      task_10587.applyPattern(dateFormat0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      DecimalFormatSymbols decimalFormatSymbols0 = DecimalFormatSymbols.getInstance(locale0);
      DecimalFormat decimalFormat0 = new DecimalFormat("xRv1wd7", decimalFormatSymbols0);
      task_10587.applyPattern(decimalFormat0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
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
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.RFC_1123_DATE_TIME;
      Format format0 = dateTimeFormatter0.toFormat();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(format0, "");
      } catch(IllegalArgumentException e) {
         //
         // Unsupported format type: java.time.format.DateTimeFormatter$ClassicFormat
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DateFormat dateFormat0 = MockDateFormat.getTimeInstance();
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
  public void test6()  throws Throwable  {
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
}
