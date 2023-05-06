/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 14:45:08 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17842;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17842_ESTest extends task_17842_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17842 task_17842_0 = new task_17842();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17842.createPrefixName("81", 1125);
      } catch(IllegalArgumentException e) {
         //
         // Invalid prefix length
         //
         verifyException("com.example.task_evaluated.task_17842", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17842.createPrefixName((String) null, 1);
      } catch(NullPointerException e) {
         //
         // Original name cannot be null
         //
         verifyException("com.example.task_evaluated.task_17842", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17842.createPrefixName("", (-847));
      } catch(IllegalArgumentException e) {
         //
         // Invalid prefix length
         //
         verifyException("com.example.task_evaluated.task_17842", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17842.createPrefixName("^|<8E`|[Lh+XMI7M", 0);
      } catch(NullPointerException e) {
         //
         // Prefix components cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_17842", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = task_17842.createPrefixName("9$H>SZjse9", 1);
  }
}
