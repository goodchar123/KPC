/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:54:50 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_15048;
import java.util.Dictionary;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15048_ESTest extends task_15048_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15048 task_15048_0 = new task_15048();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = task_15048.getValue((Dictionary) null, (Object) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Hashtable<Object, String> hashtable0 = new Hashtable<Object, String>(1);
      Integer integer0 = new Integer(1);
      Object object0 = task_15048.getValue(hashtable0, integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hashtable<Object, String> hashtable0 = new Hashtable<Object, String>(1);
      Object object0 = task_15048.getValue(hashtable0, (Object) null);
  }
}
