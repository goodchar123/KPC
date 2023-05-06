/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:35:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_36212;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.MediaName;
import javax.print.attribute.standard.OrientationRequested;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_36212_ESTest extends task_36212_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_36212 task_36212_0 = new task_36212();
      MediaName mediaName0 = MediaName.ISO_A4_WHITE;
      HashPrintRequestAttributeSet hashPrintRequestAttributeSet0 = new HashPrintRequestAttributeSet(mediaName0);
      // Undeclared exception!
      try { 
        task_36212_0.setPrintOrientation(hashPrintRequestAttributeSet0, (OrientationRequested) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.print.attribute.HashAttributeSet", e);
      }
  }
}
