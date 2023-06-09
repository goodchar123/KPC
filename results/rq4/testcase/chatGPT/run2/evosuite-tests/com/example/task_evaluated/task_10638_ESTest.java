/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 20:04:51 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10638;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10638_ESTest extends task_10638_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10638 task_10638_0 = new task_10638();
      DecimalFormat decimalFormat0 = new DecimalFormat();
      // Undeclared exception!
      try { 
        task_10638_0.setCurrency(decimalFormat0, (Currency) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.text.DecimalFormatSymbols", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10638 task_10638_0 = new task_10638();
      double[] doubleArray0 = new double[3];
      String[] stringArray0 = new String[3];
      ChoiceFormat choiceFormat0 = new ChoiceFormat(doubleArray0, stringArray0);
      DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols();
      Currency currency0 = decimalFormatSymbols0.getCurrency();
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
