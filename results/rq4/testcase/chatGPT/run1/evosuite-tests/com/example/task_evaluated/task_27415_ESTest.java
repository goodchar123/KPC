/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:33:31 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_27415;
import javax.swing.JMenu;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_27415_ESTest extends task_27415_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      DefaultEditorKit.DefaultKeyTypedAction defaultEditorKit_DefaultKeyTypedAction0 = new DefaultEditorKit.DefaultKeyTypedAction();
      JMenu jMenu0 = new JMenu(defaultEditorKit_DefaultKeyTypedAction0);
      task_27415_0.removeMenuItemAtIndex(jMenu0, (-1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      DefaultEditorKit.DefaultKeyTypedAction defaultEditorKit_DefaultKeyTypedAction0 = new DefaultEditorKit.DefaultKeyTypedAction();
      JMenu jMenu0 = new JMenu(defaultEditorKit_DefaultKeyTypedAction0);
      task_27415_0.removeMenuItemAtIndex(jMenu0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      JMenu jMenu0 = new JMenu();
      jMenu0.insertSeparator(1233);
      task_27415_0.removeMenuItemAtIndex(jMenu0, 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      // Undeclared exception!
      try { 
        task_27415_0.removeMenuItemAtIndex((JMenu) null, 2546);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_27415", e);
      }
  }
}