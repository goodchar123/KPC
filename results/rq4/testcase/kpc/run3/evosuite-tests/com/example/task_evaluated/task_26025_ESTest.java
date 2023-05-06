/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:21:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26025;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JLayer;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26025_ESTest extends task_26025_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26025 task_26025_0 = new task_26025();
      JLayer<Canvas> jLayer0 = new JLayer<Canvas>();
      // Undeclared exception!
      try { 
        task_26025_0.removeComponent((Container) null, jLayer0);
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
      JPopupMenu jPopupMenu0 = new JPopupMenu("K.;&/#M+");
      JMenuItem jMenuItem0 = jPopupMenu0.add("_");
      // Undeclared exception!
      try { 
        task_26025_0.removeComponent(jMenuItem0, (Component) null);
      } catch(NullPointerException e) {
         //
         // Component cannot be null
         //
         verifyException("com.example.task_evaluated.task_26025", e);
      }
  }
}