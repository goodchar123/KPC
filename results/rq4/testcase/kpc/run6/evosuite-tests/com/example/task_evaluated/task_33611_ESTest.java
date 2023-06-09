/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:32:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_33611;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_33611_ESTest extends task_33611_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_33611 task_33611_0 = new task_33611();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString("X0YRIJL7X|n!B)y_o(", "", "`-VxI$jS?-q:yQG SL");
      } catch(IllegalArgumentException e) {
         //
         // Illegal group reference
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_33611.replaceString((String) null, "r2`KVA2^", "\"3LOM]0x;5C69f.f@q");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_33611", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      try { 
        task_33611.replaceString("com.example.task_evaluated.task_33611", "lG9%#mRp3Lck[*vdvp", "");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 17
         // lG9%#mRp3Lck[*vdvp
         //                  ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
