/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 15:07:12 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9869;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9869_ESTest extends task_9869_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9869 task_9869_0 = new task_9869();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        task_9869_0.writeStringToOutputStream("", pipedOutputStream0);
      } catch(IOException e) {
         //
         // Error writing to output stream
         //
         verifyException("com.example.task_evaluated.task_9869", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9869 task_9869_0 = new task_9869();
      // Undeclared exception!
      try { 
        task_9869_0.writeStringToOutputStream("8k5H#Ea\"})<6l5^", (OutputStream) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9869", e);
      }
  }
}
