/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:26:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1632;
import java.util.HashMap;
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
      // Undeclared exception!
      try { 
        task_1632_0.setOperationDescriptor((ModelMBeanOperationInfo) null, (Descriptor) null);
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
      MBeanParameterInfo[] mBeanParameterInfoArray0 = new MBeanParameterInfo[2];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ImmutableDescriptor immutableDescriptor0 = new ImmutableDescriptor(hashMap0);
      ModelMBeanOperationInfo modelMBeanOperationInfo0 = new ModelMBeanOperationInfo("!<|y='F3!I3w3z", "!<|y='F3!I3w3z", mBeanParameterInfoArray0, "", 604);
      // Undeclared exception!
      try { 
        task_1632_0.setOperationDescriptor(modelMBeanOperationInfo0, immutableDescriptor0);
      } catch(RuntimeOperationsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("javax.management.ImmutableDescriptor", e);
      }
  }
}
