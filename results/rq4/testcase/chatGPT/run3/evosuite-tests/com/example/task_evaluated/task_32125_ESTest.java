/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:38:39 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_32125;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;
import javax.imageio.stream.MemoryCacheImageOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_32125_ESTest extends task_32125_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_32125 task_32125_0 = new task_32125();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MemoryCacheImageOutputStream memoryCacheImageOutputStream0 = new MemoryCacheImageOutputStream(pipedOutputStream0);
      try { 
        task_32125.decodeImage(memoryCacheImageOutputStream0);
      } catch(IOException e) {
         //
         // No suitable ImageReader found
         //
         verifyException("com.example.task_evaluated.task_32125", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-25), (byte)73);
      MemoryCacheImageInputStream memoryCacheImageInputStream0 = new MemoryCacheImageInputStream(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        task_32125.decodeImage(memoryCacheImageInputStream0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_32125.decodeImage((ImageInputStream) null);
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }
}
