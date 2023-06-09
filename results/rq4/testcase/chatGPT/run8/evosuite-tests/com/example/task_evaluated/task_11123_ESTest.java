/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:09:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_11123;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_11123_ESTest extends task_11123_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_11123 task_11123_0 = new task_11123();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Path path0 = mock(Path.class, new ViolatedAssumptionAnswer());
      doReturn((FileSystem) null).when(path0).getFileSystem();
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(0);
      // Undeclared exception!
      try { 
        task_11123.readFromFileChannel(path0, 5568L, byteBuffer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.channels.FileChannel", e);
      }
  }
}
