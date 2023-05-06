/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:54:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17938;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17938_ESTest extends task_17938_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17938 task_17938_0 = new task_17938();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List<String> list0 = task_17938.removeAttributeValue((List<String>) null, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = task_17938.removeAttributeValue(linkedList0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("");
      List<String> list0 = task_17938.removeAttributeValue(linkedList0, "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("");
      // Undeclared exception!
      try { 
        task_17938.removeAttributeValue(linkedList0, "(=cglD(zJ[ecD%");
      } catch(IllegalArgumentException e) {
         //
         // Value not found in list
         //
         verifyException("com.example.task_evaluated.task_17938", e);
      }
  }
}
