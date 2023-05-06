/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:08:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_36212;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_36212_ESTest extends task_36212_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_36212 task_36212_0 = new task_36212();
      OrientationRequested orientationRequested0 = OrientationRequested.PORTRAIT;
      // Undeclared exception!
      try { 
        task_36212_0.setPrintOrientation((PrintRequestAttributeSet) null, orientationRequested0);
      } catch(NullPointerException e) {
         //
         // Attribute set cannot be null
         //
         verifyException("com.example.task_evaluated.task_36212", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashPrintRequestAttributeSet hashPrintRequestAttributeSet0 = new HashPrintRequestAttributeSet();
      task_36212 task_36212_0 = new task_36212();
      // Undeclared exception!
      try { 
        task_36212_0.setPrintOrientation(hashPrintRequestAttributeSet0, (OrientationRequested) null);
      } catch(ClassCastException e) {
         //
         // Orientation attribute must be a PrintRequestAttribute
         //
         verifyException("com.example.task_evaluated.task_36212", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_36212 task_36212_0 = new task_36212();
      HashPrintRequestAttributeSet hashPrintRequestAttributeSet0 = new HashPrintRequestAttributeSet();
      OrientationRequested orientationRequested0 = OrientationRequested.REVERSE_PORTRAIT;
      task_36212_0.setPrintOrientation(hashPrintRequestAttributeSet0, orientationRequested0);
  }
}
