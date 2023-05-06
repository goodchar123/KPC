/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:54:21 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6266;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6266_ESTest extends task_6266_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      task_6266 task_6266_0 = new task_6266();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.ofStrict(localDateTime0, zoneOffset0, zoneOffset0);
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth(zonedDateTime0, 0);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 0
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(625);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth(zonedDateTime0, 625);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 625
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      ZonedDateTime zonedDateTime1 = task_6266.withDayOfMonth(zonedDateTime0, 1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      // Undeclared exception!
      try { 
        task_6266.of(2328, 1, 0, 1913, 0, 1, (-1), zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 0
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 866, 0, 866, (-3229), (-155), (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 866
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, (-1195), 1, (-1195), 1, zoneId0);
      } catch(DateTimeException e) {
         //
         // Invalid hour: -1195
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(2139, 1, 30, 999999999, 0, 2139, 1, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid hour: 999999999
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, 0, (-1128), 866, 866, (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid minute: -1128
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(23, 1, 1, 23, 982, 999999999, 982, (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid minute: 982
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(3461, 1, 1, 1, 0, (-1), 999999999, (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid second: -1
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, 1, 1, 2328, 1, (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid second: 2328
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, 0, 0, 1, (-30), zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid nanoOfSecond: -30
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      // Undeclared exception!
      try { 
        task_6266.of(8, 8, 8, 8, 8, 8, 1000000006, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid nanoOfSecond: 1000000006
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, 1, 1, 1, 1, (ZoneId) null);
      } catch(NullPointerException e) {
         //
         // zone
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth((ZonedDateTime) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }
}
