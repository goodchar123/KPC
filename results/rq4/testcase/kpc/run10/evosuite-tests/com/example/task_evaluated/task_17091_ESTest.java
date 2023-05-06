/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:47:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17091;
import javax.sql.rowset.CachedRowSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17091_ESTest extends task_17091_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17091 task_17091_0 = new task_17091();
      CachedRowSet cachedRowSet0 = mock(CachedRowSet.class, new ViolatedAssumptionAnswer());
      doReturn((CachedRowSet) null).when(cachedRowSet0).createCopy();
      // Undeclared exception!
      try { 
        task_17091_0.createEmptyCopy(cachedRowSet0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17091", e);
      }
  }
}
