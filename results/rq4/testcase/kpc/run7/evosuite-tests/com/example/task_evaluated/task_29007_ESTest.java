/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:23:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29007;
import java.awt.IllegalComponentStateException;
import javax.swing.JTextArea;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29007_ESTest extends task_29007_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29007 task_29007_0 = new task_29007();
      JTextArea jTextArea0 = new JTextArea();
      jTextArea0.addNotify();
      // Undeclared exception!
      try { 
        task_29007_0.modelToView(jTextArea0, 1997);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Component", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29007 task_29007_0 = new task_29007();
      JTextArea jTextArea0 = new JTextArea();
      try { 
        task_29007_0.modelToView(jTextArea0, 4713);
      } catch(IllegalComponentStateException e) {
         //
         // Component is not showing on the screen
         //
         verifyException("com.example.task_evaluated.task_29007", e);
      }
  }
}
