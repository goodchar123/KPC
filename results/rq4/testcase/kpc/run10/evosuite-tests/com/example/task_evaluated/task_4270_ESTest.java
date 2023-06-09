/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:37:43 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4270;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4270_ESTest extends task_4270_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4270 task_4270_0 = new task_4270();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      QName qName0 = mock(QName.class, new ViolatedAssumptionAnswer());
      XMLGregorianCalendar xMLGregorianCalendar0 = mock(XMLGregorianCalendar.class, new ViolatedAssumptionAnswer());
      doReturn(qName0).when(xMLGregorianCalendar0).getXMLSchemaType();
      doReturn("g~PYCZ~").when(xMLGregorianCalendar0).toXMLFormat();
      String string0 = task_4270.getXmlGregorianCalendarAsString(xMLGregorianCalendar0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XMLGregorianCalendar xMLGregorianCalendar0 = mock(XMLGregorianCalendar.class, new ViolatedAssumptionAnswer());
      doReturn((QName) null).when(xMLGregorianCalendar0).getXMLSchemaType();
      // Undeclared exception!
      try { 
        task_4270.getXmlGregorianCalendarAsString(xMLGregorianCalendar0);
      } catch(IllegalStateException e) {
         //
         // Invalid combination of set fields
         //
         verifyException("com.example.task_evaluated.task_4270", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      QName qName0 = mock(QName.class, new ViolatedAssumptionAnswer());
      XMLGregorianCalendar xMLGregorianCalendar0 = mock(XMLGregorianCalendar.class, new ViolatedAssumptionAnswer());
      doReturn(qName0).when(xMLGregorianCalendar0).getXMLSchemaType();
      doReturn((String) null).when(xMLGregorianCalendar0).toXMLFormat();
      // Undeclared exception!
      try { 
        task_4270.getXmlGregorianCalendarAsString(xMLGregorianCalendar0);
      } catch(IllegalStateException e) {
         //
         // Invalid combination of set fields
         //
         verifyException("com.example.task_evaluated.task_4270", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_4270.getXmlGregorianCalendarAsString((XMLGregorianCalendar) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_4270", e);
      }
  }
}
