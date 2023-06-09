/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:39:12 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14557;
import java.io.File;
import java.io.FileDescriptor;
import java.math.BigDecimal;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14557_ESTest extends task_14557_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken((Scanner) null);
      } catch(IllegalArgumentException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scanner scanner0 = new Scanner("Z+PGs*B7tLPoK~$f V");
      task_14557 task_14557_0 = new task_14557();
      String string0 = task_14557_0.getNextToken(scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      MockFile mockFile0 = new MockFile((File) null, "");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(NoSuchElementException e) {
         //
         // No more tokens available
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Scanner scanner0 = new Scanner("Z+PGs*tLPK~$f ^");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      task_14557 task_14557_0 = new task_14557();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      Scanner scanner0 = new Scanner("Z+PGs*K~$fX ^");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      Scanner scanner0 = new Scanner(mockFileReader0);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      try { 
        DatagramChannel.open();
      } catch(SocketException e) {
      }
  }
}
