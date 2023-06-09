/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:42:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14007;
import java.awt.Component;
import java.awt.MultipleGradientPaint;
import java.util.EnumSet;
import javax.annotation.Resource;
import javax.jws.WebParam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14007_ESTest extends task_14007_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14007 task_14007_0 = new task_14007();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14007.createEnumSet((Resource.AuthenticationType[]) null);
      } catch(NullPointerException e) {
         //
         // Elements cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Component.BaselineResizeBehavior[] component_BaselineResizeBehaviorArray0 = new Component.BaselineResizeBehavior[6];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(component_BaselineResizeBehaviorArray0);
      } catch(NullPointerException e) {
         //
         // Element cannot be null
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WebParam.Mode[] webParam_ModeArray0 = new WebParam.Mode[0];
      // Undeclared exception!
      try { 
        task_14007.createEnumSet(webParam_ModeArray0);
      } catch(NullPointerException e) {
         //
         // Elements cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_14007", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Component.BaselineResizeBehavior[] component_BaselineResizeBehaviorArray0 = new Component.BaselineResizeBehavior[6];
      Component.BaselineResizeBehavior component_BaselineResizeBehavior0 = Component.BaselineResizeBehavior.OTHER;
      component_BaselineResizeBehaviorArray0[0] = component_BaselineResizeBehavior0;
      component_BaselineResizeBehaviorArray0[1] = component_BaselineResizeBehaviorArray0[0];
      component_BaselineResizeBehaviorArray0[2] = component_BaselineResizeBehaviorArray0[0];
      component_BaselineResizeBehaviorArray0[3] = component_BaselineResizeBehaviorArray0[2];
      component_BaselineResizeBehaviorArray0[4] = component_BaselineResizeBehavior0;
      component_BaselineResizeBehaviorArray0[5] = component_BaselineResizeBehaviorArray0[2];
      EnumSet<Component.BaselineResizeBehavior> enumSet0 = task_14007.createEnumSet(component_BaselineResizeBehaviorArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MultipleGradientPaint.ColorSpaceType[] multipleGradientPaint_ColorSpaceTypeArray0 = new MultipleGradientPaint.ColorSpaceType[1];
      MultipleGradientPaint.ColorSpaceType multipleGradientPaint_ColorSpaceType0 = MultipleGradientPaint.ColorSpaceType.SRGB;
      multipleGradientPaint_ColorSpaceTypeArray0[0] = multipleGradientPaint_ColorSpaceType0;
      EnumSet<MultipleGradientPaint.ColorSpaceType> enumSet0 = task_14007.createEnumSet(multipleGradientPaint_ColorSpaceTypeArray0);
  }
}
