/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:46:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_21156;
import javax.xml.stream.util.StreamReaderDelegate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_21156_ESTest extends task_21156_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_21156 task_21156_0 = new task_21156();
      StreamReaderDelegate streamReaderDelegate0 = new StreamReaderDelegate();
      // Undeclared exception!
      try { 
        task_21156_0.getNextBigDecimal(streamReaderDelegate0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.xml.stream.util.StreamReaderDelegate", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_21156 task_21156_0 = new task_21156();
      StreamReaderDelegate streamReaderDelegate0 = new StreamReaderDelegate();
      streamReaderDelegate0.setParent(streamReaderDelegate0);
      // Undeclared exception!
      try { 
        task_21156_0.getNextBigDecimal(streamReaderDelegate0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
