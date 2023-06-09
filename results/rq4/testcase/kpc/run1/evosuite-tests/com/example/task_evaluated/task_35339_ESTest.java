/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 14:51:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35339;
import java.awt.Component;
import java.awt.Container;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35339_ESTest extends task_35339_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JToolBar jToolBar0 = new JToolBar("");
      // Undeclared exception!
      try { 
        task_35339_0.addComponent((Container) null, jToolBar0, 3300);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      // Undeclared exception!
      try { 
        task_35339_0.addComponent((Container) null, (Component) null, 2210);
      } catch(NullPointerException e) {
         //
         // Component cannot be null
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      DefaultListCellRenderer defaultListCellRenderer0 = new DefaultListCellRenderer();
      JCheckBox jCheckBox0 = new JCheckBox((Icon) null);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jCheckBox0, defaultListCellRenderer0, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid index: -1
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JToggleButton jToggleButton0 = new JToggleButton("", (Icon) null);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jToggleButton0, jToggleButton0, 0);
      } catch(IllegalArgumentException e) {
         //
         // adding container's parent to itself
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      DefaultBoundedRangeModel defaultBoundedRangeModel0 = new DefaultBoundedRangeModel();
      JSlider jSlider0 = new JSlider(defaultBoundedRangeModel0);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jSlider0, jSlider0, 100);
      } catch(IllegalArgumentException e) {
         //
         // Invalid index: 100
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }
}
