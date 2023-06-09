/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:58:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_25482;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.text.DefaultFormatterFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_25482_ESTest extends task_25482_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_25482 task_25482_0 = new task_25482();
      // Undeclared exception!
      try { 
        task_25482_0.getFirstComponent((Container) null);
      } catch(IllegalArgumentException e) {
         //
         // Container cannot be null
         //
         verifyException("com.example.task_evaluated.task_25482", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JEditorPane jEditorPane0 = new JEditorPane("", "");
      task_25482 task_25482_0 = new task_25482();
      // Undeclared exception!
      try { 
        task_25482_0.getFirstComponent(jEditorPane0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Container has no components
         //
         verifyException("com.example.task_evaluated.task_25482", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_25482 task_25482_0 = new task_25482();
      JInternalFrame jInternalFrame0 = new JInternalFrame("UG9uI[e$HC", true, true);
      Component component0 = task_25482_0.getFirstComponent(jInternalFrame0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_25482 task_25482_0 = new task_25482();
      DefaultFormatterFactory defaultFormatterFactory0 = new DefaultFormatterFactory();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((JFormattedTextField.AbstractFormatterFactory) defaultFormatterFactory0);
      // Undeclared exception!
      try { 
        task_25482_0.getFirstComponent(jFormattedTextField0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_25482", e);
      }
  }
}
