/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:12:11 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26751;
import javax.swing.JDesktopPane;
import javax.swing.JPopupMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26751_ESTest extends task_26751_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26751 task_26751_0 = new task_26751();
      JPopupMenu jPopupMenu0 = new JPopupMenu();
      // Undeclared exception!
      try { 
        task_26751_0.getFirstComponent(jPopupMenu0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JDesktopPane jDesktopPane0 = new JDesktopPane();
      task_26751 task_26751_0 = new task_26751();
      // Undeclared exception!
      try { 
        task_26751_0.getFirstComponent(jDesktopPane0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // No such child: 0
         //
         verifyException("java.awt.Container", e);
      }
  }
}
