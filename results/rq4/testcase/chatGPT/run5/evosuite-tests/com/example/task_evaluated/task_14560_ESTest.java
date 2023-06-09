/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:40:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14560;
import java.io.StringReader;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14560_ESTest extends task_14560_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      String string0 = task_14560_0.getNextToken("", scanner0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      StringReader stringReader0 = new StringReader("com.example.task_evaluated.task_14560");
      Scanner scanner0 = new Scanner(stringReader0);
      String string0 = task_14560_0.getNextToken("com.example.task_evaluated.task_14560", scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", (Scanner) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14560", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("8B}");
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("T(s\u0007ZNg JC", scanner0);
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 10
         // T(s\u0007ZNg JC
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
