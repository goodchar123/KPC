/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:04:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14148;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14148_ESTest extends task_14148_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14148 task_14148_0 = new task_14148();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-965));
      Throwable throwable0 = mock(Throwable.class, new ViolatedAssumptionAnswer());
      Optional<Throwable> optional0 = Optional.of(throwable0);
      Predicate<Throwable> predicate0 = Predicate.isEqual((Object) integer0);
      Optional<Throwable> optional1 = optional0.filter(predicate0);
      // Undeclared exception!
      try { 
        task_14148.getValueOrThrow(optional1);
      } catch(NoSuchElementException e) {
         //
         // No value present
         //
         verifyException("com.example.task_evaluated.task_14148", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Optional<String> optional0 = Optional.of("; hq_YSuGbZGU5 $'");
      String string0 = task_14148.getValueOrThrow(optional0);
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