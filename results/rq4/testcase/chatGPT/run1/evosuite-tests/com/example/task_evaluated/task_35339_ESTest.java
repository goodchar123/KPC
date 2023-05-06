/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 02:55:12 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35339;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JLayer;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35339_ESTest extends task_35339_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      // Undeclared exception!
      try { 
        task_35339_0.addComponent((Container) null, (Component) null, 712);
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
      JToggleButton jToggleButton0 = new JToggleButton("");
      SpinnerNumberModel spinnerNumberModel0 = new SpinnerNumberModel();
      JSpinner jSpinner0 = new JSpinner(spinnerNumberModel0);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jToggleButton0, jSpinner0, (-164));
      } catch(IllegalArgumentException e) {
         //
         // illegal component position
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JLayer<JPasswordField> jLayer0 = new JLayer<JPasswordField>();
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jLayer0, jLayer0, 1569);
      } catch(UnsupportedOperationException e) {
         //
         // Adding components to JLayer is not supported, use setView() or setGlassPane() instead
         //
         verifyException("javax.swing.JLayer", e);
      }
  }
}