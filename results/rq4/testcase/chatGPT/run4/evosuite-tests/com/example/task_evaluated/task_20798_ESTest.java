/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:54:31 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20798;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20798_ESTest extends task_20798_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20798 task_20798_0 = new task_20798();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_20798.getSQLIdentifier("S,%'`9WBIM%,x^");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_20798.getSQLIdentifier("2RJZP");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20798.getSQLIdentifier((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20798", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20798.getSQLIdentifier("");
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
