/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:18:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_19132;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_19132_ESTest extends task_19132_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_19132 task_19132_0 = new task_19132();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(preparedStatement0).executeUpdate();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(preparedStatement0).when(connection0).prepareStatement(anyString());
      task_19132_0.insertEmptyRow(connection0, (String) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_19132 task_19132_0 = new task_19132();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((PreparedStatement) null).when(connection0).prepareStatement(anyString());
      // Undeclared exception!
      try { 
        task_19132_0.insertEmptyRow(connection0, "A9Ko'wpU:*%j_");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_19132", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_19132 task_19132_0 = new task_19132();
      // Undeclared exception!
      try { 
        task_19132_0.insertEmptyRow((Connection) null, "*1e8J,-");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_19132", e);
      }
  }
}
