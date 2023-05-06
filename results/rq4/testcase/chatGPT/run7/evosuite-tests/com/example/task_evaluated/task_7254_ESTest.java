/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:25:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7254;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_7254_ESTest extends task_7254_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_7254 task_7254_0 = new task_7254();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<ProcessBuilder> linkedList0 = new LinkedList<ProcessBuilder>();
      task_7254.startPipeline(linkedList0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<ProcessBuilder> linkedList0 = new LinkedList<ProcessBuilder>();
      linkedList0.push((ProcessBuilder) null);
      // Undeclared exception!
      try { 
        task_7254.startPipeline(linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<ProcessBuilder> linkedList0 = new LinkedList<ProcessBuilder>();
      String[] stringArray0 = new String[0];
      ProcessBuilder processBuilder0 = new ProcessBuilder(stringArray0);
      boolean boolean0 = linkedList0.add(processBuilder0);
      // Undeclared exception!
      try { 
        task_7254.startPipeline(linkedList0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<ProcessBuilder> linkedList0 = new LinkedList<ProcessBuilder>();
      List<ProcessBuilder> list0 = linkedList0.subList(0, 0);
      String[] stringArray0 = new String[8];
      ProcessBuilder processBuilder0 = new ProcessBuilder(stringArray0);
      boolean boolean0 = linkedList0.add(processBuilder0);
      // Undeclared exception!
      try { 
        task_7254.startPipeline(list0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}