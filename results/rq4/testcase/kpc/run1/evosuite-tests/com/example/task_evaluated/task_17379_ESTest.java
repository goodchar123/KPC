/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 17:31:42 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17379;
import java.io.FilterOutputStream;
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
      FilterOutputStream filterOutputStream0 = new FilterOutputStream((OutputStream) null);
      // Undeclared exception!
      try { 
        task_17379_0.writeAttributeToStream("$>4L@S", "", filterOutputStream0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.FilterOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17379 task_17379_0 = new task_17379();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        task_17379_0.writeAttributeToStream(";y+$$F1]Wp", ";y+$$F1]Wp", pipedOutputStream0);
      } catch(IOException e) {
         //
         // Error writing attribute to stream
         //
         verifyException("com.example.task_evaluated.task_17379", e);
      }
  }
}
