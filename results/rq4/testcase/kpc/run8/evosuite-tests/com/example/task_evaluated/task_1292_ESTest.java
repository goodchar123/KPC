/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:52:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1292;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1292_ESTest extends task_1292_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1292 task_1292_0 = new task_1292();
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      MBeanServer mBeanServer0 = mock(MBeanServer.class, new ViolatedAssumptionAnswer());
      doReturn(classLoader0).when(mBeanServer0).getClassLoaderFor(any(javax.management.ObjectName.class));
      ClassLoader classLoader1 = task_1292_0.getClassLoaderForMBean(mBeanServer0, "");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_1292 task_1292_0 = new task_1292();
      MBeanServer mBeanServer0 = mock(MBeanServer.class, new ViolatedAssumptionAnswer());
      doReturn((ClassLoader) null).when(mBeanServer0).getClassLoaderFor(any(javax.management.ObjectName.class));
      try { 
        task_1292_0.getClassLoaderForMBean(mBeanServer0, "");
      } catch(InstanceNotFoundException e) {
         //
         // MBean not found: 
         //
         verifyException("com.example.task_evaluated.task_1292", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_1292 task_1292_0 = new task_1292();
      MBeanServer mBeanServer0 = mock(MBeanServer.class, new ViolatedAssumptionAnswer());
      try { 
        task_1292_0.getClassLoaderForMBean(mBeanServer0, (String) null);
      } catch(NullPointerException e) {
         //
         // name cannot be null
         //
         verifyException("javax.management.ObjectName", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_1292 task_1292_0 = new task_1292();
      MBeanServer mBeanServer0 = mock(MBeanServer.class, new ViolatedAssumptionAnswer());
      try { 
        task_1292_0.getClassLoaderForMBean(mBeanServer0, "YCt`{d>x8");
      } catch(MalformedObjectNameException e) {
         //
         // Key properties cannot be empty
         //
         verifyException("javax.management.ObjectName", e);
      }
  }
}
