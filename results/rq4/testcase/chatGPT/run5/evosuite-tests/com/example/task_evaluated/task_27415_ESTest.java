/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:12:51 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_27415;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.text.DefaultEditorKit;
import javax.swing.tree.TreeModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_27415_ESTest extends task_27415_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      DefaultEditorKit.BeepAction defaultEditorKit_BeepAction0 = new DefaultEditorKit.BeepAction();
      JMenu jMenu0 = new JMenu(defaultEditorKit_BeepAction0);
      task_27415_0.removeMenuItemAtIndex(jMenu0, (-2765));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      DefaultEditorKit.BeepAction defaultEditorKit_BeepAction0 = new DefaultEditorKit.BeepAction();
      JMenu jMenu0 = new JMenu(defaultEditorKit_BeepAction0);
      task_27415_0.removeMenuItemAtIndex(jMenu0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      DefaultEditorKit.BeepAction defaultEditorKit_BeepAction0 = new DefaultEditorKit.BeepAction();
      JMenu jMenu0 = new JMenu(defaultEditorKit_BeepAction0);
      JTree jTree0 = new JTree((TreeModel) null);
      Component component0 = jMenu0.add((Component) jTree0);
      task_27415_0.removeMenuItemAtIndex(jMenu0, 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      // Undeclared exception!
      try { 
        task_27415_0.removeMenuItemAtIndex((JMenu) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_27415", e);
      }
  }
}
