/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:55:28 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_25482;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_25482_ESTest extends task_25482_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_25482 task_25482_0 = new task_25482();
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JTableHeader jTableHeader0 = new JTableHeader(defaultTableColumnModel0);
      // Undeclared exception!
      try { 
        task_25482_0.getFirstComponent(jTableHeader0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_25482", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      task_25482 task_25482_0 = new task_25482();
      // Undeclared exception!
      try { 
        task_25482_0.getFirstComponent(jTextPane0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // No such child: 0
         //
         verifyException("java.awt.Container", e);
      }
  }
}