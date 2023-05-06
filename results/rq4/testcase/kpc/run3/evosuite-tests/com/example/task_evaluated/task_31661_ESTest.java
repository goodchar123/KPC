/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 04:43:40 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31661;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31661_ESTest extends task_31661_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31661 task_31661_0 = new task_31661();
      Mixer mixer0 = mock(Mixer.class, new ViolatedAssumptionAnswer());
      doReturn((Line) null).when(mixer0).getLine(any(javax.sound.sampled.Line.Info.class));
      doReturn(true).when(mixer0).isLineSupported(any(javax.sound.sampled.Line.Info.class));
      Clip clip0 = task_31661_0.getClipFromMixer(mixer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_31661 task_31661_0 = new task_31661();
      Mixer mixer0 = mock(Mixer.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(mixer0).isLineSupported(any(javax.sound.sampled.Line.Info.class));
      try { 
        task_31661_0.getClipFromMixer(mixer0);
      } catch(IllegalArgumentException e) {
         //
         // Mixer does not support Clip
         //
         verifyException("com.example.task_evaluated.task_31661", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_31661 task_31661_0 = new task_31661();
      // Undeclared exception!
      try { 
        task_31661_0.getClipFromMixer((Mixer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_31661", e);
      }
  }
}
