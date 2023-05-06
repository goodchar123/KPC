/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:51:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29816;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29816_ESTest extends task_29816_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29816 task_29816_0 = new task_29816();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = task_29816.findEndOfWord("", 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_29816.findEndOfWord("", (-1));
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = task_29816.findEndOfWord("Ir*_<X7c9{RiLhGb9rA", 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_29816.findEndOfWord((String) null, (-969));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29816", e);
      }
  }
}
