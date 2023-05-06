/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 04:56:26 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9366;
import java.time.DateTimeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9366_ESTest extends task_9366_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9366.getJapaneseDate((-211), 0, (-211), (-211));
      } catch(DateTimeException e) {
         //
         // Invalid Japanese date: Invalid era: -211
         //
         verifyException("com.example.task_evaluated.task_9366", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9366 task_9366_0 = new task_9366();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9366.getJapaneseDate(0, (-1907), (-1907), (-1907));
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }
}
