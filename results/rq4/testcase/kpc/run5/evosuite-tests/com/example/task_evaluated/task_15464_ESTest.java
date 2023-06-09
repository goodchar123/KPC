/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:42:40 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15464;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15464_ESTest extends task_15464_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_15464.parseText("", (DateTimeFormatter) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_15464", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_15464 task_15464_0 = new task_15464();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FormatStyle formatStyle0 = FormatStyle.MEDIUM;
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofLocalizedDateTime(formatStyle0, formatStyle0);
      try { 
        task_15464.parseText("fHM*a|z+rLe)$PgX", dateTimeFormatter0);
      } catch(DateTimeParseException e) {
         //
         // Text 'fHM*a|z+rLe)$PgX' could not be parsed at index 0
         //
         verifyException("java.time.format.DateTimeFormatter", e);
      }
  }
}
