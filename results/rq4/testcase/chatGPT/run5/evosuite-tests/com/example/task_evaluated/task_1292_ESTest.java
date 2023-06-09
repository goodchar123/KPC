/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:28:50 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1292;
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
      try { 
        task_1292_0.getClassLoaderForMBean((MBeanServer) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1292", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_1292 task_1292_0 = new task_1292();
      MBeanServer mBeanServer0 = mock(MBeanServer.class, new ViolatedAssumptionAnswer());
      try { 
        task_1292_0.getClassLoaderForMBean(mBeanServer0, "{p3ZL4X");
      } catch(MalformedObjectNameException e) {
         //
         // Key properties cannot be empty
         //
         verifyException("javax.management.ObjectName", e);
      }
  }
}
