/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:38:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14219;
import java.util.Collection;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14219_ESTest extends task_14219_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14219 task_14219_0 = new task_14219();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_14219.removeElement((Collection<Object>) null, object0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14219", e);
      }
  }
}
