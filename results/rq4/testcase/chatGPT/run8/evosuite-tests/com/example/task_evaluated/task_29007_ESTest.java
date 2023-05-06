/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:47:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29007;
import java.awt.IllegalComponentStateException;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.JTextComponent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29007_ESTest extends task_29007_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29007 task_29007_0 = new task_29007();
      DefaultFormatterFactory defaultFormatterFactory0 = new DefaultFormatterFactory();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField(defaultFormatterFactory0, task_29007_0);
      // Undeclared exception!
      try { 
        task_29007_0.modelToView(jFormattedTextField0, 501);
      } catch(IllegalComponentStateException e) {
         //
         // component must be showing on the screen to determine its location
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29007 task_29007_0 = new task_29007();
      // Undeclared exception!
      try { 
        task_29007_0.modelToView((JTextComponent) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29007", e);
      }
  }
}