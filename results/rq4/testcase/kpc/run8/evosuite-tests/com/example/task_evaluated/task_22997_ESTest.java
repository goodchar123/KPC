/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:21:44 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_22997;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_22997_ESTest extends task_22997_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_22997 task_22997_0 = new task_22997();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      // Undeclared exception!
      try { 
        task_22997.convertDigits((String) null, (-714), 0, locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Start index is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        task_22997.convertDigits((String) null, 0, (-218), locale0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22997.convertDigits("0Mxa", 0, (-669), (Locale) null);
      } catch(IndexOutOfBoundsException e) {
         //
         // Count is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.GERMANY;
      // Undeclared exception!
      try { 
        task_22997.convertDigits("", 0, 0, locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Start index is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.forLanguageTag("");
      // Undeclared exception!
      try { 
        task_22997.convertDigits("%$qsmy3`K,x_U=K',", 1, 1751, locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Count is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      String string0 = task_22997.convertDigits("LI$]In$xjT0 *p1d>T,", 9, 9, locale0);
  }
}
