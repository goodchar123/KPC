/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:14:54 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_18193;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18193_ESTest extends task_18193_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18193 task_18193_0 = new task_18193();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Properties properties0 = task_18193.getSystemProperties();
  }
}
