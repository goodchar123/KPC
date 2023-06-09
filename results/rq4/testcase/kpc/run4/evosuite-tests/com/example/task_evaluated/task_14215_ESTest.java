/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:39:53 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14215;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14215_ESTest extends task_14215_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14215 task_14215_0 = new task_14215();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = task_14215.containsElement((Collection<? extends String>) linkedList0, "9aJ4jN,V%c<T");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[0];
      List<String> list0 = task_14215.asList(stringArray0);
      // Undeclared exception!
      try { 
        task_14215.containsElement((Collection<? extends String>) list0, (String) null);
      } catch(NullPointerException e) {
         //
         // This collection does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14215", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[5];
      List<String> list0 = task_14215.asList(stringArray0);
      boolean boolean0 = task_14215.containsElement((Collection<? extends String>) list0, (String) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14215.asList((Object[]) null);
      } catch(NullPointerException e) {
         //
         // The specified array is null
         //
         verifyException("com.example.task_evaluated.task_14215", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14215.containsElement((Collection<? extends String>) null, "G}F&^{o@2Zz");
      } catch(NullPointerException e) {
      }
  }
}
