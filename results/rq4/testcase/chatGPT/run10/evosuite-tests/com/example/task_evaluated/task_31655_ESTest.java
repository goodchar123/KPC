/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:25:15 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_31655;
import javax.sound.sampled.Mixer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31655_ESTest extends task_31655_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31655 task_31655_0 = new task_31655();
      Mixer mixer0 = task_31655_0.getMixer("");
  }
}
