/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:52:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7254;
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
      // Undeclared exception!
      try { 
        task_7254.startPipeline(linkedList0);
      } catch(IndexOutOfBoundsException e) {
         //
         // ProcessBuilder list cannot be empty
         //
         verifyException("com.example.task_evaluated.task_7254", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7254.startPipeline((List<ProcessBuilder>) null);
      } catch(NullPointerException e) {
         //
         // ProcessBuilder list cannot be null
         //
         verifyException("com.example.task_evaluated.task_7254", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<ProcessBuilder> linkedList0 = new LinkedList<ProcessBuilder>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      ProcessBuilder processBuilder0 = new ProcessBuilder(linkedList1);
      boolean boolean0 = linkedList0.add(processBuilder0);
      // Undeclared exception!
      try { 
        task_7254.startPipeline(linkedList0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("java.lang.ProcessBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<ProcessBuilder> linkedList0 = new LinkedList<ProcessBuilder>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      boolean boolean0 = linkedList1.add((String) null);
      ProcessBuilder processBuilder0 = new ProcessBuilder(linkedList1);
      boolean boolean1 = linkedList0.add(processBuilder0);
      // Undeclared exception!
      try { 
        task_7254.startPipeline(linkedList0);
      } catch(NullPointerException e) {
         //
         // Command list cannot contain null elements
         //
         verifyException("com.example.task_evaluated.task_7254", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<ProcessBuilder> linkedList0 = new LinkedList<ProcessBuilder>();
      boolean boolean0 = linkedList0.add((ProcessBuilder) null);
      // Undeclared exception!
      try { 
        task_7254.startPipeline(linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
