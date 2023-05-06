/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:33:47 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17668;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17668_ESTest extends task_17668_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17668 task_17668_0 = new task_17668();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_17668.addComponentToLdapName("", "", 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_17668.addComponentToLdapName("", "", 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_17668.addComponentToLdapName(",", "66+Ch ?1", 634);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17668.addComponentToLdapName((String) null, "xo|\"f|4,xo|\"f|4", 109);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17668", e);
      }
  }
}
