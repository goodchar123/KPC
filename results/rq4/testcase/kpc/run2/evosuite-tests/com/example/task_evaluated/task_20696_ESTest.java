/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 20:11:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20696;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialClob;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20696_ESTest extends task_20696_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20696 task_20696_0 = new task_20696();
      try { 
        task_20696_0.getClobReader((Clob) null);
      } catch(SQLException e) {
         //
         // Clob object is null
         //
         verifyException("com.example.task_evaluated.task_20696", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      char[] charArray0 = new char[2];
      SerialClob serialClob0 = new SerialClob(charArray0);
      task_20696 task_20696_0 = new task_20696();
      Reader reader0 = task_20696_0.getClobReader(serialClob0);
  }
}
