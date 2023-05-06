/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:38:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20045;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20045_ESTest extends task_20045_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20045 task_20045_0 = new task_20045();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      // Undeclared exception!
      try { 
        task_20045.sliceStream(objectArray0, 0);
      } catch(IllegalArgumentException e) {
         //
         // Slice size must be positive
         //
         verifyException("com.example.task_evaluated.task_20045", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20045.sliceStream((String[]) null, 0);
      } catch(NullPointerException e) {
         //
         // Segment cannot be null
         //
         verifyException("com.example.task_evaluated.task_20045", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      Stream<Object[]> stream0 = task_20045.sliceStream(objectArray0, 885);
  }
}
