/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 10:33:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10638;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10638_ESTest extends task_10638_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10638 task_10638_0 = new task_10638();
      NumberFormat numberFormat0 = NumberFormat.getCurrencyInstance();
      Currency currency0 = numberFormat0.getCurrency();
      task_10638_0.setCurrency(numberFormat0, currency0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10638 task_10638_0 = new task_10638();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      Currency currency0 = decimalFormat0.getCurrency();
      // Undeclared exception!
      try { 
        task_10638_0.setCurrency((NumberFormat) null, currency0);
      } catch(UnsupportedOperationException e) {
         //
         // Currency formatting not supported by this NumberFormat implementation.
         //
         verifyException("com.example.task_evaluated.task_10638", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_10638 task_10638_0 = new task_10638();
      Locale locale0 = Locale.FRANCE;
      NumberFormat numberFormat0 = NumberFormat.getIntegerInstance(locale0);
      // Undeclared exception!
      try { 
        task_10638_0.setCurrency(numberFormat0, (Currency) null);
      } catch(NullPointerException e) {
         //
         // Currency cannot be null.
         //
         verifyException("com.example.task_evaluated.task_10638", e);
      }
  }
}
