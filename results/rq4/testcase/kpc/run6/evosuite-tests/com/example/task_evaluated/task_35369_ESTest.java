/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:42:20 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35369;
import java.awt.HeadlessException;
import javax.swing.DefaultListCellRenderer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35369_ESTest extends task_35369_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35369 task_35369_0 = new task_35369();
      DefaultListCellRenderer.UIResource defaultListCellRenderer_UIResource0 = new DefaultListCellRenderer.UIResource();
      try { 
        task_35369_0.getMousePosition(defaultListCellRenderer_UIResource0);
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35369", e);
      }
  }
}