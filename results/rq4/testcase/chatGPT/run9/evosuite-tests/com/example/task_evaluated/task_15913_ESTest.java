/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:31:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_15913;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15913_ESTest extends task_15913_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15913 task_15913_0 = new task_15913();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = task_15913.isFileWritable((File) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = MockFile.createTempFile("1N_]", "1N_]", (File) null);
      boolean boolean0 = task_15913.isFileWritable(file0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = MockFile.createTempFile("1N_]", "1N_]", (File) null);
      MockFile mockFile0 = new MockFile(file0, "1N_]");
      boolean boolean0 = task_15913.isFileWritable(mockFile0);
  }
}
