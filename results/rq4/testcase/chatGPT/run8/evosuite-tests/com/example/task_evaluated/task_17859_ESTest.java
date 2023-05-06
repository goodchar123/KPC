/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:46:23 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17859;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17859_ESTest extends task_17859_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17859 task_17859_0 = new task_17859();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_17859.getComponent("", (-1005));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_17859.getComponent("1 p=zf.b GYnI16|9.G", 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_17859.getComponent("ndI<Z", 2899);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17859.getComponent((String) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17859", e);
      }
  }
}
