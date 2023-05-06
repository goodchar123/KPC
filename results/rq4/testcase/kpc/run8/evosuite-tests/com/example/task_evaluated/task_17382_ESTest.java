/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:42:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17382;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.sql.SQLException;
import java.sql.SQLXML;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17382_ESTest extends task_17382_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17382 task_17382_0 = new task_17382();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(inputStream0).read(any(byte[].class));
      SQLXML sQLXML0 = mock(SQLXML.class, new ViolatedAssumptionAnswer());
      doReturn(inputStream0).when(sQLXML0).getBinaryStream();
      // Undeclared exception!
      try { 
        task_17382_0.writeSQLXMLValue(sQLXML0, (OutputStream) null);
      } catch(NullPointerException e) {
         //
         // Output stream is null
         //
         verifyException("com.example.task_evaluated.task_17382", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_17382 task_17382_0 = new task_17382();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        task_17382_0.writeSQLXMLValue((SQLXML) null, pipedOutputStream0);
      } catch(SQLException e) {
         //
         // SQLXML value is null
         //
         verifyException("com.example.task_evaluated.task_17382", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_17382 task_17382_0 = new task_17382();
      MockPrintStream mockPrintStream0 = new MockPrintStream("#^");
      SQLXML sQLXML0 = mock(SQLXML.class, new ViolatedAssumptionAnswer());
      doReturn((InputStream) null).when(sQLXML0).getBinaryStream();
      try { 
        task_17382_0.writeSQLXMLValue(sQLXML0, mockPrintStream0);
      } catch(SQLException e) {
         //
         // SQLXML value is not readable
         //
         verifyException("com.example.task_evaluated.task_17382", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_17382 task_17382_0 = new task_17382();
      InputStream inputStream0 = mock(InputStream.class, new ViolatedAssumptionAnswer());
      doReturn(1281, (-1)).when(inputStream0).read(any(byte[].class));
      SQLXML sQLXML0 = mock(SQLXML.class, new ViolatedAssumptionAnswer());
      doReturn(inputStream0).when(sQLXML0).getBinaryStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream("#^");
      task_17382_0.writeSQLXMLValue(sQLXML0, mockPrintStream0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_17382 task_17382_0 = new task_17382();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SQLXML sQLXML0 = mock(SQLXML.class, new ViolatedAssumptionAnswer());
      doReturn(pipedInputStream0).when(sQLXML0).getBinaryStream();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(466);
      try { 
        task_17382_0.writeSQLXMLValue(sQLXML0, byteArrayOutputStream0);
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}
