/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:16:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14007;
import java.awt.Dialog;
import java.sql.ClientInfoStatus;
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
      ClientInfoStatus[] clientInfoStatusArray0 = new ClientInfoStatus[2];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(clientInfoStatusArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.EnumSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Dialog.ModalityType[] dialog_ModalityTypeArray0 = new Dialog.ModalityType[0];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(dialog_ModalityTypeArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }
}