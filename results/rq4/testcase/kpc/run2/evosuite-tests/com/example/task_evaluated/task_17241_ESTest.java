/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 14:58:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17241;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17241_ESTest extends task_17241_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17241 task_17241_0 = new task_17241();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(connection0).isClosed();
      try { 
        task_17241_0.setAutoIncrement(connection0, (String) null, (String) null, false);
      } catch(SQLException e) {
         //
         // Connection is closed
         //
         verifyException("com.example.task_evaluated.task_17241", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17241 task_17241_0 = new task_17241();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((Statement) null).when(connection0).createStatement();
      doReturn(false).when(connection0).isClosed();
      try { 
        task_17241_0.setAutoIncrement(connection0, "VVt", "VVt", true);
      } catch(SQLException e) {
         //
         // Error executing SQL statement
         //
         verifyException("com.example.task_evaluated.task_17241", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_17241 task_17241_0 = new task_17241();
      try { 
        task_17241_0.setAutoIncrement((Connection) null, "M~`IPw,%JP=P;j", "", false);
      } catch(SQLException e) {
         //
         // Connection is closed
         //
         verifyException("com.example.task_evaluated.task_17241", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_17241 task_17241_0 = new task_17241();
      Statement statement0 = mock(Statement.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(statement0).executeUpdate(anyString());
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(statement0).when(connection0).createStatement();
      doReturn(false).when(connection0).isClosed();
      task_17241_0.setAutoIncrement(connection0, "ag%\"=U", "ag%\"=U", false);
  }
}