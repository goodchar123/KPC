/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:53:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26848;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26848_ESTest extends task_26848_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26848 task_26848_0 = new task_26848();
      // Undeclared exception!
      try { 
        task_26848_0.createDialog("", 0);
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26848 task_26848_0 = new task_26848();
      // Undeclared exception!
      try { 
        task_26848_0.createDialog((String) null, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid value for defaultCloseOperation
         //
         verifyException("com.example.task_evaluated.task_26848", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26848 task_26848_0 = new task_26848();
      // Undeclared exception!
      try { 
        task_26848_0.createDialog("'%,c<M0=]xhg`<KdLX", 1);
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_26848 task_26848_0 = new task_26848();
      // Undeclared exception!
      try { 
        task_26848_0.createDialog("", 2);
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
