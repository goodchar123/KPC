/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 22:01:47 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_25599;
import java.awt.Component;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButtonMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_25599_ESTest extends task_25599_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_25599 task_25599_0 = new task_25599();
      Box box0 = Box.createVerticalBox();
      // Undeclared exception!
      try { 
        task_25599_0.removeComponent((Container) null, box0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_25599", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_25599 task_25599_0 = new task_25599();
      JInternalFrame jInternalFrame0 = new JInternalFrame("Hhl", false, false, true, true);
      Icon icon0 = jInternalFrame0.getFrameIcon();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("", icon0);
      // Undeclared exception!
      try { 
        task_25599_0.removeComponent(jRadioButtonMenuItem0, (Component) null);
      } catch(NullPointerException e) {
         //
         // Component cannot be null
         //
         verifyException("com.example.task_evaluated.task_25599", e);
      }
  }
}