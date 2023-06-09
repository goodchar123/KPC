/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:57:39 GMT 2023
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
        task_33611.replaceString("He@U$F-xp3AI*", "", "He@U$F-xp3AI*");
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
        task_33611.replaceString("0&q/vq6I$6E5&ISZ|9", "0&q/vq6I$6E5&ISZ|9", "0&q/vq6I$6E5&ISZ|9");
      } catch(IndexOutOfBoundsException e) {
         //
         // No group 6
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString((String) null, "9Bpr}<y", "@eb5");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_33611", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("", "\"%{}wqzd", "");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 1
         // \"%{}wqzd
         //  ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
