/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:36:00 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.text.DefaultEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      DefaultEditorKit.DefaultKeyTypedAction defaultEditorKit_DefaultKeyTypedAction0 = new DefaultEditorKit.DefaultKeyTypedAction();
      JCheckBox jCheckBox0 = new JCheckBox(defaultEditorKit_DefaultKeyTypedAction0);
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jCheckBox0, 0, (-1735));
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      JComboBox<Integer> jComboBox0 = new JComboBox<Integer>();
      task_26420_0.deleteComponentsInRange(jComboBox0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Box box0 = Box.createHorizontalBox();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(box0, 0, 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange((Container) null, 274, 274);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}
