/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:13:51 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15929;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15929_ESTest extends task_15929_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15929 task_15929_0 = new task_15929();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "e|L@z&w|`z";
      stringArray0[1] = "e|L@z&w|`z";
      stringArray0[2] = "e|L@z&w|`z";
      stringArray0[3] = "e|L@z&w|`z";
      stringArray0[4] = "2561Ve";
      task_15929.writeToFile("e|L@z&w|`z", stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        task_15929.writeToFile((String) null, stringArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}
