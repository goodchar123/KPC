/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:51:26 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_32569;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_32569_ESTest extends task_32569_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_32569 task_32569_0 = new task_32569();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_32569.getPathElement("G:)w<iV}IsdgR6*$Xt", (-557));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_32569.getPathElement("/", 1907);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_32569.getPathElement("UDthai;=~QL[/M}Et", 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_32569.getPathElement((String) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_32569", e);
      }
  }
}
