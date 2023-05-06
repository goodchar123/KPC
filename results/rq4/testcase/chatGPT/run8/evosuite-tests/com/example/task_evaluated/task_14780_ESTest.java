/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:46:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14780;
import java.util.Vector;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14780_ESTest extends task_14780_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14780 task_14780_0 = new task_14780();
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = task_14780_0.getFirstComponent(vector0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14780 task_14780_0 = new task_14780();
      Vector<Object> vector0 = new Vector<Object>();
      Stream<Object> stream0 = vector0.parallelStream();
      boolean boolean0 = vector0.add((Object) stream0);
      Object object0 = task_14780_0.getFirstComponent(vector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14780 task_14780_0 = new task_14780();
      // Undeclared exception!
      try { 
        task_14780_0.getFirstComponent((Vector) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14780", e);
      }
  }
}
