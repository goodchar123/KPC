/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:59:26 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10638;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10638_ESTest extends task_10638_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10638 task_10638_0 = new task_10638();
      // Undeclared exception!
      try { 
        task_10638_0.setCurrency((NumberFormat) null, (Currency) null);
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
      DecimalFormat decimalFormat0 = new DecimalFormat();
      Currency currency0 = decimalFormat0.getCurrency();
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
