/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:56:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_33866;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragSourceListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_33866_ESTest extends task_33866_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_33866 task_33866_0 = new task_33866();
      try { 
        task_33866_0.startDrag((Cursor) null, (Transferable) null, (DragSourceListener) null);
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_33866", e);
      }
  }
}
