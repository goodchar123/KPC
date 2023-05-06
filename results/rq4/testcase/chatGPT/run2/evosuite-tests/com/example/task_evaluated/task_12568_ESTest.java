/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:57:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12568;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12568_ESTest extends task_12568_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12568 task_12568_0 = new task_12568();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_12568.removeParameterTypes(")", 1, 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_12568.removeParameterTypes(")", (-5285), 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_12568.removeParameterTypes("A)=dw", (-2280), (-3457));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_12568.removeParameterTypes((String) null, (-1312), (-2468));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_12568", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_12568.removeParameterTypes("doEM@Ip_ [s", (-1166), (-1166));
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
