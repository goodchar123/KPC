/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:35:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1361;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1361_ESTest extends task_1361_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1361 task_1361_0 = new task_1361();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_1361.removeFieldFromDescriptor("z", "z");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_1361.removeFieldFromDescriptor("", "z");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_1361.removeFieldFromDescriptor("+C\"L", ")_N+/-w}'3*]isVd");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1361.removeFieldFromDescriptor("K@", (String) null);
      } catch(NullPointerException e) {
      }
  }
}
