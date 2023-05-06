/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:32:40 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35814;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35814_ESTest extends task_35814_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35814 task_35814_0 = new task_35814();
      JMenu jMenu0 = new JMenu(":p^Gixz?O.Y3,k");
      // Undeclared exception!
      try { 
        task_35814_0.insertMenuItem(jMenu0, (JMenuItem) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_35814 task_35814_0 = new task_35814();
      JMenu jMenu0 = new JMenu();
      // Undeclared exception!
      try { 
        task_35814_0.insertMenuItem(jMenu0, jMenu0, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Position cannot be negative.
         //
         verifyException("com.example.task_evaluated.task_35814", e);
      }
  }
}
