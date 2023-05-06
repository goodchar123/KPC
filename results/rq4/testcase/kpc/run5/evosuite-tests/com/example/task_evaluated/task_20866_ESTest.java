/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:36:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20866;
import java.sql.Connection;
import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20866_ESTest extends task_20866_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20866 task_20866_0 = new task_20866();
      try { 
        task_20866_0.commitAndReleaseLocks((Connection) null);
      } catch(SQLException e) {
         //
         // Connection is closed
         //
         verifyException("com.example.task_evaluated.task_20866", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20866 task_20866_0 = new task_20866();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(connection0).getAutoCommit();
      doReturn(false).when(connection0).isClosed();
      task_20866_0.commitAndReleaseLocks(connection0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_20866 task_20866_0 = new task_20866();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(connection0).isClosed();
      try { 
        task_20866_0.commitAndReleaseLocks(connection0);
      } catch(SQLException e) {
         //
         // Connection is closed
         //
         verifyException("com.example.task_evaluated.task_20866", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_20866 task_20866_0 = new task_20866();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(connection0).getAutoCommit();
      doReturn(false).when(connection0).isClosed();
      try { 
        task_20866_0.commitAndReleaseLocks(connection0);
      } catch(SQLException e) {
         //
         // Error committing changes
         //
         verifyException("com.example.task_evaluated.task_20866", e);
      }
  }
}