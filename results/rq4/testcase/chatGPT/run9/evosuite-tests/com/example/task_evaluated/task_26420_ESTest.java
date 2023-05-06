/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:48:48 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_26420;
import java.awt.Container;
import javax.swing.Box;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_26420_ESTest extends task_26420_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Box box0 = Box.createVerticalBox();
      task_26420_0.deleteComponentsInRange(box0, 0, (-1619));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_26420 task_26420_0 = new task_26420();
      Box box0 = Box.createVerticalBox();
      // Undeclared exception!
      try { 
        task_26420_0.deleteComponentsInRange(box0, 0, 1);
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
        task_26420_0.deleteComponentsInRange((Container) null, 2616, 2616);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_26420", e);
      }
  }
}
