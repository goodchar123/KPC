/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:18:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7998;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_7998_ESTest extends task_7998_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_7998 task_7998_0 = new task_7998();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7998.getCharacterBeforeIndex("X#1", (-1948));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index is out of bounds.
         //
         verifyException("com.example.task_evaluated.task_7998", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = task_7998.getCharacterBeforeIndex("/YY$k kN", 1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7998.getCharacterBeforeIndex("8\"\"H+rJ", 3148);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index is out of bounds.
         //
         verifyException("com.example.task_evaluated.task_7998", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7998.getCharacterBeforeIndex((String) null, 1002);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_7998", e);
      }
  }
}
