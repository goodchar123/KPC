/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:08:16 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14560;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.PushbackReader;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.Pattern;
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
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", (Scanner) null);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14560", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      String string0 = task_14560_0.getNextToken("D", scanner0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("yvc.N}L", scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14560", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Scanner scanner0 = new Scanner("@t");
      task_14560 task_14560_0 = new task_14560();
      String string0 = task_14560_0.getNextToken("@t", scanner0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-12), (byte)1);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("Scanner is closed", scanner0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      char[] charArray0 = new char[7];
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 1, 1);
      PushbackReader pushbackReader0 = new PushbackReader(charArrayReader0);
      Scanner scanner0 = new Scanner(pushbackReader0);
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", scanner0);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("h#,");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("h#,");
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken((String) null, scanner0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("com.example.task_evaluated.task_14560", scanner0);
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("com.example.task_evaluated.task_14560");
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("*R:Jy!h)9:zlP1N0", scanner0);
      } catch(PatternSyntaxException e) {
         //
         // Dangling meta character '*' near index 0
         // *R:Jy!h)9:zlP1N0
         // ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}