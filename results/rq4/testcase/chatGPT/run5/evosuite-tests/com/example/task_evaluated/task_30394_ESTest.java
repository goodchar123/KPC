/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:30:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_30394;
import java.util.Vector;
import javax.swing.DefaultListCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_30394_ESTest extends task_30394_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_30394 task_30394_0 = new task_30394();
      // Undeclared exception!
      try { 
        task_30394_0.moveRows((DefaultTableModel) null, (-1), (-1), (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_30394 task_30394_0 = new task_30394();
      Vector<DefaultListCellRenderer> vector0 = new Vector<DefaultListCellRenderer>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(vector0, 0);
      // Undeclared exception!
      try { 
        task_30394_0.moveRows(defaultTableModel0, 0, 1, 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_30394 task_30394_0 = new task_30394();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      // Undeclared exception!
      try { 
        task_30394_0.moveRows(defaultTableModel0, 4647, (-1), 2743);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_30394", e);
      }
  }
}
