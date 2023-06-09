/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:04:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15888;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15888_ESTest extends task_15888_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15888 task_15888_0 = new task_15888();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_15888.moveOrRenameFile("zs#)YWiB+*HXGOF", "Target file already exists. Cannot rename/move file.");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_15888.moveOrRenameFile("", "Z8");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("z0+:6qZfyCc$k!");
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "Target file already exists. Cannot rename/move file.");
      task_15888.moveOrRenameFile("z0+:6qZfyCc$k!", "z0+:6qZfyCc$k!");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("z0+:6qZfyCc$k!");
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "Target file already exists. Cannot rename/move file.");
      task_15888.moveOrRenameFile("z0+:6qZfyCc$k!", "M@4,PL`dN*3^?2QT};");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_15888.moveOrRenameFile((String) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}
