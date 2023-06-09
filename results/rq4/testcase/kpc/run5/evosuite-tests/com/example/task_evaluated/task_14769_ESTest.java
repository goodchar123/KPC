/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:45:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14769;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14769_ESTest extends task_14769_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14769 task_14769_0 = new task_14769();
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_14769_0.setSize(vector0, (-1080));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // New size cannot be negative
         //
         verifyException("com.example.task_evaluated.task_14769", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14769 task_14769_0 = new task_14769();
      // Undeclared exception!
      try { 
        task_14769_0.setSize((Vector) null, 378);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14769", e);
      }
  }
}
