/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:53:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20579;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20579_ESTest extends task_20579_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20579 task_20579_0 = new task_20579();
      ResultSet resultSet0 = mock(ResultSet.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(resultSet0).isClosed();
      doReturn(false).when(resultSet0).next();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn(resultSet0).when(preparedStatement0).executeQuery();
      doReturn(false).when(preparedStatement0).isClosed();
      byte byte0 = task_20579_0.getTinyIntParameter(preparedStatement0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20579 task_20579_0 = new task_20579();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_20579 task_20579_0 = new task_20579();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(preparedStatement0).executeQuery();
      // Undeclared exception!
      try { 
        task_20579_0.getTinyIntParameter(preparedStatement0, (byte)0, (byte)0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_20579 task_20579_0 = new task_20579();
      // Undeclared exception!
      try { 
        task_20579_0.getTinyIntParameter((PreparedStatement) null, (-1), (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
