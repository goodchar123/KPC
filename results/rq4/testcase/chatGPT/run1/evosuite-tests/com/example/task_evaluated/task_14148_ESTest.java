/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:16:22 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14148;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14148_ESTest extends task_14148_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14148 task_14148_0 = new task_14148();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Optional<Object> optional0 = Optional.empty();
      // Undeclared exception!
      try { 
        task_14148.getValueOrThrow(optional0);
      } catch(NoSuchElementException e) {
         //
         // No value present
         //
         verifyException("com.example.task_evaluated.task_14148", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Optional<Object> optional0 = Optional.ofNullable((Object) "O");
      Object object0 = task_14148.getValueOrThrow(optional0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14148.getValueOrThrow((Optional<Object>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14148", e);
      }
  }
}
