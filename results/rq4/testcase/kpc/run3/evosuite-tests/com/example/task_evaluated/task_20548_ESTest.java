/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:49:31 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20548;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20548_ESTest extends task_20548_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20548 task_20548_0 = new task_20548();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      DataOutputStream dataOutputStream0 = new DataOutputStream(pipedOutputStream0);
      try { 
        task_20548_0.writeAttribute(dataOutputStream0, "s");
      } catch(IOException e) {
         //
         // Error writing attribute to stream
         //
         verifyException("com.example.task_evaluated.task_20548", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20548 task_20548_0 = new task_20548();
      // Undeclared exception!
      try { 
        task_20548_0.writeAttribute((DataOutputStream) null, "com.example.task_evaluated.task_20548");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20548", e);
      }
  }
}
