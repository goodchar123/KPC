/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:04:38 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15798;
import java.net.URI;
import java.nio.file.ProviderNotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15798_ESTest extends task_15798_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15798 task_15798_0 = new task_15798();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URI uRI0 = MockURI.URI((String) null, (String) null, (String) null, 1, (String) null, "n0rY s@)'YVGS", "com.example.task_evaluated.task_15798");
      // Undeclared exception!
      try { 
        task_15798.newFileSystem(uRI0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.file.FileSystems", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      // Undeclared exception!
      try { 
        task_15798.newFileSystem(uRI0);
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      URI uRI0 = MockURI.aHttpURI;
      // Undeclared exception!
      try { 
        task_15798.newFileSystem(uRI0);
      } catch(ProviderNotFoundException e) {
         //
         // Provider \"http\" not found
         //
         verifyException("java.nio.file.FileSystems", e);
      }
  }
}
