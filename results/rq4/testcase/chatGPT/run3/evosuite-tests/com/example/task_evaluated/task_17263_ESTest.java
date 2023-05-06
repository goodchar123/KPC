/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:19:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17263;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17263_ESTest extends task_17263_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(4).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(3).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(1444).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-5)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(1444).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(5).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(181).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "s8-5zL.V4ws5Sm");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((-6)).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, (String) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(6).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, (String) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(8).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(1444).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(605).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, (String) null);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSetMetaData0).getColumnType(anyInt());
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(resultSet0).findColumn(anyString());
      doReturn(resultSetMetaData0).when(resultSet0).getMetaData();
      boolean boolean0 = task_17263_0.isSignedNumber(resultSet0, "");
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      task_17263 task_17263_0 = new task_17263();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(resultSet0).findColumn(anyString());
      doReturn((ResultSetMetaData) null).when(resultSet0).getMetaData();
      // Undeclared exception!
      try { 
        task_17263_0.isSignedNumber(resultSet0, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17263", e);
      }
  }
}
