/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:16:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6428;
import java.sql.Time;
import java.time.LocalTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6428_ESTest extends task_6428_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6428 task_6428_0 = new task_6428();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LocalTime localTime0 = MockLocalTime.ofNanoOfDay(1L);
      Time time0 = Time.valueOf(localTime0);
      // Undeclared exception!
      try { 
        task_6428.getTimeField(time0, (-2233));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2233
         //
         verifyException("java.util.Calendar", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6428.getTimeField((Time) null, (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }
}