/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:24:34 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_24993;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JLayer;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_24993_ESTest extends task_24993_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      JTableHeader jTableHeader0 = new JTableHeader();
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jTableHeader0, jTableHeader0, jTableHeader0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid component index
         //
         verifyException("com.example.task_evaluated.task_24993", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JOptionPane jOptionPane0 = new JOptionPane();
      JLayer<JOptionPane> jLayer0 = new JLayer<JOptionPane>(jOptionPane0);
      task_24993 task_24993_0 = new task_24993();
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jLayer0, jOptionPane0, jLayer0);
      } catch(UnsupportedOperationException e) {
         //
         // Adding components to JLayer is not supported, use setView() or setGlassPane() instead
         //
         verifyException("javax.swing.JLayer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent((Container) null, (Component) null, (Component) null);
      } catch(NullPointerException e) {
         //
         // Old component cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
