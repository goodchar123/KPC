/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:16:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14566;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14566_ESTest extends task_14566_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14566 task_14566_0 = new task_14566();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_14566.findNextOccurrence("hX*JQ <2+Hix", "hX*JQ <2+Hix", "com.example.task_evaluated.task_14566");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14566.findNextOccurrence("", "", "G9nd");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14566.findNextOccurrence("px0ct", "mw5;QR/D\"uVT??Z`", "mw5;QR/D\"uVT??Z`");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14566.findNextOccurrence("", (String) null, "");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14566.findNextOccurrence("", "", "++Cjzcvnqz1u0aY");
      } catch(PatternSyntaxException e) {
         //
         // Dangling meta character '+' near index 0
         // ++Cjzcvnqz1u0aY
         // ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
