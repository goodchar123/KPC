/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:24:51 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18096;
import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.SimpleScriptContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18096_ESTest extends task_18096_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18096 task_18096_0 = new task_18096();
      SimpleScriptContext simpleScriptContext0 = new SimpleScriptContext();
      // Undeclared exception!
      try { 
        task_18096_0.bindVariable(simpleScriptContext0, "+ewN&7DQPkze", "+ewN&7DQPkze", 140);
      } catch(IllegalArgumentException e) {
         //
         // Illegal scope value.
         //
         verifyException("javax.script.SimpleScriptContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18096 task_18096_0 = new task_18096();
      SimpleScriptContext simpleScriptContext0 = new SimpleScriptContext();
      // Undeclared exception!
      try { 
        task_18096_0.bindVariable(simpleScriptContext0, (String) null, (Object) null, 100);
      } catch(NullPointerException e) {
         //
         // Variable name cannot be null
         //
         verifyException("com.example.task_evaluated.task_18096", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18096 task_18096_0 = new task_18096();
      SimpleScriptContext simpleScriptContext0 = new SimpleScriptContext();
      // Undeclared exception!
      try { 
        task_18096_0.bindVariable(simpleScriptContext0, "", simpleScriptContext0, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid variable name or scope
         //
         verifyException("com.example.task_evaluated.task_18096", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_18096 task_18096_0 = new task_18096();
      SimpleScriptContext simpleScriptContext0 = new SimpleScriptContext();
      // Undeclared exception!
      try { 
        task_18096_0.bindVariable(simpleScriptContext0, "HT0_z=&'pnlf&!", simpleScriptContext0, 1);
      } catch(IllegalArgumentException e) {
         //
         // Invalid variable name or scope
         //
         verifyException("com.example.task_evaluated.task_18096", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_18096 task_18096_0 = new task_18096();
      SimpleScriptContext simpleScriptContext0 = new SimpleScriptContext();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_18096_0.bindVariable(simpleScriptContext0, "f9+]Pey)\"/=(w'", object0, 780);
      } catch(IllegalArgumentException e) {
         //
         // Invalid variable name or scope
         //
         verifyException("com.example.task_evaluated.task_18096", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_18096 task_18096_0 = new task_18096();
      // Undeclared exception!
      try { 
        task_18096_0.bindVariable((ScriptContext) null, "[#:2Sm", (Object) null, 100);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_18096 task_18096_0 = new task_18096();
      // Undeclared exception!
      try { 
        task_18096_0.executeScript((CompiledScript) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18096", e);
      }
  }
}
