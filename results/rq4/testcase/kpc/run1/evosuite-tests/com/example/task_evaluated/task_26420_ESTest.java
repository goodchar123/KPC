/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 18:04:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      JSeparator jSeparator0 = new JSeparator(0);
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jSeparator0, (-1), (-1));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JSpinner jSpinner0 = new JSpinner();
      task_26420 task_26420_0 = new task_26420();
      task_26420_0.deleteComponentsInRange(jSpinner0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      JScrollPane jScrollPane0 = new JScrollPane();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jScrollPane0, 59, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange((Container) null, (-304), (-1917));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}
