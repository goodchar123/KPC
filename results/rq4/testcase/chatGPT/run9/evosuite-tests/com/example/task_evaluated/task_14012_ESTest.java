/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:47:34 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_14012;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14012_ESTest extends task_14012_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14012 task_14012_0 = new task_14012();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = task_14012.getFirstElement((List<Object>) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = task_14012.getFirstElement((List<Integer>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = linkedList0.add((Integer) null);
      Integer integer0 = task_14012.getFirstElement((List<Integer>) linkedList0);
  }
}
