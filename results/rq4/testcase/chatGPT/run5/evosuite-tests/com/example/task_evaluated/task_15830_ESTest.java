/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:47:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15830;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15830_ESTest extends task_15830_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15830 task_15830_0 = new task_15830();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("path/to/directory");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      String[] stringArray0 = new String[6];
      task_15830.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      // Undeclared exception!
      try { 
        task_15830.deleteDirectory(mockFile0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("path/to/directory");
      boolean boolean0 = FileSystemHandling.createFolder(evoSuiteFile0);
      boolean boolean1 = FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile mockFile0 = new MockFile("", "");
      // Undeclared exception!
      task_15830.deleteDirectory(mockFile0);
  }
}
