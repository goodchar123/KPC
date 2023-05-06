/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:02:08 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_16210;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16210_ESTest extends task_16210_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16210 task_16210_0 = new task_16210();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        task_16210.aesEncryptDecrypt((byte[]) null, (byte[]) null, 1);
      } catch(InvalidKeyException e) {
         //
         // Invalid key length. Key must be 16 bytes long.
         //
         verifyException("com.example.task_evaluated.task_16210", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      try { 
        task_16210.aesEncryptDecrypt(byteArray0, byteArray0, 0);
      } catch(InvalidKeyException e) {
         //
         // Invalid key length. Key must be 16 bytes long.
         //
         verifyException("com.example.task_evaluated.task_16210", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      try { 
        task_16210.aesEncryptDecrypt(byteArray0, byteArray0, 1763);
      } catch(IllegalArgumentException e) {
         //
         // Invalid cipher mode. Mode must be either Cipher.ENCRYPT_MODE or Cipher.DECRYPT_MODE.
         //
         verifyException("com.example.task_evaluated.task_16210", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      byte[] byteArray1 = task_16210.aesEncryptDecrypt(byteArray0, byteArray0, 1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[16];
      try { 
        task_16210.aesEncryptDecrypt(byteArray0, byteArray0, 2);
      } catch(BadPaddingException e) {
      }
  }
}
