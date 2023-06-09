/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:41:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20696;
import java.io.Reader;
import java.sql.Clob;
import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20696_ESTest extends task_20696_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20696 task_20696_0 = new task_20696();
      char[] charArray0 = new char[4];
      SerialClob serialClob0 = new SerialClob(charArray0);
      Reader reader0 = task_20696_0.getClobReader(serialClob0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20696 task_20696_0 = new task_20696();
      // Undeclared exception!
      try { 
        task_20696_0.getClobReader((Clob) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20696", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_20696 task_20696_0 = new task_20696();
      char[] charArray0 = new char[6];
      SerialClob serialClob0 = new SerialClob(charArray0);
      serialClob0.free();
      try { 
        task_20696_0.getClobReader(serialClob0);
      } catch(SerialException e) {
         //
         // Error: You cannot call a method on a SerialClob instance once free() has been called.
         //
         verifyException("javax.sql.rowset.serial.SerialClob", e);
      }
  }
}
