/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 04:41:50 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.example.task_evaluated.task_23;
import javax.management.MBeanServerConnection;
import javax.management.NotificationFilterSupport;
import javax.management.ObjectName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_23_ESTest extends task_23_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_23 task_23_0 = new task_23();
      MBeanServerConnection mBeanServerConnection0 = mock(MBeanServerConnection.class, new ViolatedAssumptionAnswer());
      task_23.MBeanServerConnectionHandler task_23_MBeanServerConnectionHandler0 = task_23_0.new MBeanServerConnectionHandler(mBeanServerConnection0);
      ObjectName objectName0 = new ObjectName("com.example.task_evaluated.task_23", "com.example.task_evaluated.task_23", "com.example.task_evaluated.task_23");
      NotificationFilterSupport notificationFilterSupport0 = new NotificationFilterSupport();
      Object object0 = new Object();
      task_23_MBeanServerConnectionHandler0.removeNotificationListener(objectName0, objectName0, notificationFilterSupport0, object0);
  }
}