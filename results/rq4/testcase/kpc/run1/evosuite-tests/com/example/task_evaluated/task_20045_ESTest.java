/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:37:12 GMT 2023
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
      Integer[] integerArray0 = new Integer[1];
      Integer integer0 = new Integer(1752);
      integerArray0[0] = integer0;
      Stream<Integer[]> stream0 = task_20045.sliceStream(integerArray0, (int) integerArray0[0]);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20045.sliceStream((Integer[]) null, 329);
      } catch(NullPointerException e) {
         //
         // Segment cannot be null
         //
         verifyException("com.example.task_evaluated.task_20045", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      // Undeclared exception!
      try { 
        task_20045.sliceStream(integerArray0, 0);
      } catch(IllegalArgumentException e) {
         //
         // Slice size must be positive
         //
         verifyException("com.example.task_evaluated.task_20045", e);
      }
  }
}
