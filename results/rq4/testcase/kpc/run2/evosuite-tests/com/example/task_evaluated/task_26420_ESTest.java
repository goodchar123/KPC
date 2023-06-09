/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 18:39:00 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import java.awt.Panel;
import javax.swing.JLayer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Panel panel0 = new Panel();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(panel0, 3224, 4165);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4165
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JLayer<DefaultTableCellRenderer> jLayer0 = new JLayer<DefaultTableCellRenderer>();
      task_26420 task_26420_0 = new task_26420();
      task_26420_0.deleteComponentsInRange(jLayer0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      JTable jTable0 = new JTable();
      JTableHeader jTableHeader0 = jTable0.getTableHeader();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jTableHeader0, 0, (-1829));
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange((Container) null, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}
