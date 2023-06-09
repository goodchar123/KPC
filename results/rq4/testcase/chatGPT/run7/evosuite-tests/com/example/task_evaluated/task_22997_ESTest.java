/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:01:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_22997;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_22997_ESTest extends task_22997_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_22997 task_22997_0 = new task_22997();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      String string0 = task_22997.convertDigits("com.example.task_evaluated.task_22997", 670, 0, locale0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      String string0 = task_22997.convertDigits("-6Nu>UGiB@<]5u9R~6$", 0, 4061, locale0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      // Undeclared exception!
      try { 
        task_22997.convertDigits((String) null, (-653), (-653), locale0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = new Locale("", "");
      // Undeclared exception!
      try { 
        task_22997.convertDigits("x>7L2_mrQ", (-272), 1, locale0);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
