/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:17:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31704;
import javax.sound.sampled.AudioFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31704_ESTest extends task_31704_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31704 task_31704_0 = new task_31704();
      AudioFormat.Encoding audioFormat_Encoding0 = AudioFormat.Encoding.PCM_FLOAT;
      AudioFormat audioFormat0 = new AudioFormat(audioFormat_Encoding0, (-623.0F), 0, (-1566), 0, 0.0F, true);
      try { 
        task_31704_0.openLine(audioFormat0);
      } catch(IllegalArgumentException e) {
         //
         // Line not supported
         //
         verifyException("com.example.task_evaluated.task_31704", e);
      }
  }
}
