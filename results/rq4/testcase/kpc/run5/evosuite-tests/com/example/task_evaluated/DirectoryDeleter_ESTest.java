/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:49:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.DirectoryDeleter;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DirectoryDeleter_ESTest extends DirectoryDeleter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DirectoryDeleter directoryDeleter0 = new DirectoryDeleter();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        DirectoryDeleter.deleteDirectory((File) null);
      } catch(SecurityException e) {
         //
         // Access denied to read directory
         //
         verifyException("com.example.task_evaluated.DirectoryDeleter", e);
      }
  }
}