/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:08:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_14004;
import java.util.EnumSet;
import javax.swing.SortOrder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14004_ESTest extends task_14004_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14004 task_14004_0 = new task_14004();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SortOrder sortOrder0 = SortOrder.UNSORTED;
      EnumSet<SortOrder> enumSet0 = task_14004.createEnumSet(sortOrder0);
  }
}