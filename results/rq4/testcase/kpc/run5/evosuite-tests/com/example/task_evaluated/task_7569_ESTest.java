/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:47:23 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7569;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_7569_ESTest extends task_7569_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_7569 task_7569_0 = new task_7569();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7569.getCharacterBeforeIndex((String) null, (-3018));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index is out of bounds.
         //
         verifyException("com.example.task_evaluated.task_7569", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7569.getCharacterBeforeIndex("W|&tP8*ts", 2566);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index is out of bounds.
         //
         verifyException("com.example.task_evaluated.task_7569", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = task_7569.getCharacterBeforeIndex("com.example.task_evaluated.task_7569", 1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7569.getCharacterBeforeIndex((String) null, 197);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_7569", e);
      }
  }
}
