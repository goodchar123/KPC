/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:24:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_17321;
import javax.sql.rowset.CachedRowSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17321_ESTest extends task_17321_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17321 task_17321_0 = new task_17321();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CachedRowSet cachedRowSet0 = task_17321.createCachedRowSet();
  }
}