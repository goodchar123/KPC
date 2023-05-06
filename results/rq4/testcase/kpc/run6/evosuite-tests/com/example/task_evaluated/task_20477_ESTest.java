/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:54:38 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20477;
import java.sql.Date;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20477_ESTest extends task_20477_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20477 task_20477_0 = new task_20477();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        task_20477_0.setSqlDateParameter(preparedStatement0, (-2293), (Date) null);
      } catch(NullPointerException e) {
         //
         // Date cannot be null
         //
         verifyException("com.example.task_evaluated.task_20477", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParameterMetaData parameterMetaData0 = mock(ParameterMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameterMetaData0).getParameterCount();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(parameterMetaData0).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      Date date0 = new Date(2771L);
      task_20477 task_20477_0 = new task_20477();
      try { 
        task_20477_0.setSqlDateParameter(preparedStatement0, 1460, date0);
      } catch(SQLException e) {
         //
         // Invalid parameter index
         //
         verifyException("com.example.task_evaluated.task_20477", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_20477 task_20477_0 = new task_20477();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(preparedStatement0).isClosed();
      Date date0 = new Date(0L);
      try { 
        task_20477_0.setSqlDateParameter(preparedStatement0, (-1199), date0);
      } catch(SQLException e) {
         //
         // PreparedStatement is closed
         //
         verifyException("com.example.task_evaluated.task_20477", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_20477 task_20477_0 = new task_20477();
      ParameterMetaData parameterMetaData0 = mock(ParameterMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameterMetaData0).getParameterCount();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(parameterMetaData0).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      Date date0 = new Date((-1L));
      try { 
        task_20477_0.setSqlDateParameter(preparedStatement0, (-1), date0);
      } catch(SQLException e) {
         //
         // Invalid parameter index
         //
         verifyException("com.example.task_evaluated.task_20477", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_20477 task_20477_0 = new task_20477();
      ParameterMetaData parameterMetaData0 = mock(ParameterMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(3426).when(parameterMetaData0).getParameterCount();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(parameterMetaData0).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      Date date0 = new Date(1);
      task_20477_0.setSqlDateParameter(preparedStatement0, 1, date0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_20477 task_20477_0 = new task_20477();
      Date date0 = new Date(1);
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn((ParameterMetaData) null).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      // Undeclared exception!
      try { 
        task_20477_0.setSqlDateParameter(preparedStatement0, (-3182), date0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20477", e);
      }
  }
}
