/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:32:01 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18128;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18128_ESTest extends task_18128_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          task_18128 task_18128_0 = new task_18128();
          // Undeclared exception!
          try { 
            task_18128_0.getValueFromEngineScope("");
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             verifyException("com.example.task_evaluated.task_18128", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
