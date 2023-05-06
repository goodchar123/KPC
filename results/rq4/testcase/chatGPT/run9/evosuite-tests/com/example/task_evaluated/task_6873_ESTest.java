/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:44:48 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6873;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6873_ESTest extends task_6873_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockDate mockDate0 = new MockDate(1574, (-1403), (-1403), 1574, 1574);
      // Undeclared exception!
      try { 
        task_6873.getDateField(mockDate0, (-1403));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1403
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6873 task_6873_0 = new task_6873();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6873.getDateField((Date) null, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }
}