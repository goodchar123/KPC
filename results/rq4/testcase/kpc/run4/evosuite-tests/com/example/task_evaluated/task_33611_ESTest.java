/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:23:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_33611;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_33611_ESTest extends task_33611_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("FbEV<Ol8s", "FbEV<Ol8s", (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_33611 task_33611_0 = new task_33611();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("#5HX$XSW3fbf|", "#5HX$XSW3fbf|", "$VT4eC.fOl*hE*");
      } catch(IllegalArgumentException e) {
         //
         // Illegal group reference
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("", "", "jMGFGhQhg$9R}6");
      } catch(IndexOutOfBoundsException e) {
         //
         // No group 9
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      try { 
        task_33611.replaceString("", "Pl?+!{@|bD#AK3", "");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 5
         // Pl?+!{@|bD#AK3
         //      ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}