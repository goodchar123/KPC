/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:06:53 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4427;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4427_ESTest extends task_4427_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4427 task_4427_0 = new task_4427();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("xvoA\"&iwiiyXv*\"Fql");
      // Undeclared exception!
      try { 
        task_4427_0.addAttribute(iIOMetadataNode0, "xvoA\"&iwiiyXv*\"Fql", "xvoA\"&iwiiyXv*\"Fql");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_4427", e);
      }
  }
}