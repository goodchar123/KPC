/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:48:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4109;
import com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.TransformerFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4109_ESTest extends task_4109_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4109 task_4109_0 = new task_4109();
      TransformerFactory transformerFactory0 = TransformerFactory.newInstance();
      // Undeclared exception!
      try { 
        task_4109_0.setErrorEventListener(transformerFactory0, (ErrorListener) null);
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_4109 task_4109_0 = new task_4109();
      TransformerFactoryImpl transformerFactoryImpl0 = (TransformerFactoryImpl)TransformerFactory.newInstance();
      // Undeclared exception!
      try { 
        task_4109_0.setErrorEventListener((TransformerFactory) null, transformerFactoryImpl0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_4109", e);
      }
  }
}
