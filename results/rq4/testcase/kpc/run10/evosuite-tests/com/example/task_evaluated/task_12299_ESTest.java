/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:00:54 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12299;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12299_ESTest extends task_12299_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12299 task_12299_0 = new task_12299();
      try { 
        task_12299_0.getSignatureBytes((byte[]) null, (PrivateKey) null);
      } catch(InvalidKeyException e) {
         //
         // Invalid private key
         //
         verifyException("com.example.task_evaluated.task_12299", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      task_12299 task_12299_0 = new task_12299();
      byte[] byteArray0 = new byte[0];
      try { 
        task_12299_0.getSignatureBytes(byteArray0, privateKey0);
      } catch(InvalidKeyException e) {
         //
         // No installed provider supports this key: codegen.java.security.PrivateKey$MockitoMock$1842918278
         //
         verifyException("java.security.Signature$Delegate", e);
      }
  }
}
