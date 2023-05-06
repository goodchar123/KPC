/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:30:42 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17263;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17263_ESTest extends task_17263_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      try { 
        task_17263_0.isSignedNumber(resultSet0, "DR]}`<6 WZ");
      } catch(SQLException e) {
         //
         // Error checking if column is a signed number: Result set metadata is null
         //
         verifyException("com.example.task_evaluated.task_17263", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(resultSet0).isClosed();
      try { 
        task_17263_0.isSignedNumber(resultSet0, "");
      } catch(SQLException e) {
         //
         // Error checking if column is a signed number: Result set is closed
         //
         verifyException("com.example.task_evaluated.task_17263", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(2480).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "0x5xHc`au|%PF");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(1489).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "W");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-5)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(3999).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, (String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "W");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-6)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn((-6)).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "\"o");
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "0x5xHc`au|%PF");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "0x5xHc`au|%PF");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "0x5xHc`au|%PF");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      doReturn(false).when(resultSet0).isClosed();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      // Undeclared exception!
      try { 
        task_17263_0.isSignedNumber((ResultSet) null, "5B%v");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17263", e);
      }
  }
}
