/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:35:15 GMT 2023
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
        task_33611.replaceString("D|bf`", "", "HQ0C Pm}A_u$rX_u");
      } catch(IllegalArgumentException e) {
         //
         // Illegal group reference
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("", (String) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("<.{az\"q{p", "<.{az\"q{p", "<.{az\"q{p");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 1
         // <.{az\"q{p
         //  ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}