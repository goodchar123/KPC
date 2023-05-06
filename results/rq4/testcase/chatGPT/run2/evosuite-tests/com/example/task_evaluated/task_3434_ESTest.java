/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:26:18 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_3434;
import java.util.Iterator;
import javax.xml.namespace.NamespaceContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_3434_ESTest extends task_3434_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_3434 task_3434_0 = new task_3434();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn("").when(iterator0).next();
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn("").when(namespaceContext0).getNamespaceURI(anyString());
      doReturn(iterator0).when(namespaceContext0).getPrefixes(anyString());
      String string0 = task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iterator0).hasNext();
      doReturn("b9zr@DT5Ob6T0/5'#a").when(iterator0).next();
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn("b9zr@DT5Ob6T0/5'#a").when(namespaceContext0).getNamespaceURI(anyString());
      doReturn(iterator0).when(namespaceContext0).getPrefixes(anyString());
      String string0 = task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "");
      Iterator<Object> iterator1 = null;
      NamespaceContext namespaceContext1 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn(iterator1).when(namespaceContext1).getPrefixes(anyString());
      String string1 = "";
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI(namespaceContext1, string1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }
}
