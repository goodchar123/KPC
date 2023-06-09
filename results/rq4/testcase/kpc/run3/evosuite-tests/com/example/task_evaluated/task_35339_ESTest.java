/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 04:33:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35339;
import java.awt.Component;
import java.awt.Container;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JToggleButton;
import javax.swing.JTree;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35339_ESTest extends task_35339_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      ImageIcon imageIcon0 = new ImageIcon(bufferedImage0, "");
      JToggleButton jToggleButton0 = new JToggleButton("", imageIcon0);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jToggleButton0, jToggleButton0, 1);
      } catch(IllegalArgumentException e) {
         //
         // Invalid index: 1
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      // Undeclared exception!
      try { 
        task_35339_0.addComponent((Container) null, (Component) null, 788);
      } catch(NullPointerException e) {
         //
         // Component cannot be null
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JInternalFrame jInternalFrame0 = new JInternalFrame("aAs", true);
      Icon icon0 = jInternalFrame0.getFrameIcon();
      JToggleButton jToggleButton0 = new JToggleButton("s&,Q*R^Oi[", icon0);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jToggleButton0, jToggleButton0, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid index: -1
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      JButton jButton0 = new JButton();
      // Undeclared exception!
      try { 
        task_35339_0.addComponent(jButton0, jButton0, 0);
      } catch(IllegalArgumentException e) {
         //
         // adding container's parent to itself
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_35339 task_35339_0 = new task_35339();
      Object[] objectArray0 = new Object[5];
      JTree jTree0 = new JTree(objectArray0);
      // Undeclared exception!
      try { 
        task_35339_0.addComponent((Container) null, jTree0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35339", e);
      }
  }
}
