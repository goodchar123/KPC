/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 16:52:30 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1188;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1188_ESTest extends task_1188_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1188 task_1188_0 = new task_1188();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_1188.getQuotedObjectName("\"ya=Y\"");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_1188.getQuotedObjectName("0i9RN/:*Bu_{,");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_1188.getQuotedObjectName("TnEXuIe?%h3%L");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = task_1188.getQuotedObjectName("F`Kz5D.lbDeg2J4N$");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1188.getQuotedObjectName((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1188", e);
      }
  }
}
