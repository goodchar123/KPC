/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:31:39 GMT 2023
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
      String[] stringArray0 = new String[0];
      ImmutableDescriptor immutableDescriptor0 = new ImmutableDescriptor(stringArray0, stringArray0);
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_1632 task_1632_0 = new task_1632();
      MBeanParameterInfo[] mBeanParameterInfoArray0 = new MBeanParameterInfo[7];
      ModelMBeanOperationInfo modelMBeanOperationInfo0 = new ModelMBeanOperationInfo("Rm8hn9W03*Hfe]*.", "2", mBeanParameterInfoArray0, "Rm8hn9W03*Hfe]*.", 0, (Descriptor) null);
      // Undeclared exception!
      try { 
        task_1632_0.setOperationDescriptor(modelMBeanOperationInfo0, (Descriptor) null);
      } catch(RuntimeOperationsException e) {
         //
         // The isValid() method of the Descriptor object itself returned false,one or more required fields are invalid. Descriptor:displayName=Rm8hn9W03*Hfe]*., role=operation
         //
         verifyException("javax.management.modelmbean.ModelMBeanOperationInfo", e);
      }
  }
}