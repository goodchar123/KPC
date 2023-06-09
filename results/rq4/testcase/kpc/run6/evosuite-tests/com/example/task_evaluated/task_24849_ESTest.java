/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:42:50 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_24849;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JTextArea;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_24849_ESTest extends task_24849_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_24849 task_24849_0 = new task_24849();
      // Undeclared exception!
      try { 
        task_24849_0.removeComponent((Container) null, (Component) null);
      } catch(NullPointerException e) {
         //
         // Component cannot be null
         //
         verifyException("com.example.task_evaluated.task_24849", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_24849 task_24849_0 = new task_24849();
      JTextArea jTextArea0 = new JTextArea("");
      // Undeclared exception!
      try { 
        task_24849_0.removeComponent((Container) null, jTextArea0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_24849", e);
      }
  }
}
