/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 19:45:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1632;
import javax.management.Descriptor;
import javax.management.ImmutableDescriptor;
import javax.management.MBeanParameterInfo;
import javax.management.RuntimeOperationsException;
import javax.management.modelmbean.ModelMBeanOperationInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1632_ESTest extends task_1632_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1632 task_1632_0 = new task_1632();
      MBeanParameterInfo[] mBeanParameterInfoArray0 = new MBeanParameterInfo[3];
      ModelMBeanOperationInfo modelMBeanOperationInfo0 = new ModelMBeanOperationInfo("D{,O", (String) null, mBeanParameterInfoArray0, "i&/U5<g1w`^q", 1, (Descriptor) null);
      // Undeclared exception!
      try { 
        task_1632_0.setOperationDescriptor(modelMBeanOperationInfo0, (Descriptor) null);
      } catch(RuntimeOperationsException e) {
         //
         // The isValid() method of the Descriptor object itself returned false,one or more required fields are invalid. Descriptor:displayName=D{,O, role=operation
         //
         verifyException("javax.management.modelmbean.ModelMBeanOperationInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_1632 task_1632_0 = new task_1632();
      ImmutableDescriptor immutableDescriptor0 = ImmutableDescriptor.EMPTY_DESCRIPTOR;
      // Undeclared exception!
      try { 
        task_1632_0.setOperationDescriptor((ModelMBeanOperationInfo) null, immutableDescriptor0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1632", e);
      }
  }
}
