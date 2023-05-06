/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:19:19 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_27445;
import java.awt.datatransfer.StringSelection;
import javax.swing.JPasswordField;
import javax.swing.TransferHandler;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.GapContent;
import javax.swing.text.StyleContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_27445_ESTest extends task_27445_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_27445 task_27445_0 = new task_27445();
      GapContent gapContent0 = new GapContent();
      StyleContext styleContext0 = new StyleContext();
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument(gapContent0, styleContext0);
      JPasswordField jPasswordField0 = new JPasswordField(defaultStyledDocument0, "", 0);
      StringSelection stringSelection0 = new StringSelection("");
      TransferHandler.TransferSupport transferHandler_TransferSupport0 = new TransferHandler.TransferSupport(jPasswordField0, stringSelection0);
      // Undeclared exception!
      try { 
        task_27445_0.setDropAction(transferHandler_TransferSupport0, (-2005));
      } catch(IllegalStateException e) {
         //
         // Transfer is not a drop
         //
         verifyException("com.example.task_evaluated.task_27445", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_27445 task_27445_0 = new task_27445();
      // Undeclared exception!
      try { 
        task_27445_0.setDropAction((TransferHandler.TransferSupport) null, 776);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_27445", e);
      }
  }
}