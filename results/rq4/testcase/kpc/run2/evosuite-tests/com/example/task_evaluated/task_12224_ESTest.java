/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 23:03:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12224;
import java.security.KeyStore;
import java.security.KeyStoreException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12224_ESTest extends task_12224_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12224 task_12224_0 = new task_12224();
      KeyStore keyStore0 = KeyStore.getInstance("JKS");
      try { 
        task_12224_0.isCertificateEntry(keyStore0, "JKS");
      } catch(KeyStoreException e) {
         //
         // Uninitialized keystore
         //
         verifyException("java.security.KeyStore", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_12224 task_12224_0 = new task_12224();
      try { 
        task_12224_0.isCertificateEntry((KeyStore) null, "Keystore has not been initialized");
      } catch(KeyStoreException e) {
         //
         // Keystore has not been initialized
         //
         verifyException("com.example.task_evaluated.task_12224", e);
      }
  }
}
