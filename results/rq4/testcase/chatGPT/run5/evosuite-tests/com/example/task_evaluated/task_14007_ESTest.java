/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:05:05 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14007;
import java.util.Formatter;
import javax.smartcardio.CardTerminals;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14007_ESTest extends task_14007_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14007 task_14007_0 = new task_14007();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Formatter.BigDecimalLayoutForm[] formatter_BigDecimalLayoutFormArray0 = new Formatter.BigDecimalLayoutForm[2];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(formatter_BigDecimalLayoutFormArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.EnumSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CardTerminals.State[] cardTerminals_StateArray0 = new CardTerminals.State[0];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(cardTerminals_StateArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }
}