/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 15:03:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26025;
import java.awt.Component;
import java.awt.Container;
import javax.swing.Icon;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26025_ESTest extends task_26025_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26025 task_26025_0 = new task_26025();
      DefaultTreeCellRenderer defaultTreeCellRenderer0 = new DefaultTreeCellRenderer();
      Icon icon0 = defaultTreeCellRenderer0.getOpenIcon();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(icon0, true);
      // Undeclared exception!
      try { 
        task_26025_0.removeComponent((Container) null, jRadioButtonMenuItem0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26025", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26025 task_26025_0 = new task_26025();
      // Undeclared exception!
      try { 
        task_26025_0.removeComponent((Container) null, (Component) null);
      } catch(NullPointerException e) {
         //
         // Component cannot be null
         //
         verifyException("com.example.task_evaluated.task_26025", e);
      }
  }
}
