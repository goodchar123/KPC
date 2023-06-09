/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:14:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35339;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JInternalFrame;
import javax.swing.JLayer;
import javax.swing.JMenuBar;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.plaf.LayerUI;
import javax.swing.tree.TreeNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35339_ESTest extends task_35339_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      // Undeclared exception!
      try { 
        task_35339_0.addComponent((Container) null, (Component) null, (-416));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JMenuBar jMenuBar0 = new JMenuBar();
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jMenuBar0, jMenuBar0, (-884));
      } catch(IllegalArgumentException e) {
         //
         // illegal component position
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JTabbedPane jTabbedPane0 = new JTabbedPane();
      JInternalFrame jInternalFrame0 = new JInternalFrame("", true, false, true);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jTabbedPane0, jInternalFrame0, 174);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 174, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JSpinner jSpinner0 = new JSpinner();
      LayerUI<JSpinner> layerUI0 = new LayerUI<JSpinner>();
      JLayer<JSpinner> jLayer0 = new JLayer<JSpinner>(jSpinner0, layerUI0);
      JTree jTree0 = new JTree((TreeNode) null);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jLayer0, jTree0, (-3836));
      } catch(UnsupportedOperationException e) {
         //
         // Adding components to JLayer is not supported, use setView() or setGlassPane() instead
         //
         verifyException("javax.swing.JLayer", e);
      }
  }
}
