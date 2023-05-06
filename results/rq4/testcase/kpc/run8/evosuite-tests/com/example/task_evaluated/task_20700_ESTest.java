/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:33:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20700;
import java.sql.Clob;
import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20700_ESTest extends task_20700_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20700 task_20700_0 = new task_20700();
      // Undeclared exception!
      try { 
        task_20700_0.writeClob((Clob) null, "", 0L);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20700", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20700 task_20700_0 = new task_20700();
      char[] charArray0 = new char[1];
      SerialClob serialClob0 = new SerialClob(charArray0);
      try { 
        task_20700_0.writeClob(serialClob0, "_xk+5}>-i*l#WRX+B", 0L);
      } catch(SerialException e) {
         //
         // Unsupported operation. SerialClob cannot return a writable character stream
         //  unless instantiated with a Clob object that has a setCharacterStream implementation
         //
         verifyException("javax.sql.rowset.serial.SerialClob", e);
      }
  }
}
