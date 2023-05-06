/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 18:57:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4364;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4364_ESTest extends task_4364_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4364 task_4364_0 = new task_4364();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset("com.example.task_evaluated.task_4364", "i", (-2494));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: -2494
         //
         verifyException("com.example.task_evaluated.task_4364", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset("2-J -)/f+cC^", "2-J -)/f+cC^", 3728);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: 3728
         //
         verifyException("com.example.task_evaluated.task_4364", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset((String) null, "", 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_4364", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset("'", "hZ d~m:pOEL;9>fi", 1);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 2
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
}
