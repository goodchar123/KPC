/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:32:23 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_36238;
import java.io.File;
import javax.imageio.IIOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_36238_ESTest extends task_36238_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_36238 task_36238_0 = new task_36238();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_36238.getProperty((File) null, "");
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = MockFile.createTempFile("+'C*Nw", "+'C*Nw");
      try { 
        task_36238.getProperty(file0, "+'C*Nw");
      } catch(IIOException e) {
         //
         // Can't create an ImageInputStream!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }
}
