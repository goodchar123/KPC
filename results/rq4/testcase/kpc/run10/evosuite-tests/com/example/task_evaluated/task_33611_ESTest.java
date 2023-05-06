/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:38:03 GMT 2023
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
      task_33611 task_33611_0 = new task_33611();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("R5mA", "R5mA", "M*$");
      } catch(IllegalArgumentException e) {
         //
         // Illegal group reference: group index is missing
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("iL`%l2JR3'R/fM-M", "", "5J~,;h+fQ`#^$9");
      } catch(IndexOutOfBoundsException e) {
         //
         // No group 9
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("", (String) null, "&");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      try { 
        task_33611.replaceString(" U(8x*9 qy_", " U(8x*9 qy_", "%");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 11
         //  U(8x*9 qy_
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
