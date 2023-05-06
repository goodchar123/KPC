/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:52:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20814;
import java.sql.Date;
import java.sql.PreparedStatement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20814_ESTest extends task_20814_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20814 task_20814_0 = new task_20814();
      PreparedStatement preparedStatement0 = mock(PreparedStatement.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        task_20814_0.setSqlDateParameter(preparedStatement0, 2732, (Date) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Calendar", e);
      }
  }
}