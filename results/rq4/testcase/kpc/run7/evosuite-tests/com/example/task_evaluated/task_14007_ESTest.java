/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:24:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14007;
import java.sql.ClientInfoStatus;
import java.util.EnumSet;
import java.util.Locale;
import javax.annotation.Resource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14007_ESTest extends task_14007_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14007 task_14007_0 = new task_14007();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14007.createEnumSet((ClientInfoStatus[]) null);
      } catch(NullPointerException e) {
         //
         // Elements cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale.Category[] locale_CategoryArray0 = new Locale.Category[9];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(locale_CategoryArray0);
      } catch(NullPointerException e) {
         //
         // Element cannot be null
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Resource.AuthenticationType[] resource_AuthenticationTypeArray0 = new Resource.AuthenticationType[0];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(resource_AuthenticationTypeArray0);
      } catch(NullPointerException e) {
         //
         // Elements cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale.Category[] locale_CategoryArray0 = new Locale.Category[9];
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      locale_CategoryArray0[0] = locale_Category0;
      locale_CategoryArray0[1] = locale_CategoryArray0[0];
      locale_CategoryArray0[2] = locale_CategoryArray0[1];
      locale_CategoryArray0[3] = locale_CategoryArray0[0];
      locale_CategoryArray0[4] = locale_CategoryArray0[0];
      locale_CategoryArray0[5] = locale_CategoryArray0[0];
      locale_CategoryArray0[6] = locale_CategoryArray0[3];
      locale_CategoryArray0[7] = locale_Category0;
      locale_CategoryArray0[8] = locale_Category0;
      EnumSet<Locale.Category> enumSet0 = task_14007.createEnumSet(locale_CategoryArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Thread.State[] thread_StateArray0 = new Thread.State[1];
      Thread.State thread_State0 = Thread.State.RUNNABLE;
      thread_StateArray0[0] = thread_State0;
      EnumSet<Thread.State> enumSet0 = task_14007.createEnumSet(thread_StateArray0);
  }
}
