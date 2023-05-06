/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:36:16 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14561;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.io.PushbackInputStream;
import java.io.StringReader;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14561_ESTest extends task_14561_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14561 task_14561_0 = new task_14561();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14561.matchNextToken((Scanner) null, "com.example.task_evaluated.task_14561");
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      boolean boolean0 = scanner0.hasNext("");
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "");
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2321), (byte)1);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "oot`R%Z,;.%m%'o");
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(dataInputStream0, 1260);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(bufferedInputStream0);
      Scanner scanner0 = new Scanner(pushbackInputStream0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "com.example.task_evaluated.task_14561");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringReader stringReader0 = new StringReader("M'AyScA6u-");
      LineNumberReader lineNumberReader0 = new LineNumberReader(stringReader0);
      Scanner scanner0 = new Scanner(lineNumberReader0);
      // Undeclared exception!
      try { 
        task_14561.matchNextToken(scanner0, "9>O$(");
      } catch(PatternSyntaxException e) {
         //
         // Invalid pattern syntax near index 5
         // 9>O$(
         //
         verifyException("com.example.task_evaluated.task_14561", e);
      }
  }
}
