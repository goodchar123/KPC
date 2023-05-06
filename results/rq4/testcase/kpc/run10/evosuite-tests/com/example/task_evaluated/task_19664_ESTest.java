/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:29:47 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_19664;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_19664_ESTest extends task_19664_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_19664 task_19664_0 = new task_19664();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(threadGroup0).activeCount();
      // Undeclared exception!
      try { 
        task_19664.resumeThreadGroup(threadGroup0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_19664", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_19664.resumeThreadGroup((ThreadGroup) null);
      } catch(NullPointerException e) {
         //
         // thread group can't be null
         //
         verifyException("java.lang.SecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      doReturn(5925).when(threadGroup0).activeCount();
      doReturn(886).when(threadGroup0).enumerate(any(java.lang.Thread[].class));
      task_19664.resumeThreadGroup(threadGroup0);
      ThreadGroup threadGroup1 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      doReturn(5925).when(threadGroup1).activeCount();
      doReturn(886).when(threadGroup1).enumerate(any(java.lang.Thread[].class));
      // Undeclared exception!
      task_19664.resumeThreadGroup(threadGroup1);
  }
}
