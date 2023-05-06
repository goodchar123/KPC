/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:14:01 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9577;
import java.time.format.DateTimeParseException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9577_ESTest extends task_9577_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9577.parseDate("J@h0b[F0@AQF/#p");
      } catch(DateTimeParseException e) {
         //
         // Text 'J@h0b[F0@AQF/#p' could not be parsed at index 0
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9577 task_9577_0 = new task_9577();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9577.parseDate((String) null);
      } catch(NullPointerException e) {
         //
         // text
         //
         verifyException("java.util.Objects", e);
      }
  }
}
