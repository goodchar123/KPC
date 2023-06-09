/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:41:29 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12188;
import java.io.ByteArrayOutputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12188_ESTest extends task_12188_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[7];
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      task_12188 task_12188_0 = new task_12188();
      try { 
        task_12188_0.storeKeystore(byteArrayOutputStream0, charArray0, (KeyStore) null);
      } catch(KeyStoreException e) {
         //
         // Keystore has not been initialized (loaded)
         //
         verifyException("com.example.task_evaluated.task_12188", e);
      }
  }
}
