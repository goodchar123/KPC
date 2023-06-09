/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:33:47 GMT 2023
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
      Locale locale0 = Locale.KOREA;
      // Undeclared exception!
      try { 
        task_22997.convertDigits("rBn')8{Jw;jl&2X", (-1308), (-1308), locale0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Start index is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      // Undeclared exception!
      try { 
        task_22997.convertDigits((String) null, 0, 1253, locale0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22997.convertDigits("", 528, 528, (Locale) null);
      } catch(IndexOutOfBoundsException e) {
         //
         // Start index is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22997.convertDigits("U8|e]F-8Z", 0, (-671), (Locale) null);
      } catch(IndexOutOfBoundsException e) {
         //
         // Count is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22997.convertDigits("K&d/Wt)0k(*6IgV_", 0, 659, (Locale) null);
      } catch(IndexOutOfBoundsException e) {
         //
         // Count is out of bounds
         //
         verifyException("com.example.task_evaluated.task_22997", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String string0 = task_22997.convertDigits("n>", 1, 1, (Locale) null);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      String string0 = task_22997.convertDigits("W7EQpb345+U^M!o;A", 1, 1, locale0);
  }
}
