/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:46:18 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_22965;
import java.awt.Font;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_22965_ESTest extends task_22965_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_22965 task_22965_0 = new task_22965();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Font font0 = Font.decode("Br0");
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex("Br0", font0, (-1), (-1));
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = task_22965.findBreakIndex("", (Font) null, 0, 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex((String) null, (Font) null, 1031, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_22965", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, Object> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, Object>();
      Font font0 = new Font(hashMap0);
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex("com.example.task_evaluated.task_22965", font0, 0, 0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
