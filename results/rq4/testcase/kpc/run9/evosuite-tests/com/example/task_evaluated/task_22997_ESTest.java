/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 15:06:56 GMT 2023
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
      Locale locale0 = Locale.PRC;
      // Undeclared exception!
      try { 
        task_22997.convertDigits("BoEMH_t;A*[LrxC&", (-1702), (-1702), locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Start index is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        task_22997.convertDigits("", 656, 656, locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Start index is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      // Undeclared exception!
      try { 
        task_22997.convertDigits("|y)k,?p>!m", 1, (-2549), locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Count is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = new Locale("com.example.task_evaluated.task_22997");
      // Undeclared exception!
      try { 
        task_22997.convertDigits("com.example.task_evaluated.task_22997", 0, 195, locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Count is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      String string0 = task_22997.convertDigits(".! '", 1, 1, locale0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = Locale.CANADA_FRENCH;
      String string0 = task_22997.convertDigits("!46iJj17F!Q%v", 1, 1, locale0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22997.convertDigits((String) null, 0, (-1), (Locale) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
