/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:08:01 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26751;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileSystemView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.evosuite.runtime.mock.javax.swing.filechooser.MockFileSystemView;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26751_ESTest extends task_26751_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26751 task_26751_0 = new task_26751();
      FileSystemView fileSystemView0 = MockFileSystemView.getFileSystemView();
      MockJFileChooser mockJFileChooser0 = new MockJFileChooser("|JIII-S[", fileSystemView0);
      // Undeclared exception!
      try { 
        task_26751_0.getFirstComponent(mockJFileChooser0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26751", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26751 task_26751_0 = new task_26751();
      // Undeclared exception!
      try { 
        task_26751_0.getFirstComponent((Container) null);
      } catch(IllegalArgumentException e) {
         //
         // Container cannot be null
         //
         verifyException("com.example.task_evaluated.task_26751", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26751 task_26751_0 = new task_26751();
      JInternalFrame jInternalFrame0 = new JInternalFrame("Invalid component index: ", false, false);
      Component component0 = task_26751_0.getFirstComponent(jInternalFrame0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_26751 task_26751_0 = new task_26751();
      JTextPane jTextPane0 = new JTextPane();
      // Undeclared exception!
      try { 
        task_26751_0.getFirstComponent(jTextPane0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Container has no components
         //
         verifyException("com.example.task_evaluated.task_26751", e);
      }
  }
}
