/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:32:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6874;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6874_ESTest extends task_6874_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6874 task_6874_0 = new task_6874();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1, 1, 1360, 1, 1360, 1);
      // Undeclared exception!
      try { 
        task_6874.getFieldFromDate(mockDate0, 921);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 921
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6874.getFieldFromDate((Date) null, 1662);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }
}
