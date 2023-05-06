/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 15:03:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6428;
import java.sql.Time;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6428_ESTest extends task_6428_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6428 task_6428_0 = new task_6428();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Time time0 = new Time(0L);
      // Undeclared exception!
      try { 
        task_6428.getTimeField(time0, (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid field value
         //
         verifyException("com.example.task_evaluated.task_6428", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6428.getTimeField((Time) null, (-1));
      } catch(NullPointerException e) {
         //
         // Time cannot be null
         //
         verifyException("com.example.task_evaluated.task_6428", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Time time0 = new Time(1985L);
      long long0 = task_6428.getTimeField(time0, 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Time time0 = new Time(1L);
      // Undeclared exception!
      try { 
        task_6428.getTimeField(time0, 88);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Invalid field value
         //
         verifyException("com.example.task_evaluated.task_6428", e);
      }
  }
}