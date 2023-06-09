/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:58:59 GMT 2023
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
      ZoneId zoneId0 = ZoneId.systemDefault();
      Clock clock0 = MockClock.tickSeconds(zoneId0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
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
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now();
      ZonedDateTime zonedDateTime1 = task_6266.withDayOfMonth(zonedDateTime0, 1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      Clock clock0 = MockClock.system(zoneOffset0);
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now(clock0);
      // Undeclared exception!
      try { 
        task_6266.withDayOfMonth(zonedDateTime0, 750);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 750
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1371);
      // Undeclared exception!
      try { 
        task_6266.of(14, 1, 0, 1, 0, 1371, 1371, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 0
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(0, 1, 1, 0, (-147), 59, (-1045), zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid minute: -147
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of(410, 1, 410, 1, 410, 1, 1, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid day of month: 410
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, (-18), (-1465), 1124, 1, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid hour: -18
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(1);
      // Undeclared exception!
      try { 
        task_6266.of((-4018), 6, 1, 2673, (-12), 4, (-771), zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid hour: 2673
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6266.of((-1), 1, 1, 1, 1, 1124, 6, zoneOffset0);
      } catch(DateTimeException e) {
         //
         // Invalid second: 1124
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(3934, 1, 1, 1, 1393, 0, 1, (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid minute: 1393
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      // Undeclared exception!
      try { 
        task_6266.of((-366), 1, 1, 1, 35, (-366), 1, zoneId0);
      } catch(DateTimeException e) {
         //
         // Invalid second: -366
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(1, 1, 1, 1, 1, 1, (-889), (ZoneId) null);
      } catch(DateTimeException e) {
         //
         // Invalid nanoOfSecond: -889
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6266.of(2, 2, 2, 2, 2, 2, 1000000006, (ZoneId) null);
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
        task_6266.of(999999999, 2, 2, 2, 2, 2, 999999999, (ZoneId) null);
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
        task_6266.withDayOfMonth((ZonedDateTime) null, (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6266", e);
      }
  }
}
