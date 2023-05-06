/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:28:04 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_34860;
import java.awt.RenderingHints;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_34860_ESTest extends task_34860_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_34860 task_34860_0 = new task_34860();
      RenderingHints renderingHints0 = new RenderingHints((Map<RenderingHints.Key, ?>) null);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_34860_0.removeRenderingHint(renderingHints0, object0);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.awt.RenderingHints$Key
         //
         verifyException("java.awt.RenderingHints", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_34860 task_34860_0 = new task_34860();
      // Undeclared exception!
      try { 
        task_34860_0.removeRenderingHint((RenderingHints) null, (Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_34860", e);
      }
  }
}
