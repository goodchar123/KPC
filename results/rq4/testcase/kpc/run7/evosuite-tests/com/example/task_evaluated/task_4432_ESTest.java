/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:33:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4432;
import javax.imageio.metadata.IIOMetadataNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4432_ESTest extends task_4432_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4432 task_4432_0 = new task_4432();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      task_4432_0.removeAttributeByLocalNameAndNamespaceURI(iIOMetadataNode0, "KMD}LCKm{G-|@#", "KMD}LCKm{G-|@#");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_4432 task_4432_0 = new task_4432();
      IIOMetadataNode iIOMetadataNode0 = new IIOMetadataNode();
      iIOMetadataNode0.setAttribute("", "");
      // Undeclared exception!
      try { 
        task_4432_0.removeAttributeByLocalNameAndNamespaceURI(iIOMetadataNode0, "P3j*!R", "P3j*!R");
      } catch(NullPointerException e) {
      }
  }
}
