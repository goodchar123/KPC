/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:04:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14007;
import java.awt.Dialog;
import java.net.StandardProtocolFamily;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14007_ESTest extends task_14007_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14007 task_14007_0 = new task_14007();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StandardProtocolFamily[] standardProtocolFamilyArray0 = new StandardProtocolFamily[2];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(standardProtocolFamilyArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.EnumSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Dialog.ModalExclusionType[] dialog_ModalExclusionTypeArray0 = new Dialog.ModalExclusionType[0];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(dialog_ModalExclusionTypeArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }
}
