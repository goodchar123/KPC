/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:24:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_262;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.OperationNotSupportedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.naming.MockInitialContext;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_262_ESTest extends task_262_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_262 task_262_0 = new task_262();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hashtable<Integer, String> hashtable0 = new Hashtable<Integer, String>();
      MockInitialContext mockInitialContext0 = new MockInitialContext(hashtable0);
      try { 
        task_262.getContextInitiatorName(mockInitialContext0);
      } catch(OperationNotSupportedException e) {
         //
         // Naming system does not support full name for Context.getNameInNamespace()
         //
         verifyException("com.example.task_evaluated.task_262", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_262.getContextInitiatorName((Context) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
