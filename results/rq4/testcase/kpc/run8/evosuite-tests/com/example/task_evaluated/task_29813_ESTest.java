/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:01:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29813;
import java.awt.Point;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29813_ESTest extends task_29813_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      JTable jTable0 = new JTable();
      // Undeclared exception!
      try { 
        task_29813_0.getClosestRowAbove(jTable0, (Point) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29813", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JTable jTable0 = new JTable();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>(defaultTableModel0);
      jTable0.setRowSorter(tableRowSorter0);
      Point point0 = new Point((-1285), 2685);
      task_29813 task_29813_0 = new task_29813();
      // Undeclared exception!
      try { 
        task_29813_0.getClosestRowAbove(jTable0, point0);
      } catch(IndexOutOfBoundsException e) {
         //
         // View row index out of bounds: -1
         //
         verifyException("com.example.task_evaluated.task_29813", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JTable jTable0 = new JTable();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      defaultTableModel0.setNumRows(530);
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>(defaultTableModel0);
      jTable0.setRowSorter(tableRowSorter0);
      Point point0 = new Point((-1285), 2685);
      task_29813 task_29813_0 = new task_29813();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JTable jTable0 = new JTable();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1288, 0);
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>(defaultTableModel0);
      jTable0.setRowSorter(tableRowSorter0);
      Point point0 = new Point();
      task_29813 task_29813_0 = new task_29813();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }
}