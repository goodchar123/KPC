/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:47:53 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20477;
import java.sql.Date;
import java.sql.PreparedStatement;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20477_ESTest extends task_20477_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20477 task_20477_0 = new task_20477();
      Date date0 = new Date(0);
      // Undeclared exception!
      try { 
        task_20477_0.setSqlDateParameter((PreparedStatement) null, 0, date0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20477", e);
      }
  }
}