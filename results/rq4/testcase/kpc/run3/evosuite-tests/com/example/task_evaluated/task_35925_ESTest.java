/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 04:55:53 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35925;
import javax.swing.JTextArea;
import javax.swing.text.Document;
import javax.swing.text.StyledEditorKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35925_ESTest extends task_35925_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35925 task_35925_0 = new task_35925();
      StyledEditorKit styledEditorKit0 = new StyledEditorKit();
      Document document0 = styledEditorKit0.createDefaultDocument();
      JTextArea jTextArea0 = new JTextArea(document0);
      // Undeclared exception!
      try { 
        task_35925_0.setRows(jTextArea0, (-271));
      } catch(IllegalArgumentException e) {
         //
         // Number of rows cannot be negative.
         //
         verifyException("com.example.task_evaluated.task_35925", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_35925 task_35925_0 = new task_35925();
      // Undeclared exception!
      try { 
        task_35925_0.setRows((JTextArea) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35925", e);
      }
  }
}