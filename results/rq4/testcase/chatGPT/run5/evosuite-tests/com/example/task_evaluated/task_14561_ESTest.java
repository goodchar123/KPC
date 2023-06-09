/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:27:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14561;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14561_ESTest extends task_14561_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14561 task_14561_0 = new task_14561();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      Scanner scanner0 = new Scanner(charBuffer0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = "Xn|B2r6VZ\\PbY";
      Scanner scanner0 = new Scanner("Xn|B2r6VZPbY");
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, string0);
      } catch(PatternSyntaxException e) {
         //
         // Unknown character property name {b} near index 11
         // Xn|B2r6VZ\\PbY
         //            ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
