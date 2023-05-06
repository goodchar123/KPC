/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:39:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10587;
import java.text.Format;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalQuery;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.text.MockSimpleDateFormat;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10587_ESTest extends task_10587_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10587 task_10587_0 = new task_10587();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FormatStyle formatStyle0 = FormatStyle.LONG;
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofLocalizedDateTime(formatStyle0);
      TemporalQuery<Integer> temporalQuery0 = (TemporalQuery<Integer>) mock(TemporalQuery.class, new ViolatedAssumptionAnswer());
      Format format0 = dateTimeFormatter0.toFormat(temporalQuery0);
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
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance(locale0);
      task_10587.applyPattern(numberFormat0, "9");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockSimpleDateFormat mockSimpleDateFormat0 = new MockSimpleDateFormat();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(mockSimpleDateFormat0, "Unsupported format type: ");
      } catch(IllegalArgumentException e) {
         //
         // Illegal pattern character 'U'
         //
         verifyException("java.text.SimpleDateFormat", e);
      }
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
}
