/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:43:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17075;
import java.sql.ResultSetMetaData;
import java.util.Collection;
import java.util.Map;
import javax.sql.rowset.CachedRowSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17075_ESTest extends task_17075_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17075 task_17075_0 = new task_17075();
      ResultSetMetaData resultSetMetaData0 = mock(ResultSetMetaData.class, new ViolatedAssumptionAnswer());
      doReturn(2649).when(resultSetMetaData0).getColumnCount();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(resultSetMetaData0).getColumnName(anyInt());
      CachedRowSet cachedRowSet0 = mock(CachedRowSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData0).when(cachedRowSet0).getMetaData();
      doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(cachedRowSet0).getObject(anyInt());
      doReturn(true, false).when(cachedRowSet0).next();
      Collection<Map<String, Object>> collection0 = task_17075_0.convertCachedRowSetToCollection(cachedRowSet0);
      ResultSetMetaData resultSetMetaData1 = null;
      CachedRowSet cachedRowSet1 = mock(CachedRowSet.class, new ViolatedAssumptionAnswer());
      doReturn(resultSetMetaData1).when(cachedRowSet1).getMetaData();
      // Undeclared exception!
      try { 
        task_17075_0.convertCachedRowSetToCollection(cachedRowSet1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
