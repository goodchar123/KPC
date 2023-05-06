/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:29:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13623;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13623_ESTest extends task_13623_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13623 task_13623_0 = new task_13623();
      Object[] objectArray0 = new Object[2];
      Object[] objectArray1 = new Object[8];
      objectArray1[0] = (Object) task_13623_0;
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      int int0 = task_13623.compareArrays(objectArray1, objectArray0, (Comparator<? super Object>) comparator0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(comparator0).compare(any() , any());
      int int0 = task_13623.compareArrays(objectArray0, objectArray0, (Comparator<? super Object>) comparator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_13623 task_13623_0 = new task_13623();
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) task_13623_0;
      Object object0 = new Object();
      objectArray0[1] = object0;
      Object[] objectArray1 = new Object[4];
      objectArray1[0] = objectArray0[1];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        task_13623.compareArrays(objectArray0, objectArray1, (Comparator<? super Object>) comparator0);
      } catch(ClassCastException e) {
         //
         // Arguments' types prevent them from being compared by this comparator
         //
         verifyException("com.example.task_evaluated.task_13623", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[19];
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      doReturn(1).when(comparator0).compare(any() , any());
      int int0 = task_13623.compareArrays(objectArray0, objectArray0, (Comparator<? super Object>) comparator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        task_13623.compareArrays((Integer[]) null, (Integer[]) null, (Comparator<? super Integer>) comparator0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13623", e);
      }
  }
}