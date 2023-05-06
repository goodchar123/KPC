/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:07:26 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20548;
import java.io.DataOutputStream;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20548_ESTest extends task_20548_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20548 task_20548_0 = new task_20548();
      MockFile mockFile0 = new MockFile("P3~&Z?b_[$4,8~", "8YB(]d(C.)#YF");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      boolean boolean0 = mockFile0.setReadOnly();
      try { 
        task_20548_0.writeAttribute(dataOutputStream0, "P3~&Z?b_[$4,8~");
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20548 task_20548_0 = new task_20548();
      // Undeclared exception!
      try { 
        task_20548_0.writeAttribute((DataOutputStream) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20548", e);
      }
  }
}
