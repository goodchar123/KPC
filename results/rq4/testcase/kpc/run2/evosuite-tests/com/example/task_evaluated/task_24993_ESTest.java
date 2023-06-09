/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 20:27:52 GMT 2023
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
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_24993_ESTest extends task_24993_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_24993 task_24993_0 = new task_24993();
      JLayer<JInternalFrame.JDesktopIcon> jLayer0 = new JLayer<JInternalFrame.JDesktopIcon>();
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jLayer0, jLayer0, jLayer0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid component index
         //
         verifyException("com.example.task_evaluated.task_24993", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JInternalFrame jInternalFrame0 = new JInternalFrame();
      JInternalFrame.JDesktopIcon jInternalFrame_JDesktopIcon0 = new JInternalFrame.JDesktopIcon(jInternalFrame0);
      JLayer<JInternalFrame.JDesktopIcon> jLayer0 = new JLayer<JInternalFrame.JDesktopIcon>(jInternalFrame_JDesktopIcon0);
      task_24993 task_24993_0 = new task_24993();
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent(jLayer0, jInternalFrame_JDesktopIcon0, jInternalFrame_JDesktopIcon0);
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
      JInternalFrame jInternalFrame0 = new JInternalFrame("Invalid component index", true, true, true);
      // Undeclared exception!
      try { 
        task_24993_0.replaceComponent((Container) null, (Component) null, jInternalFrame0);
      } catch(NullPointerException e) {
         //
         // Old component cannot be null
         //
         verifyException("java.util.Objects", e);
      }
  }
}
