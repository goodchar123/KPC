/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:32:05 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_24993;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JColorChooser;
import javax.swing.JLayer;
import javax.swing.JProgressBar;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import javax.swing.plaf.LayerUI;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_24993_ESTest extends task_24993_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      DefaultColorSelectionModel defaultColorSelectionModel0 = new DefaultColorSelectionModel();
      JColorChooser jColorChooser0 = new JColorChooser(defaultColorSelectionModel0);
      LayerUI<JColorChooser> layerUI0 = new LayerUI<JColorChooser>();
      JLayer<JColorChooser> jLayer0 = new JLayer<JColorChooser>(jColorChooser0, layerUI0);
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jLayer0, jColorChooser0, jLayer0);
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
      JProgressBar jProgressBar0 = new JProgressBar();
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jProgressBar0, jProgressBar0, jProgressBar0);
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
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent((Container) null, (Component) null, (Component) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_24993", e);
      }
  }
}
