/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:03:47 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_17654;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17654_ESTest extends task_17654_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      task_17654.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17654.LDAPHelper task_17654_LDAPHelper0 = new task_17654.LDAPHelper();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_17654 task_17654_0 = new task_17654();
  }
}
