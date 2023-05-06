/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 15:50:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17304;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17304_ESTest extends task_17304_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17304 task_17304_0 = new task_17304();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        task_17304.createRowSetFactory("`j\"]%zbiIdut`3zw");
      } catch(SQLException e) {
         //
         // Failed to create RowSetFactory instance
         //
         verifyException("com.example.task_evaluated.task_17304", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      try { 
        task_17304.createRowSetFactory((String) null);
      } catch(SQLException e) {
         //
         // Factory class name cannot be null
         //
         verifyException("com.example.task_evaluated.task_17304", e);
      }
  }
}
