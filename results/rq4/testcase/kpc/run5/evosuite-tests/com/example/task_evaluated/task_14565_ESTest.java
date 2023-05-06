/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:28:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14565;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14565_ESTest extends task_14565_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14565 task_14565_0 = new task_14565();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[8];
      task_14565.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14565.findNextOccurrence("-Y?JH<P(Mm7O/AiI<", "y&B^i8,>*4W");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_14565.findNextOccurrence("-j", "-j");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14565.findNextOccurrence((String) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      String string0 = "oJuiut^+nJ>\\mN/Y|\"Y";
      // Undeclared exception!
      try { 
        task_14565.findNextOccurrence(stringArray0[0], string0);
      } catch(PatternSyntaxException e) {
         //
         // Illegal/unsupported escape sequence near index 12
         // oJuiut^+nJ>\\mN/Y|\"Y
         //             ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
