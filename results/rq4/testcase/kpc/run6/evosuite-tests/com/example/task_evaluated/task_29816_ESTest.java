/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:26:32 GMT 2023
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
      String[] stringArray0 = new String[2];
      task_29816.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29816 task_29816_0 = new task_29816();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = task_29816.findEndOfWord("mZ;EX4k-qGLnBQ", 2138);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_29816.findEndOfWord((String) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29816", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_29816.findEndOfWord("mZ;EX4k-qGLnBQ", (-957));
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
