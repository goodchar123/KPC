/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:20:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2925;
import java.nio.file.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2925_ESTest extends task_2925_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2925 task_2925_0 = new task_2925();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(path0).toString();
      Path path1 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn(path0).when(path1).getFileName();
      // Undeclared exception!
      try { 
        task_2925.inferModuleName(path1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2925", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn("com.example.task_evaluated.task_2925").when(path0).toString();
      Path path1 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn(path0).when(path1).getFileName();
      String string0 = task_2925.inferModuleName(path1);
  }
}
