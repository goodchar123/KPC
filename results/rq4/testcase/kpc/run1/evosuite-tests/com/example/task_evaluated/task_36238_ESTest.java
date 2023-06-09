/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:03:47 GMT 2023
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
      File file0 = MockFile.createTempFile(")~8)!9bM4p('1W5k7]", (String) null);
      // Undeclared exception!
      try { 
        task_36238.getProperty(file0, (String) null);
      } catch(NullPointerException e) {
         //
         // Property name cannot be null
         //
         verifyException("com.example.task_evaluated.task_36238", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_36238.getProperty((File) null, "n8'VA[q]");
      } catch(IllegalArgumentException e) {
         //
         // Image file cannot be null
         //
         verifyException("com.example.task_evaluated.task_36238", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = MockFile.createTempFile("c\"e=#Hv}M", "c\"e=#Hv}M");
      try { 
        task_36238.getProperty(file0, "c\"e=#Hv}M");
      } catch(IIOException e) {
         //
         // Can't create an ImageInputStream!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }
}
