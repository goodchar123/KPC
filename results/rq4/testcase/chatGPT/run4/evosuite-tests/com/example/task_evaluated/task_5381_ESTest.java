/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:42:30 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_5381;
import java.util.prefs.PreferenceChangeListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_5381_ESTest extends task_5381_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_5381 task_5381_0 = new task_5381();
      PreferenceChangeListener preferenceChangeListener0 = mock(PreferenceChangeListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        task_5381_0.removePreferenceChangeListener(preferenceChangeListener0);
      } catch(IllegalArgumentException e) {
         //
         // Listener not registered.
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }
}
