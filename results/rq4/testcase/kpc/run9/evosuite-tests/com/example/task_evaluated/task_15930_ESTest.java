/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:01:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15930;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15930_ESTest extends task_15930_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15930 task_15930_0 = new task_15930();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "TO~f,5{OG`sY-!H8zR";
      task_15930.writeToFile("TO~f,5{OG`sY-!H8zR", stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_15930.writeToFile("nbYk7k", (String[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_15930", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[5];
      try { 
        task_15930.writeToFile("", stringArray0);
      } catch(IOException e) {
         //
         // Error writing to file: null
         //
         verifyException("com.example.task_evaluated.task_15930", e);
      }
  }
}
