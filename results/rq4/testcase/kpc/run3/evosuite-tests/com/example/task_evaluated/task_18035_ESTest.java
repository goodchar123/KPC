/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 05:33:11 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18035;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18035_ESTest extends task_18035_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18035 task_18035_0 = new task_18035();
      try { 
        task_18035_0.partiallyResolveName(" QZ0F6Ybe,)K");
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid name format
         //
         verifyException("com.example.task_evaluated.task_18035", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18035 task_18035_0 = new task_18035();
      try { 
        task_18035_0.partiallyResolveName("iT");
      } catch(PatternSyntaxException e) {
         //
         // Invalid name format
         // iT
         //
         verifyException("com.example.task_evaluated.task_18035", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18035 task_18035_0 = new task_18035();
      String string0 = task_18035_0.partiallyResolveName("T: UGDJQYU**{y&VMs");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_18035 task_18035_0 = new task_18035();
      // Undeclared exception!
      try { 
        task_18035_0.partiallyResolveName((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18035", e);
      }
  }
}
