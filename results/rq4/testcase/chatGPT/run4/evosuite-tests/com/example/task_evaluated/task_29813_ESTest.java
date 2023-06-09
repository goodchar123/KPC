/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:19:41 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29813;
import java.awt.Button;
import java.awt.Point;
import java.awt.event.MouseWheelEvent;
import java.util.Stack;
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
      DefaultTableModel defaultTableModel0 = new DefaultTableModel(1, 1);
      JTable jTable0 = new JTable(defaultTableModel0);
      MouseWheelEvent mouseWheelEvent0 = new MouseWheelEvent(jTable0, 1, 1, 1, 1, 1, 1, 1, (-1021), false, (-1021), 1991, 1);
      Point point0 = mouseWheelEvent0.getLocationOnScreen();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      JTable jTable0 = new JTable();
      jTable0.setAutoCreateRowSorter(true);
      Point point0 = new Point();
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
      Stack<Button> stack0 = new Stack<Button>();
      JTable jTable0 = new JTable(stack0, stack0);
      // Undeclared exception!
      try { 
        task_29813_0.getClosestRowAbove(jTable0, (Point) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
