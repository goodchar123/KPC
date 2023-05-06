/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:22:21 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14776;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14776_ESTest extends task_14776_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = new Object();
      boolean boolean0 = vector0.add(object0);
      int int0 = task_14776.indexOf(vector0, object0, 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = new Object();
      boolean boolean0 = vector0.add(object0);
      int int0 = task_14776.indexOf(vector0, vector0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      task_14776 task_14776_0 = new task_14776();
      // Undeclared exception!
      try { 
        task_14776.indexOf(vector0, task_14776_0, (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14776.indexOf((Vector) null, (Object) null, (-2087));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14776", e);
      }
  }
}
