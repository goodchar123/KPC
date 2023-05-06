/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:59:22 GMT 2023
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
      byte[] byteArray0 = new byte[1];
      PrivateKey privateKey0 = mock(PrivateKey.class, new ViolatedAssumptionAnswer());
      try { 
        task_12299_0.getSignatureBytes(byteArray0, privateKey0);
      } catch(InvalidKeyException e) {
         //
         // No installed provider supports this key: codegen.java.security.PrivateKey$MockitoMock$489480426
         //
         verifyException("java.security.Signature$Delegate", e);
      }
  }
}
