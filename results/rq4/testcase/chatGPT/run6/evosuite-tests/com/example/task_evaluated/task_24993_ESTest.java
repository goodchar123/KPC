/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:27:05 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_24993;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JInternalFrame;
import javax.swing.JLayer;
import javax.swing.JTable;
import javax.swing.plaf.LayerUI;
import javax.swing.table.DefaultTableCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_24993_ESTest extends task_24993_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      DefaultTableCellRenderer.UIResource defaultTableCellRenderer_UIResource0 = new DefaultTableCellRenderer.UIResource();
      LayerUI<DefaultTableCellRenderer> layerUI0 = new LayerUI<DefaultTableCellRenderer>();
      JLayer<DefaultTableCellRenderer> jLayer0 = new JLayer<DefaultTableCellRenderer>(defaultTableCellRenderer_UIResource0, layerUI0);
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jLayer0, jLayer0, defaultTableCellRenderer_UIResource0);
      } catch(UnsupportedOperationException e) {
         //
         // Adding components to JLayer is not supported, use setView() or setGlassPane() instead
         //
         verifyException("javax.swing.JLayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      JTable jTable0 = new JTable();
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jTable0, jTable0, jTable0);
      } catch(IllegalArgumentException e) {
         //
         // adding container's parent to itself
         //
         verifyException("java.awt.Container", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      JInternalFrame jInternalFrame0 = new JInternalFrame("", true, false);
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent((Container) null, jInternalFrame0, (Component) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_24993", e);
      }
  }
}
