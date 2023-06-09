/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:11:12 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10638;
import java.text.ChoiceFormat;
import java.text.DecimalFormatSymbols;
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
      Locale locale0 = Locale.FRENCH;
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(locale0);
      Currency currency0 = decimalFormatSymbols0.getCurrency();
      // Undeclared exception!
      try { 
        task_10638_0.setCurrency((NumberFormat) null, currency0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10638", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10638 task_10638_0 = new task_10638();
      ChoiceFormat choiceFormat0 = new ChoiceFormat("");
      Locale locale0 = Locale.JAPAN;
      Currency currency0 = Currency.getInstance(locale0);
      // Undeclared exception!
      try { 
        task_10638_0.setCurrency(choiceFormat0, currency0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.NumberFormat", e);
      }
  }
}
