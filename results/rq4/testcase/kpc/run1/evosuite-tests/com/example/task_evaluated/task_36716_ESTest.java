/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:49:41 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_36716;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_36716_ESTest extends task_36716_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_36716 task_36716_0 = new task_36716();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("");
      try { 
        task_36716_0.registerIDAttribute(iIOMetadataNode0, "", "");
      } catch(DOMException e) {
         //
         // Document is null
         //
         verifyException("com.example.task_evaluated.task_36716", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_36716 task_36716_0 = new task_36716();
      // Undeclared exception!
      try { 
        task_36716_0.registerIDAttribute((Element) null, "YpdV/c", "YpdV/c");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
