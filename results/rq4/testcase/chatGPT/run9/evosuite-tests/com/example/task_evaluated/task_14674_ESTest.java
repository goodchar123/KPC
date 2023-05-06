/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:14:22 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14674;
import java.nio.LongBuffer;
import java.util.BitSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14674_ESTest extends task_14674_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14674 task_14674_0 = new task_14674();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LongBuffer longBuffer0 = LongBuffer.allocate(0);
      BitSet bitSet0 = BitSet.valueOf(longBuffer0);
      // Undeclared exception!
      try { 
        task_14674.setBitsToTrue(bitSet0, 1, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // fromIndex: 1 > toIndex: 0
         //
         verifyException("java.util.BitSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14674.setBitsToTrue((BitSet) null, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14674", e);
      }
  }
}
