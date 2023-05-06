/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:11:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_28766;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_28766_ESTest extends task_28766_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      task_28766 task_28766_0 = new task_28766(bufferedImage0);
      // Undeclared exception!
      try { 
        task_28766_0.getSample((-1367), 55, 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Coordinates or band index out of bounds
         //
         verifyException("com.example.task_evaluated.task_28766", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      task_28766 task_28766_0 = new task_28766(bufferedImage0);
      double double0 = task_28766_0.getSample(0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      task_28766 task_28766_0 = new task_28766(bufferedImage0);
      // Undeclared exception!
      try { 
        task_28766_0.getSample(1, 1, 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Coordinates or band index out of bounds
         //
         verifyException("com.example.task_evaluated.task_28766", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      task_28766 task_28766_0 = new task_28766(bufferedImage0);
      // Undeclared exception!
      try { 
        task_28766_0.getSample(0, (-1329), (-519));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Coordinates or band index out of bounds
         //
         verifyException("com.example.task_evaluated.task_28766", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      task_28766 task_28766_0 = new task_28766(bufferedImage0);
      // Undeclared exception!
      try { 
        task_28766_0.getSample(0, 1, (-381));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Coordinates or band index out of bounds
         //
         verifyException("com.example.task_evaluated.task_28766", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      task_28766 task_28766_0 = new task_28766(bufferedImage0);
      // Undeclared exception!
      try { 
        task_28766_0.getSample(0, 0, (-1063));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Coordinates or band index out of bounds
         //
         verifyException("com.example.task_evaluated.task_28766", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      task_28766 task_28766_0 = new task_28766(bufferedImage0);
      // Undeclared exception!
      try { 
        task_28766_0.getSample(0, 0, 747);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Coordinates or band index out of bounds
         //
         verifyException("com.example.task_evaluated.task_28766", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      task_28766 task_28766_0 = new task_28766((BufferedImage) null);
      // Undeclared exception!
      try { 
        task_28766_0.getSample((-1), 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_28766", e);
      }
  }
}
