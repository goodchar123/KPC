/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:38:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.LDAPHelper;
import javax.naming.InvalidNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LDAPHelper_ESTest extends LDAPHelper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LDAPHelper lDAPHelper0 = new LDAPHelper();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        LDAPHelper.getLDAPComponent("", (-4931));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index -4931 is outside the range of valid components in the LDAP name
         //
         verifyException("com.example.task_evaluated.LDAPHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = LDAPHelper.getLDAPComponent("8cq=V|'u$", 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      try { 
        LDAPHelper.getLDAPComponent("u5hMC=L", 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index 1 is outside the range of valid components in the LDAP name
         //
         verifyException("com.example.task_evaluated.LDAPHelper", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        LDAPHelper.getLDAPComponent((String) null, 1902);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.naming.ldap.Rfc2253Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      try { 
        LDAPHelper.getLDAPComponent(")c Ao", (-2856));
      } catch(InvalidNameException e) {
         //
         // Invalid name: )c Ao
         //
         verifyException("javax.naming.ldap.Rfc2253Parser", e);
      }
  }
}
