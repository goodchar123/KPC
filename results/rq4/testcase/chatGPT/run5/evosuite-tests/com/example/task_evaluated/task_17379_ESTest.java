/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:43:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17379;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17379_ESTest extends task_17379_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17379 task_17379_0 = new task_17379();
      MockFile mockFile0 = new MockFile("\"");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      mockFileOutputStream0.close();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockFileOutputStream0);
      try { 
        task_17379_0.writeAttributeToStream("MBIr9xB`", "|", dataOutputStream0);
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17379 task_17379_0 = new task_17379();
      // Undeclared exception!
      try { 
        task_17379_0.writeAttributeToStream("|?.wYW", "]Hufjg3pE^8&8P*/=w%", (OutputStream) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17379", e);
      }
  }
}
