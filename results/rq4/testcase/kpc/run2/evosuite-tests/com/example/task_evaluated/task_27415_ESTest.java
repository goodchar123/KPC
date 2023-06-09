/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 21:42:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_27415;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_27415_ESTest extends task_27415_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      JMenu jMenu0 = new JMenu();
      // Undeclared exception!
      try { 
        task_27415_0.removeMenuItemAtIndex(jMenu0, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid position: -1
         //
         verifyException("com.example.task_evaluated.task_27415", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      JMenu jMenu0 = new JMenu("", false);
      // Undeclared exception!
      try { 
        task_27415_0.removeMenuItemAtIndex(jMenu0, 0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid position: 0
         //
         verifyException("com.example.task_evaluated.task_27415", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      JMenu jMenu0 = new JMenu("", false);
      DefaultListCellRenderer.UIResource defaultListCellRenderer_UIResource0 = new DefaultListCellRenderer.UIResource();
      Component component0 = jMenu0.add((Component) defaultListCellRenderer_UIResource0);
      task_27415_0.removeMenuItemAtIndex(jMenu0, 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      // Undeclared exception!
      try { 
        task_27415_0.removeMenuItemAtIndex((JMenu) null, 2211);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_27415", e);
      }
  }
}
