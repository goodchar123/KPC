/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:19:42 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_14201;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14201_ESTest extends task_14201_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14201 task_14201_0 = new task_14201();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = task_14201.removeElement((Collection<String>) null, "sARX8IQqSL68Gc%U");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = task_14201.removeElement((Collection<String>) linkedList0, "5@S|(S%4_xI1Vb");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = task_14201.removeElement((Collection<Object>) linkedList0, (Object) null);
  }
}
