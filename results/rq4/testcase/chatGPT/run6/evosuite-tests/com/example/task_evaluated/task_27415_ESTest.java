/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:39:08 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_27415;
import javax.swing.Icon;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_27415_ESTest extends task_27415_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      JMenu jMenu0 = new JMenu("+/b=6nqJ$`f(X~", true);
      task_27415_0.removeMenuItemAtIndex(jMenu0, (-4072));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      JMenu jMenu0 = new JMenu("+/b=6nqJ$`f(X~", true);
      task_27415_0.removeMenuItemAtIndex(jMenu0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_27415 task_27415_0 = new task_27415();
      JMenu jMenu0 = new JMenu("+/b=6nqJ$`f(X~", true);
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      Icon icon0 = jInternalFrame0.getFrameIcon();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem(icon0, false);
      JMenuItem jMenuItem0 = jMenu0.add((JMenuItem) jRadioButtonMenuItem0);
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