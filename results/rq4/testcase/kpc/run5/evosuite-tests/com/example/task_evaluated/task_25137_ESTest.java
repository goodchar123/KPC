/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:50:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_25137;
import java.awt.Component;
import java.awt.Container;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_25137_ESTest extends task_25137_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_25137 task_25137_0 = new task_25137();
      Locale locale0 = new Locale("d=&e[cS)e5h'n*GA", "d=&e[cS)e5h'n*GA", "HU*");
      NumberFormat numberFormat0 = NumberFormat.getPercentInstance(locale0);
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField((Format) numberFormat0);
      // Undeclared exception!
      try { 
        task_25137_0.removeComponent((Container) null, jFormattedTextField0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_25137", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_25137 task_25137_0 = new task_25137();
      // Undeclared exception!
      try { 
        task_25137_0.removeComponent((Container) null, (Component) null);
      } catch(NullPointerException e) {
         //
         // Component cannot be null
         //
         verifyException("com.example.task_evaluated.task_25137", e);
      }
  }
}
