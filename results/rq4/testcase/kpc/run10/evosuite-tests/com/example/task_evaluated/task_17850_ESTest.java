/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:02:43 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17850;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17850_ESTest extends task_17850_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[6];
      task_17850.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17850 task_17850_0 = new task_17850();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17850.removeComponent((String) null, "controller");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17850", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      try { 
        task_17850.removeComponent("EyT$XRcw=\")SWD^#&M", "EyT$XRcw=\")SWD^#&M");
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 11
         // \\.EyT$XRcw=\")SWD^#&M\\b
         //            ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
