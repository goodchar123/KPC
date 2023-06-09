/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:58:38 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20543;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.sql.Date;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20543_ESTest extends task_20543_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20543 task_20543_0 = new task_20543();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        task_20543_0.writeDateAttribute(dataOutputStream0, (Date) null);
      } catch(IOException e) {
         //
         // Error writing date attribute to stream
         //
         verifyException("com.example.task_evaluated.task_20543", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20543 task_20543_0 = new task_20543();
      DataOutputStream dataOutputStream0 = new DataOutputStream((OutputStream) null);
      LocalDate localDate0 = MockLocalDate.now();
      Date date0 = Date.valueOf(localDate0);
      // Undeclared exception!
      try { 
        task_20543_0.writeDateAttribute(dataOutputStream0, date0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataOutputStream", e);
      }
  }
}
