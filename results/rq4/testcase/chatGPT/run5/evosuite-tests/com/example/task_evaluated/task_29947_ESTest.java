/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:45:30 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29947;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29947_ESTest extends task_29947_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29947 task_29947_0 = new task_29947();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = hashMap0.put("n,jQahn}j-", "Oho>w3.b");
      task_29947_0.writeAttributes(hashMap0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29947 task_29947_0 = new task_29947();
      // Undeclared exception!
      try { 
        task_29947_0.writeAttributes((Map<String, String>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29947", e);
      }
  }
}
