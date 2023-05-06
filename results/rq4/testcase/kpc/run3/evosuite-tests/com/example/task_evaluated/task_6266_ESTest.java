/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:35:34 GMT 2023
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
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth(zonedDateTime0, (-190));
      } catch(DateTimeException e) {
         //
         // Invalid day of month: -190
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      ZonedDateTime zonedDateTime1 = task_6266.withDayOfMonth(zonedDateTime0, 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth(zonedDateTime0, 59);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 59
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      // Undeclared exception!
      try { 
        task_6266.of(2, 2, (-2724), (-1), (-2724), (-2724), 2, zoneId0);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: -2724
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(0);
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 999999999, 0, (-854), 0, 1, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 999999999
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      ZoneId zoneId1 = zoneId0.normalized();
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, 1024, 1024, 1, 1024, zoneId1);
      } catch(DateTimeException e) {
         //
         // Invalid hour: 1024
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      // Undeclared exception!
      try { 
        task_6266.of(0, 1, 1, (-1), 0, (-1), 0, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid hour: -1
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours((-1));
      // Undeclared exception!
      try { 
        task_6266.of((-1), 1, 1, 0, 1, 1, (-1), zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid nanoOfSecond: -1
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      // Undeclared exception!
      try { 
        task_6266.of(0, 1, 1, 0, (-1312), 1054, 0, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid minute: -1312
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(12, 12);
      // Undeclared exception!
      try { 
        task_6266.of(12, 12, 12, 12, 374, (-1), 28, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid minute: 374
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      ZoneOffset zoneOffset0 = ZoneOffset.from(zonedDateTime0);
      // Undeclared exception!
      try { 
        task_6266.of(0, 1, 1, 0, 0, (-1317), 477, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid second: -1317
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      // Undeclared exception!
      try { 
        task_6266.of(0, 1, 1, 0, 1, 1054, 0, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid second: 1054
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      // Undeclared exception!
      try { 
        task_6266.of(11, 11, 11, 11, 0, 0, 1000000012, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid nanoOfSecond: 1000000012
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(11, 11, 11, 11, 11, 11, 11, (ZoneId) null);
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
