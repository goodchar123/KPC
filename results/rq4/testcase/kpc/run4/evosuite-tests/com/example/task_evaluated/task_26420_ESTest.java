/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:27:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JInternalFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Box.Filler box_Filler0 = new Box.Filler((Dimension) null, (Dimension) null, (Dimension) null);
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(box_Filler0, 245, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      JInternalFrame jInternalFrame0 = new JInternalFrame("2mWFJzIIhTD!%_K", false, false, false, true);
      task_26420_0.deleteComponentsInRange(jInternalFrame0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Container container0 = new Container();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(container0, 2138, 2138);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2138
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange((Container) null, 2855, 2855);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}