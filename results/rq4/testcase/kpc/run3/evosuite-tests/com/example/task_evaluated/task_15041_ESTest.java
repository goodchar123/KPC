/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:27:34 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15041;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15041_ESTest extends task_15041_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15041 task_15041_0 = new task_15041();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ListIterator<Object> listIterator0 = (ListIterator<Object>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(listIterator0).hasNext();
      doReturn((Object) null).when(listIterator0).previous();
      task_15041.removeLastReturned(listIterator0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(listIterator0).hasNext();
      doReturn(false).when(listIterator0).hasPrevious();
      // Undeclared exception!
      try { 
        task_15041.removeLastReturned(listIterator0);
      } catch(NoSuchElementException e) {
         //
         // Iterator has no next or previous element
         //
         verifyException("com.example.task_evaluated.task_15041", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ListIterator<Object> listIterator0 = (ListIterator<Object>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(listIterator0).hasNext();
      doReturn(true).when(listIterator0).hasPrevious();
      doReturn((Object) null).when(listIterator0).previous();
      task_15041.removeLastReturned(listIterator0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_15041.removeLastReturned((ListIterator<String>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_15041", e);
      }
  }
}
