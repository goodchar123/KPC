/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:21:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6266;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
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
      Clock clock0 = MockClock.systemUTC();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth(zonedDateTime0, (-3407));
      } catch(DateTimeException e) {
         //
         // Invalid day of month: -3407
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Clock clock0 = MockClock.systemUTC();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      ZonedDateTime zonedDateTime1 = task_6266.withDayOfMonth(zonedDateTime0, 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth(zonedDateTime0, 88);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 88
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of((-1073), 1, (-748), 1, (-3289), (-1073), (-1073), (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: -748
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      // Undeclared exception!
      try { 
        task_6266.of(4366, 1, 4366, (-20), 2, (-572), (-17), zoneId0);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 4366
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of((-191), 1, 1, (-1013), (-191), (-3286), 0, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid hour: -1013
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(59, 1, 1, 1907, 59, (-3288), 2688, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid hour: 1907
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of((-200), 1, 1, 1, (-200), (-3286), 0, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid minute: -200
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(60, 1, 1, 1, 60, 1, 1, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid minute: 60
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(59, 1, 1, 1, 59, (-3295), 0, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid second: -3295
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(0, 1, 1, 1, 1, 999999999, 1, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid second: 999999999
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(59, 1, 1, 1, 59, 1, (-25), zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid nanoOfSecond: -25
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      // Undeclared exception!
      try { 
        task_6266.of(4, 4, 4, 4, 4, 0, 1000000002, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid nanoOfSecond: 1000000002
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(42, 2, 2, 2, 42, 2, 42, (ZoneId) null);
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
        task_6266.withDayOfMonth((ZonedDateTime) null, (-934));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }
}
