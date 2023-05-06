/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:58:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20704;
import java.sql.Clob;
import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20704_ESTest extends task_20704_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20704 task_20704_0 = new task_20704();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[5];
      SerialClob serialClob0 = new SerialClob(charArray0);
      task_20704.truncateClob(serialClob0, 407L);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[5];
      SerialClob serialClob0 = new SerialClob(charArray0);
      task_20704.truncateClob(serialClob0, 0L);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20704.truncateClob((Clob) null, 1332L);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20704", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      char[] charArray0 = new char[1];
      SerialClob serialClob0 = new SerialClob(charArray0);
      serialClob0.free();
      try { 
        task_20704.truncateClob(serialClob0, 1L);
      } catch(SerialException e) {
         //
         // Error: You cannot call a method on a SerialClob instance once free() has been called.
         //
         verifyException("javax.sql.rowset.serial.SerialClob", e);
      }
  }
}
