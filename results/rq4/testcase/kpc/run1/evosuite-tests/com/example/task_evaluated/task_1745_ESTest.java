/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 14:54:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1745;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1745_ESTest extends task_1745_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1745 task_1745_0 = new task_1745();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1745.getMember((String) null, "");
      } catch(NullPointerException e) {
         //
         // Object name and member name cannot be null.
         //
         verifyException("com.example.task_evaluated.task_1745", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          // Undeclared exception!
          try { 
            task_1745.getMember("", "");
          } catch(NullPointerException e) {
             //
             // Script engine not found.
             //
             verifyException("com.example.task_evaluated.task_1745", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1745.getMember("", (String) null);
      } catch(NullPointerException e) {
         //
         // Object name and member name cannot be null.
         //
         verifyException("com.example.task_evaluated.task_1745", e);
      }
  }
}
