/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 16:29:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31660;
import java.io.FileNotFoundException;
import javax.sound.sampled.UnsupportedAudioFileException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31660_ESTest extends task_31660_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31660 task_31660_0 = new task_31660();
      try { 
        task_31660_0.getAudioClip(")7WI1u");
      } catch(FileNotFoundException e) {
         //
         // File not found: )7WI1u
         //
         verifyException("com.example.task_evaluated.task_31660", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(")7WI1u");
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "mv;%$0");
      task_31660 task_31660_0 = new task_31660();
      try { 
        task_31660_0.getAudioClip(")7WI1u");
      } catch(FileNotFoundException e) {
         //
         // )7WI1u (No such file or directory)
         //
         verifyException("java.io.FileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_31660 task_31660_0 = new task_31660();
      try { 
        task_31660_0.getAudioClip("");
      } catch(UnsupportedAudioFileException e) {
         //
         // Invalid audio file: 
         //
         verifyException("com.example.task_evaluated.task_31660", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_31660 task_31660_0 = new task_31660();
      try { 
        task_31660_0.getAudioClip((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}
