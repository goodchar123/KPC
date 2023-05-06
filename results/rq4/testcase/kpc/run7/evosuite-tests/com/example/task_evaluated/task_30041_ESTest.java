/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:18:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_30041;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_30041_ESTest extends task_30041_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_30041 task_30041_0 = new task_30041();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("AvV$y0");
      task_30041.removeElement((Document) null, iIOMetadataNode0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode("HOS.#");
      Node node0 = iIOMetadataNode0.appendChild(iIOMetadataNode0);
      task_30041.removeElement((Document) null, iIOMetadataNode0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_30041.removeElement((Document) null, (Element) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_30041", e);
      }
  }
}
