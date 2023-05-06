/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:05:56 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_25482;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JEditorPane;
import javax.swing.JInternalFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_25482_ESTest extends task_25482_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_25482 task_25482_0 = new task_25482();
      JEditorPane jEditorPane0 = new JEditorPane();
      // Undeclared exception!
      try { 
        task_25482_0.getFirstComponent(jEditorPane0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // No such child: 0
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      task_25482 task_25482_0 = new task_25482();
      Component component0 = task_25482_0.getFirstComponent(jInternalFrame0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_25482 task_25482_0 = new task_25482();
      // Undeclared exception!
      try { 
        task_25482_0.getFirstComponent((Container) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_25482", e);
      }
  }
}
