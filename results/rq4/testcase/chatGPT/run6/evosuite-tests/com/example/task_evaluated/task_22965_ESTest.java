/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:11:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_22965;
import java.awt.Font;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;
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
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      int int0 = task_22965.findBreakIndex("", font0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Font font0 = new Font((Map<? extends AttributedCharacterIterator.Attribute, ?>) null);
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex("m\"c[D;X/0", font0, 0, 447);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<AttributedCharacterIterator.Attribute, String> hashMap0 = new HashMap<AttributedCharacterIterator.Attribute, String>();
      Font font0 = Font.getFont((Map<? extends AttributedCharacterIterator.Attribute, ?>) hashMap0);
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex((String) null, font0, (-1377), (-884));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_22965", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex("com.example.task_evaluated.task_22965$1", (Font) null, (-39), 218);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
