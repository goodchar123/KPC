/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 04:45:46 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_34860;
import java.awt.RenderingHints;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.awt.SunHints;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_34860_ESTest extends task_34860_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_34860 task_34860_0 = new task_34860();
      HashMap<RenderingHints.Key, String> hashMap0 = new HashMap<RenderingHints.Key, String>();
      HashMap<RenderingHints.Key, Object> hashMap1 = new HashMap<RenderingHints.Key, Object>(hashMap0);
      RenderingHints renderingHints0 = new RenderingHints(hashMap1);
      // Undeclared exception!
      try { 
        task_34860_0.removeRenderingHint(renderingHints0, (Object) null);
      } catch(ClassCastException e) {
         //
         // Key cannot be cast to RenderingHints.Key
         //
         verifyException("com.example.task_evaluated.task_34860", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_34860 task_34860_0 = new task_34860();
      SunHints.Key sunHints_Key0 = (SunHints.Key)RenderingHints.KEY_FRACTIONALMETRICS;
      // Undeclared exception!
      try { 
        task_34860_0.removeRenderingHint((RenderingHints) null, sunHints_Key0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_34860", e);
      }
  }
}