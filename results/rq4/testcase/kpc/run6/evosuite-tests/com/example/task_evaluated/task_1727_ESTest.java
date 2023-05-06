/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:15:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1727;
import java.net.HttpURLConnection;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1727_ESTest extends task_1727_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpURLConnection httpURLConnection0 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      HttpURLConnection httpURLConnection1 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      doReturn((Map) null).when(httpURLConnection1).getHeaderFields();
      HttpURLConnection httpURLConnection2 = mock(HttpURLConnection.class, new ViolatedAssumptionAnswer());
      task_1727 task_1727_0 = new task_1727();
      // Undeclared exception!
      try { 
        task_1727_0.getNegotiatedProperty(httpURLConnection1, "");
      } catch(NullPointerException e) {
         //
         // Header fields are null
         //
         verifyException("com.example.task_evaluated.task_1727", e);
      }
  }
}
