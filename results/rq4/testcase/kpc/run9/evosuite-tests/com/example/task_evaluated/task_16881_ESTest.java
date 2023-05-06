/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:54:34 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_16881;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16881_ESTest extends task_16881_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16881 task_16881_0 = new task_16881();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      BigDecimal bigDecimal1 = task_16881.removeTrailingZeros(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
      MathContext mathContext0 = MathContext.DECIMAL32;
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0, (-2026), mathContext0);
      // Undeclared exception!
      try { 
        task_16881.removeTrailingZeros(bigDecimal0);
      } catch(ArithmeticException e) {
         //
         // Scale overflow
         //
         verifyException("com.example.task_evaluated.task_16881", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_16881.removeTrailingZeros((BigDecimal) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_16881", e);
      }
  }
}
