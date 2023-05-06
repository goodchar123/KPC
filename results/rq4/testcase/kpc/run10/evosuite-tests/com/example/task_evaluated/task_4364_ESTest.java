/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:52:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4364;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4364_ESTest extends task_4364_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4364 task_4364_0 = new task_4364();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset("", (String) null, (-461));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: -461
         //
         verifyException("com.example.task_evaluated.task_4364", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset("", "", 2485);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: 2485
         //
         verifyException("com.example.task_evaluated.task_4364", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset((String) null, (String) null, 527);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_4364", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4364.insertStringAtOffset("sY9", "Pk`=cg.+'[", 2);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 4
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
}