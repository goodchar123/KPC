/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:06:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import java.time.chrono.ChronoLocalDate;
import java.util.Vector;
import javax.swing.JList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Vector<ChronoLocalDate> vector0 = new Vector<ChronoLocalDate>();
      JList<Object> jList0 = new JList<Object>(vector0);
      task_26420_0.deleteComponentsInRange(jList0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Vector<ChronoLocalDate> vector0 = new Vector<ChronoLocalDate>();
      JList<Object> jList0 = new JList<Object>(vector0);
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(jList0, 1, 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange((Container) null, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}
