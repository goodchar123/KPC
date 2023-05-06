/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 18:13:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17244;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17244_ESTest extends task_17244_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17244 task_17244_0 = new task_17244();
      // Undeclared exception!
      try { 
        task_17244_0.setCashValue((Connection) null, "", "T<&", false, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17244 task_17244_0 = new task_17244();
      Connection connection0 = mock(Connection.class, new ViolatedAssumptionAnswer());
      doReturn((PreparedStatement) null).when(connection0).prepareStatement(anyString());
      // Undeclared exception!
      try { 
        task_17244_0.setCashValue(connection0, "", "", true, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
