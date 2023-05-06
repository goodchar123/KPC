/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:49:32 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_3434;
import java.util.Iterator;
import java.util.NoSuchElementException;
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
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iterator0).hasNext();
      doReturn("com.exa`Ele.tak_evaluaed.task_3434").when(iterator0).next();
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn("Namespace URI cannot be null for prefix: ").when(namespaceContext0).getNamespaceURI(anyString());
      doReturn(iterator0).when(namespaceContext0).getPrefixes(anyString());
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "");
      } catch(NoSuchElementException e) {
         //
         // No prefix found for Namespace URI: 
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn(iterator0).when(namespaceContext0).getPrefixes(anyString());
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "zF6$&pQLf(xJx2>7Kn");
      } catch(NoSuchElementException e) {
         //
         // No prefix found for Namespace URI: zF6$&pQLf(xJx2>7Kn
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI((NamespaceContext) null, (String) null);
      } catch(IllegalArgumentException e) {
         //
         // Namespace URI cannot be null
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn((Iterator) null).when(namespaceContext0).getPrefixes(anyString());
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "[ ^~9@P*tGV~cU\"z'U");
      } catch(IllegalArgumentException e) {
         //
         // No prefixes found for Namespace URI: [ ^~9@P*tGV~cU\"z'U
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true).when(iterator0).hasNext();
      doReturn("com.exa`Ele.tak_evaluaed.task_3434", "com.exa`Ele.tak_evaluaed.task_3434").when(iterator0).next();
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn("Namespace URI cannot be null for prefix: ", "").when(namespaceContext0).getNamespaceURI(anyString());
      doReturn(iterator0).when(namespaceContext0).getPrefixes(anyString());
      String string0 = task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn(iterator0).when(namespaceContext0).getPrefixes(anyString());
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "Namespace URI cannot be null for prefix: ");
      } catch(IllegalArgumentException e) {
         //
         // Prefix cannot be null
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Iterator<String> iterator0 = (Iterator<String>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn("").when(iterator0).next();
      NamespaceContext namespaceContext0 = mock(NamespaceContext.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(namespaceContext0).getNamespaceURI(anyString());
      doReturn(iterator0).when(namespaceContext0).getPrefixes(anyString());
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI(namespaceContext0, "Namespace URI cannot be null for prefix: ");
      } catch(IllegalArgumentException e) {
         //
         // Namespace URI cannot be null for prefix: 
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_3434.getPrefixBoundToNamespaceURI((NamespaceContext) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_3434", e);
      }
  }
}
