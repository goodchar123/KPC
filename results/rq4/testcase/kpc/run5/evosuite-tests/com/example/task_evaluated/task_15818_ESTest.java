/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:28:43 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15818;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15818_ESTest extends task_15818_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15818.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_15818 task_15818_0 = new task_15818();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_15818.visitDirectory((File) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("P5WT3/OCy5^");
      boolean boolean0 = mockFile0.mkdirs();
      File file0 = MockFile.createTempFile("P5WT3/OCy5^", "", (File) mockFile0);
      MockFile mockFile1 = new MockFile("", "");
      // Undeclared exception!
      task_15818.visitDirectory(mockFile1);
  }
}