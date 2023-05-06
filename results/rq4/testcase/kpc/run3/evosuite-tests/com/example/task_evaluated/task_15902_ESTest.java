/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:32:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.example.task_evaluated.task_15902;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15902_ESTest extends task_15902_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15902 task_15902_0 = new task_15902();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((FileSystem) null).when(path0).getFileSystem();
      String string0 = task_15902.getFileOwner(path0);
  }
}
