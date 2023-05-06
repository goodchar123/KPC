/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:02:41 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20345;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20345_ESTest extends task_20345_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20345 task_20345_0 = new task_20345();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((DatabaseMetaData) null).when(connection0).getMetaData();
      doReturn(false).when(connection0).isClosed();
      // Undeclared exception!
      try { 
        task_20345_0.setNullable(connection0, "", "", true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20345 task_20345_0 = new task_20345();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(connection0).isClosed();
      try { 
        task_20345_0.setNullable(connection0, ":", ":", true);
      } catch(SQLException e) {
         //
         // Connection is closed
         //
         verifyException("com.example.task_evaluated.task_20345", e);
      }
  }
}
