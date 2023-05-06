/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:54:28 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_3442;
import javax.xml.namespace.QName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_3442_ESTest extends task_3442_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_3442 task_3442_0 = new task_3442();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = task_3442.parseQName("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_3442.parseQName((String) null);
      } catch(IllegalArgumentException e) {
         //
         // QName string cannot be null
         //
         verifyException("com.example.task_evaluated.task_3442", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = task_3442.parseQName("Invalid QName string format: ");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      QName qName0 = task_3442.parseQName("eW*g7T!K::M");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_3442.parseQName(":");
      } catch(IllegalArgumentException e) {
         //
         // Invalid QName string format: :
         //
         verifyException("com.example.task_evaluated.task_3442", e);
      }
  }
}
