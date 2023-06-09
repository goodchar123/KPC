/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:40:22 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29813;
import java.awt.GridBagLayout;
import java.awt.Point;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29813_ESTest extends task_29813_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      JTable jTable0 = new JTable(1, 1);
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.getLayoutOrigin();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable(defaultTableModel0);
      jTable0.setAutoCreateRowSorter(true);
      Point point0 = new Point(0, 0);
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
      JTable jTable0 = new JTable();
      // Undeclared exception!
      try { 
        task_29813_0.getClosestRowAbove(jTable0, (Point) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.swing.JTable", e);
      }
  }
}
