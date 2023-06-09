/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:57:50 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29813;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.util.Stack;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29813_ESTest extends task_29813_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      Stack<String> stack0 = new Stack<String>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(stack0, 92);
      DefaultTableColumnModel defaultTableColumnModel0 = new DefaultTableColumnModel();
      JList<Integer> jList0 = new JList<Integer>();
      ListSelectionModel listSelectionModel0 = jList0.getSelectionModel();
      JTable jTable0 = new JTable(defaultTableModel0, defaultTableColumnModel0, listSelectionModel0);
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      JTable jTable0 = new JTable();
      jTable0.setAutoCreateRowSorter(true);
      Point point0 = jTable0.getLocation();
      // Undeclared exception!
      try { 
        task_29813_0.getClosestRowAbove(jTable0, point0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid index
         //
         verifyException("javax.swing.DefaultRowSorter", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      // Undeclared exception!
      try { 
        task_29813_0.getClosestRowAbove((JTable) null, (Point) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29813", e);
      }
  }
}
