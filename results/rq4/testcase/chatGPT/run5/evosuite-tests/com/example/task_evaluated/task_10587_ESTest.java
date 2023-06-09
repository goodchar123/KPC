/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:20:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10587;
import java.text.ChoiceFormat;
import java.text.DateFormat;
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
      DateFormat dateFormat0 = DateFormat.getTimeInstance(0, locale0);
      task_10587.applyPattern(dateFormat0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumberFormat numberFormat0 = NumberFormat.getNumberInstance();
      // Undeclared exception!
      try { 
        task_10587.applyPattern(numberFormat0, "^9x-0vHJ{gq#3B");
      } catch(IllegalArgumentException e) {
         //
         // Malformed pattern \"^9x-0vHJ{gq#3B\"
         //
         verifyException("java.text.DecimalFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10587.applyPattern((Format) null, "Bz^Pw6[B>}X$B");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChoiceFormat choiceFormat0 = new ChoiceFormat(">h=");
      // Undeclared exception!
      try { 
        task_10587.applyPattern(choiceFormat0, "fL.~[2wKj");
      } catch(IllegalArgumentException e) {
         //
         // Unsupported format type: java.text.ChoiceFormat
         //
         verifyException("com.example.task_evaluated.task_10587", e);
      }
  }
}
