/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:59:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20477;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.Clock;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20477_ESTest extends task_20477_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20477 task_20477_0 = new task_20477();
      Clock clock0 = MockClock.systemUTC();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Date date0 = Date.valueOf(localDate0);
      // Undeclared exception!
      try { 
        task_20477_0.setSqlDateParameter((PreparedStatement) null, (-1172), date0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20477", e);
      }
  }
}
