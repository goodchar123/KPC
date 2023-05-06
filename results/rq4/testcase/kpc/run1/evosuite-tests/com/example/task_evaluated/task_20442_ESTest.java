/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 16:29:51 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20442;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20442_ESTest extends task_20442_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20442 task_20442_0 = new task_20442();
      ParameterMetaData parameterMetaData0 = mock(ParameterMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameterMetaData0).getParameterCount();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(parameterMetaData0).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      try { 
        task_20442_0.setTimestampParameter(preparedStatement0, (-1), (Timestamp) null);
      } catch(SQLException e) {
         //
         // Invalid parameter index: -1
         //
         verifyException("com.example.task_evaluated.task_20442", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20442 task_20442_0 = new task_20442();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(preparedStatement0).isClosed();
      Timestamp timestamp0 = new Timestamp(0L);
      try { 
        task_20442_0.setTimestampParameter(preparedStatement0, (-3897), timestamp0);
      } catch(SQLException e) {
         //
         // PreparedStatement is closed
         //
         verifyException("com.example.task_evaluated.task_20442", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_20442 task_20442_0 = new task_20442();
      ParameterMetaData parameterMetaData0 = mock(ParameterMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(101).when(parameterMetaData0).getParameterCount();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(parameterMetaData0).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      Timestamp timestamp0 = new Timestamp(34L);
      task_20442_0.setTimestampParameter(preparedStatement0, 10, timestamp0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_20442 task_20442_0 = new task_20442();
      ParameterMetaData parameterMetaData0 = mock(ParameterMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(parameterMetaData0).getParameterCount();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(parameterMetaData0).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDateTime localDateTime0 = MockLocalDateTime.ofEpochSecond((-3310L), 1200, zoneOffset0);
      Timestamp timestamp0 = Timestamp.valueOf(localDateTime0);
      try { 
        task_20442_0.setTimestampParameter(preparedStatement0, 1200, timestamp0);
      } catch(SQLException e) {
         //
         // Invalid parameter index: 1200
         //
         verifyException("com.example.task_evaluated.task_20442", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_20442 task_20442_0 = new task_20442();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn((ParameterMetaData) null).when(preparedStatement0).getParameterMetaData();
      doReturn(false).when(preparedStatement0).isClosed();
      Timestamp timestamp0 = new Timestamp(3090);
      // Undeclared exception!
      try { 
        task_20442_0.setTimestampParameter(preparedStatement0, 3090, timestamp0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20442", e);
      }
  }
}