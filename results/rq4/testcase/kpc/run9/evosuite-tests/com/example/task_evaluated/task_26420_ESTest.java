/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:15:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import javax.swing.JInternalFrame;
import javax.swing.JTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      JInternalFrame jInternalFrame0 = new JInternalFrame("6o\u0005\"", true, true, false, true);
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jInternalFrame0, (-1), 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Object[] objectArray0 = new Object[5];
      JTree jTree0 = new JTree(objectArray0);
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jTree0, 1091, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange((Container) null, (-1), (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}
