/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:55:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35369;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.JButton;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35369_ESTest extends task_35369_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35369 task_35369_0 = new task_35369();
      JButton jButton0 = new JButton((Icon) null);
      try { 
        task_35369_0.getMousePosition(jButton0);
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35369", e);
      }
  }
}
