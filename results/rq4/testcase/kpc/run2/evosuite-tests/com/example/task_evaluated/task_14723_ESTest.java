/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 15:08:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14723;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14723_ESTest extends task_14723_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14723 task_14723_0 = new task_14723();
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      // Undeclared exception!
      try { 
        task_14723_0.getNextInt(iterator0);
      } catch(NoSuchElementException e) {
         //
         // No more elements in the iteration.
         //
         verifyException("com.example.task_evaluated.task_14723", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14723 task_14723_0 = new task_14723();
      Iterator<Integer> iterator0 = (Iterator<Integer>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      // Undeclared exception!
      try { 
        task_14723_0.getNextInt(iterator0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14723", e);
      }
  }
}
