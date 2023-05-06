/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:45:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1281;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanServerConnection;
import javax.management.NotificationListener;
import javax.management.ObjectName;
import javax.management.RuntimeOperationsException;
import javax.management.relation.RelationService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1281_ESTest extends task_1281_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1281 task_1281_0 = new task_1281();
      ObjectName objectName0 = ObjectName.WILDCARD;
      MBeanServerConnection mBeanServerConnection0 = mock(MBeanServerConnection.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(mBeanServerConnection0).isRegistered(any(javax.management.ObjectName.class));
      RelationService relationService0 = new RelationService(true);
      try { 
        task_1281_0.addNotificationListener(mBeanServerConnection0, objectName0, relationService0);
      } catch(InstanceNotFoundException e) {
         //
         // MBean not found: *:*
         //
         verifyException("com.example.task_evaluated.task_1281", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_1281 task_1281_0 = new task_1281();
      MBeanServerConnection mBeanServerConnection0 = mock(MBeanServerConnection.class, new ViolatedAssumptionAnswer());
      RelationService relationService0 = new RelationService(true);
      try { 
        task_1281_0.addNotificationListener(mBeanServerConnection0, (ObjectName) null, relationService0);
      } catch(RuntimeOperationsException e) {
         //
         // Invalid argument
         //
         verifyException("com.example.task_evaluated.task_1281", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_1281 task_1281_0 = new task_1281();
      MBeanServerConnection mBeanServerConnection0 = mock(MBeanServerConnection.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(mBeanServerConnection0).isRegistered(any(javax.management.ObjectName.class));
      ObjectName objectName0 = new ObjectName("");
      RelationService relationService0 = new RelationService(false);
      task_1281_0.addNotificationListener(mBeanServerConnection0, objectName0, relationService0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_1281 task_1281_0 = new task_1281();
      ObjectName objectName0 = ObjectName.getInstance("");
      try { 
        task_1281_0.addNotificationListener((MBeanServerConnection) null, objectName0, (NotificationListener) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1281", e);
      }
  }
}