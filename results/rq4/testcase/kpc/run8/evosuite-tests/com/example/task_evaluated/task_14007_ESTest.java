/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:58:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14007;
import java.awt.Window;
import java.sql.ClientInfoStatus;
import java.sql.PseudoColumnUsage;
import java.text.Normalizer;
import java.util.EnumSet;
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
      Window.Type[] window_TypeArray0 = new Window.Type[1];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(window_TypeArray0);
      } catch(NullPointerException e) {
         //
         // Element cannot be null
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PseudoColumnUsage[] pseudoColumnUsageArray0 = new PseudoColumnUsage[0];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(pseudoColumnUsageArray0);
      } catch(NullPointerException e) {
         //
         // Elements cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Window.Type[] window_TypeArray0 = new Window.Type[1];
      Window.Type window_Type0 = Window.Type.UTILITY;
      window_TypeArray0[0] = window_Type0;
      EnumSet<Window.Type> enumSet0 = task_14007.createEnumSet(window_TypeArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Normalizer.Form[] normalizer_FormArray0 = new Normalizer.Form[3];
      Normalizer.Form normalizer_Form0 = Normalizer.Form.NFD;
      normalizer_FormArray0[0] = normalizer_Form0;
      normalizer_FormArray0[1] = normalizer_Form0;
      normalizer_FormArray0[2] = normalizer_Form0;
      EnumSet<Normalizer.Form> enumSet0 = task_14007.createEnumSet(normalizer_FormArray0);
  }
}
