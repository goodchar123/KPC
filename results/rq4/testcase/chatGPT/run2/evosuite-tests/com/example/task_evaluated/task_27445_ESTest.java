/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:15:47 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_27445;
import java.awt.datatransfer.StringSelection;
import javax.swing.JRadioButton;
import javax.swing.TransferHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_27445_ESTest extends task_27445_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_27445 task_27445_0 = new task_27445();
      JRadioButton jRadioButton0 = new JRadioButton("cpu_WM");
      StringSelection stringSelection0 = new StringSelection("cpu_WM");
      TransferHandler.TransferSupport transferHandler_TransferSupport0 = new TransferHandler.TransferSupport(jRadioButton0, stringSelection0);
      task_27445_0.setDropAction(transferHandler_TransferSupport0, (-77));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_27445 task_27445_0 = new task_27445();
      // Undeclared exception!
      try { 
        task_27445_0.setDropAction((TransferHandler.TransferSupport) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_27445", e);
      }
  }
}