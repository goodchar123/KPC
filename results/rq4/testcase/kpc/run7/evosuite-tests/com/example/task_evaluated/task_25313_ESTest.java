/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:30:20 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_25313;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_25313_ESTest extends task_25313_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_25313 task_25313_0 = new task_25313();
      try { 
        task_25313_0.saveFile();
      } catch(HeadlessException e) {
         //
         // Cannot display file chooser dialog in headless environment
         //
         verifyException("com.example.task_evaluated.task_25313", e);
      }
  }
}
