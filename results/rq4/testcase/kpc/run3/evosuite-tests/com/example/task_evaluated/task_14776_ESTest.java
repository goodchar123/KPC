/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:39:11 GMT 2023
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
      // Undeclared exception!
      try { 
        task_14776.indexOf(vector0, vector0, (-16));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: -16
         //
         verifyException("com.example.task_evaluated.task_14776", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      // Undeclared exception!
      try { 
        task_14776.indexOf(vector0, (Object) null, 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: 0
         //
         verifyException("com.example.task_evaluated.task_14776", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      boolean boolean0 = vector0.add("");
      int int0 = task_14776.indexOf(vector0, (Object) null, 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>();
      boolean boolean0 = vector0.add("");
      int int0 = task_14776.indexOf(vector0, "", 0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14776.indexOf((Vector) null, (Object) null, 50);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14776", e);
      }
  }
}
