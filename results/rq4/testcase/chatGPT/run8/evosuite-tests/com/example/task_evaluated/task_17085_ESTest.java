/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:00:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17085;
import java.sql.ResultSetMetaData;
import javax.sql.rowset.CachedRowSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17085_ESTest extends task_17085_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17085 task_17085_0 = new task_17085();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(165).when(resultSetMetaData0).getColumnCount();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(resultSetMetaData0).getTableName(anyInt());
      CachedRowSet cachedRowSet0 = mock(CachedRowSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(cachedRowSet0).getMetaData();
      String string0 = task_17085_0.getTableName(cachedRowSet0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17085 task_17085_0 = new task_17085();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(207).when(resultSetMetaData0).getColumnCount();
      doReturn("", "", "", "", "&").when(resultSetMetaData0).getTableName(anyInt());
      CachedRowSet cachedRowSet0 = mock(CachedRowSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(cachedRowSet0).getMetaData();
      String string0 = task_17085_0.getTableName(cachedRowSet0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_17085 task_17085_0 = new task_17085();
      CachedRowSet cachedRowSet0 = mock(CachedRowSet.class, new ViolatedAssumptionAnswer());
      doReturn((ResultSetMetaData) null).when(cachedRowSet0).getMetaData();
      // Undeclared exception!
      try { 
        task_17085_0.getTableName(cachedRowSet0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17085", e);
      }
  }
}
