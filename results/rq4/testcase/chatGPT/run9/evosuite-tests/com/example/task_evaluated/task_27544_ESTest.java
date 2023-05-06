/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:36:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_27544;
import java.awt.Component;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_27544_ESTest extends task_27544_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      task_27544 task_27544_0 = new task_27544(jTabbedPane0);
      task_27544_0.removeTab((-551));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      task_27544 task_27544_0 = new task_27544(jTabbedPane0);
      task_27544_0.removeTab(0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      JMenu jMenu0 = new JMenu();
      Component component0 = jTabbedPane0.add((Component) jMenu0);
      task_27544 task_27544_0 = new task_27544(jTabbedPane0);
      task_27544_0.removeTab(0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_27544 task_27544_0 = new task_27544((JTabbedPane) null);
      // Undeclared exception!
      try { 
        task_27544_0.removeTab(0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_27544", e);
      }
  }
}
