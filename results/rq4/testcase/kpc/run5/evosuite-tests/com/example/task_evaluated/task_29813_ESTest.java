/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:34:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29813;
import java.awt.Point;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29813_ESTest extends task_29813_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JTable jTable0 = new JTable();
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>();
      jTable0.setRowSorter(tableRowSorter0);
      task_29813 task_29813_0 = new task_29813();
      JViewport jViewport0 = new JViewport();
      Point point0 = jViewport0.getViewPosition();
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
  public void test1()  throws Throwable  {
      JTable jTable0 = new JTable();
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(205, 205);
      tableRowSorter0.setModel(defaultTableModel0);
      jTable0.setRowSorter(tableRowSorter0);
      task_29813 task_29813_0 = new task_29813();
      Point point0 = jTable0.getLocation();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JTable jTable0 = new JTable();
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(205, 205);
      tableRowSorter0.setModel(defaultTableModel0);
      jTable0.setRowSorter(tableRowSorter0);
      task_29813 task_29813_0 = new task_29813();
      Point point0 = jTable0.getLocation();
      point0.y = 3071;
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JTable jTable0 = new JTable();
      task_29813 task_29813_0 = new task_29813();
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
}
