/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:36:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29813;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.util.Vector;
import javax.swing.JDialog;
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
      Object[] objectArray0 = new Object[0];
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(objectArray0, 1093);
      JTable jTable0 = new JTable(defaultTableModel0);
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      Point point0 = gridBagLayout0.location((-1717), (-1717));
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel();
      JTable jTable0 = new JTable(defaultTableModel0);
      GridBagLayout gridBagLayout0 = new GridBagLayout();
      TableRowSorter<DefaultTableModel> tableRowSorter0 = new TableRowSorter<DefaultTableModel>();
      jTable0.setRowSorter(tableRowSorter0);
      Point point0 = gridBagLayout0.location(0, 0);
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
      Vector<JDialog> vector0 = new Vector<JDialog>();
      JTable jTable0 = new JTable(vector0, vector0);
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
