/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:12:54 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import javax.swing.Icon;
import javax.swing.JColorChooser;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.colorchooser.DefaultColorSelectionModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      DefaultColorSelectionModel defaultColorSelectionModel0 = new DefaultColorSelectionModel();
      JColorChooser jColorChooser0 = new JColorChooser(defaultColorSelectionModel0);
      task_26420_0.deleteComponentsInRange(jColorChooser0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      JRadioButtonMenuItem jRadioButtonMenuItem0 = new JRadioButtonMenuItem("com.example.task_evaluated.task_26420", (Icon) null);
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jRadioButtonMenuItem0, (-1953), (-1953));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1953
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange((Container) null, (-1), (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}
