/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:34:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35927;
import javax.swing.JTextArea;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35927_ESTest extends task_35927_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35927 task_35927_0 = new task_35927();
      JTextArea jTextArea0 = new JTextArea("WS$0nV");
      // Undeclared exception!
      try { 
        task_35927_0.setColumns(jTextArea0, (-1689));
      } catch(IllegalArgumentException e) {
         //
         // columns less than zero.
         //
         verifyException("javax.swing.JTextArea", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_35927 task_35927_0 = new task_35927();
      // Undeclared exception!
      try { 
        task_35927_0.setColumns((JTextArea) null, (-3210));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35927", e);
      }
  }
}