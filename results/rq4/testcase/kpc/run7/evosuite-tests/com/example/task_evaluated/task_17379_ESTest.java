/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:49:20 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17379;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17379_ESTest extends task_17379_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17379 task_17379_0 = new task_17379();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        task_17379_0.writeAttributeToStream("", "=\"", pipedOutputStream0);
      } catch(IOException e) {
         //
         // Error writing attribute to stream
         //
         verifyException("com.example.task_evaluated.task_17379", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17379 task_17379_0 = new task_17379();
      // Undeclared exception!
      try { 
        task_17379_0.writeAttributeToStream("", "", (OutputStream) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17379", e);
      }
  }
}
