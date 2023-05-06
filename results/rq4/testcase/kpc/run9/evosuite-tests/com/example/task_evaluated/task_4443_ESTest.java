/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:53:28 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4443;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4443_ESTest extends task_4443_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4443 task_4443_0 = new task_4443();
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      doReturn((Element) null).when(document0).createElement(anyString());
      doReturn((Element) null).when(document0).getDocumentElement();
      // Undeclared exception!
      try { 
        task_4443_0.addNodeByNodeName(document0, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}