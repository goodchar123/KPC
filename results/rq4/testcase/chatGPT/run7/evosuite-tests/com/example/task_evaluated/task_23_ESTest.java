/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:08:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.example.task_evaluated.task_23;
import javax.management.AttributeChangeNotificationFilter;
import javax.management.MBeanServerConnection;
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
      ObjectName objectName0 = ObjectName.WILDCARD;
      AttributeChangeNotificationFilter attributeChangeNotificationFilter0 = new AttributeChangeNotificationFilter();
      task_23_MBeanServerConnectionHandler0.removeNotificationListener(objectName0, objectName0, attributeChangeNotificationFilter0, task_23_0);
  }
}
