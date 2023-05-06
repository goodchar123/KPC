/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:59:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29813;
import java.awt.Point;
import java.util.Vector;
import javax.swing.JTable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29813_ESTest extends task_29813_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29813 task_29813_0 = new task_29813();
      Vector<Object> vector0 = new Vector<Object>();
      JTable jTable0 = new JTable(vector0, vector0);
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
      Point point0 = new Point();
      JTable jTable0 = new JTable(0, 0);
      jTable0.setAutoCreateRowSorter(true);
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
      Point point0 = new Point();
      JTable jTable0 = new JTable(291, 0);
      jTable0.setAutoCreateRowSorter(true);
      task_29813 task_29813_0 = new task_29813();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Point point0 = new Point();
      point0.setLocation(197, 197);
      JTable jTable0 = new JTable(197, 197);
      jTable0.setAutoCreateRowSorter(true);
      task_29813 task_29813_0 = new task_29813();
      int int0 = task_29813_0.getClosestRowAbove(jTable0, point0);
  }
}