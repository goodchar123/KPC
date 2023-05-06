/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:40:38 GMT 2023
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
      task_14776 task_14776_0 = new task_14776();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_14776.indexOf(vector0, object0, (-2187));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: -2187
         //
         verifyException("com.example.task_evaluated.task_14776", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      // Undeclared exception!
      try { 
        task_14776.indexOf(vector0, "", 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: 1
         //
         verifyException("com.example.task_evaluated.task_14776", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      boolean boolean0 = vector0.add("");
      boolean boolean1 = vector0.add("");
      int int0 = task_14776.indexOf(vector0, "", 1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      boolean boolean0 = vector0.add("");
      boolean boolean1 = vector0.add("");
      Integer integer0 = new Integer(1);
      int int0 = task_14776.indexOf(vector0, integer0, 1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer(3259);
      // Undeclared exception!
      try { 
        task_14776.indexOf((Vector) null, integer0, 1447);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14776", e);
      }
  }
}
