/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:45:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17267;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17267_ESTest extends task_17267_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17267 task_17267_0 = new task_17267();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((DatabaseMetaData) null).when(connection0).getMetaData();
      // Undeclared exception!
      try { 
        task_17267.getSchemaName(connection0, "", "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DatabaseMetaData databaseMetaData0 = mock(DatabaseMetaData.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSet) null).when(databaseMetaData0).getColumns(anyString() , anyString() , anyString() , anyString());
      doReturn((Connection) null).when(databaseMetaData0).getConnection();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn(databaseMetaData0).when(connection0).getMetaData();
      // Undeclared exception!
      try { 
        task_17267.getSchemaName(connection0, "", "!M@]KA");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
