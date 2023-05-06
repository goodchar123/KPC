/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:29:04 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_24993;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JFormattedTextField;
import javax.swing.JLayer;
import javax.swing.JRadioButton;
import javax.swing.plaf.LayerUI;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_24993_ESTest extends task_24993_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      DefaultEditorKit.CutAction defaultEditorKit_CutAction0 = new DefaultEditorKit.CutAction();
      JRadioButton jRadioButton0 = new JRadioButton(defaultEditorKit_CutAction0);
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jRadioButton0, jRadioButton0, jRadioButton0);
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
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((JFormattedTextField.AbstractFormatter) null);
      JLayer<JFormattedTextField> jLayer0 = new JLayer<JFormattedTextField>(jFormattedTextField0, (LayerUI<JFormattedTextField>) null);
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jLayer0, jFormattedTextField0, jLayer0);
      } catch(UnsupportedOperationException e) {
         //
         // Adding components to JLayer is not supported, use setView() or setGlassPane() instead
         //
         verifyException("javax.swing.JLayer", e);
      }
  }
}
