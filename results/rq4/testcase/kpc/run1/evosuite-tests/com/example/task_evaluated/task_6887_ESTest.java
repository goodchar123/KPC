/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 21:44:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6887;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6887_ESTest extends task_6887_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6887 task_6887_0 = new task_6887();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochMilli(466L);
      Date date0 = Date.from(instant0);
      // Undeclared exception!
      try { 
        task_6887.setDateField(date0, (-1), 1113);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid field value
         //
         verifyException("com.example.task_evaluated.task_6887", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6887.setDateField((Date) null, (-1), (-1));
      } catch(NullPointerException e) {
         //
         // Date cannot be null
         //
         verifyException("com.example.task_evaluated.task_6887", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockDate mockDate0 = new MockDate();
      // Undeclared exception!
      try { 
        task_6887.setDateField(mockDate0, 946, (-2414));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid field value
         //
         verifyException("com.example.task_evaluated.task_6887", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockDate mockDate0 = new MockDate(0L);
      Date date0 = task_6887.setDateField(mockDate0, 0, 0);
  }
}
