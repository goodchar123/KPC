/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:20:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35925;
import javax.swing.JTextArea;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35925_ESTest extends task_35925_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35925 task_35925_0 = new task_35925();
      JTextArea jTextArea0 = new JTextArea("");
      // Undeclared exception!
      try { 
        task_35925_0.setRows(jTextArea0, (-539));
      } catch(IllegalArgumentException e) {
         //
         // rows less than zero.
         //
         verifyException("javax.swing.JTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_35925 task_35925_0 = new task_35925();
      // Undeclared exception!
      try { 
        task_35925_0.setRows((JTextArea) null, 100);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35925", e);
      }
  }
}
