/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu May 04 05:55:35 GMT 2023
 */

package com.example.task_evaluated;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class task_6068_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.example.task_evaluated.task_6068"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/y4/cf7gqtc93s94zcyxyyt79kdr0000gn/T/"); 
    java.lang.System.setProperty("user.country", "CN"); 
    java.lang.System.setProperty("user.dir", "/Volumes/data/KAT-experiment/dataset/Task_evaluated/target"); 
    java.lang.System.setProperty("user.home", "/Users/renxiaoxue"); 
    java.lang.System.setProperty("user.language", "zh"); 
    java.lang.System.setProperty("user.name", "renxiaoxue"); 
    java.lang.System.setProperty("user.timezone", "Asia/Shanghai"); 
    java.lang.System.setProperty("http.proxyHost", "127.0.0.1"); 
    java.lang.System.setProperty("http.nonProxyHosts", "17.0.0.0/8|*.17.0.0.0/8|configuration.apple.com|*.configuration.apple.com|192.168.0.0/16|*.192.168.0.0/16|172.16.0.0/12|*.172.16.0.0/12|guzzoni.apple.com|*.guzzoni.apple.com|captive.apple.com|*.captive.apple.com|push.apple.com|*.push.apple.com|smp-device-content.apple.com|*.smp-device-content.apple.com|127.0.0.1|local|*.local|xp.apple.com|*.xp.apple.com|push-apple.com.akadns.net|*.push-apple.com.akadns.net|100.64.0.0/10|*.100.64.0.0/10|api.smoot.apple.com|*.api.smoot.apple.com|localhost|*.localhost|193.168.0.0/24|*.193.168.0.0/24|10.0.0.0/8|*.10.0.0.0/8|ess.apple.com|*.ess.apple.com"); 
    java.lang.System.setProperty("http.proxyPort", "8118"); 
    java.lang.System.setProperty("socksProxyHost", "127.0.0.1"); 
    java.lang.System.setProperty("ftp.nonProxyHosts", "17.0.0.0/8|*.17.0.0.0/8|configuration.apple.com|*.configuration.apple.com|192.168.0.0/16|*.192.168.0.0/16|172.16.0.0/12|*.172.16.0.0/12|guzzoni.apple.com|*.guzzoni.apple.com|captive.apple.com|*.captive.apple.com|push.apple.com|*.push.apple.com|smp-device-content.apple.com|*.smp-device-content.apple.com|127.0.0.1|local|*.local|xp.apple.com|*.xp.apple.com|push-apple.com.akadns.net|*.push-apple.com.akadns.net|100.64.0.0/10|*.100.64.0.0/10|api.smoot.apple.com|*.api.smoot.apple.com|localhost|*.localhost|193.168.0.0/24|*.193.168.0.0/24|10.0.0.0/8|*.10.0.0.0/8|ess.apple.com|*.ess.apple.com"); 
    java.lang.System.setProperty("socksProxyPort", "8119"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(task_6068_ESTest_scaffolding.class.getClassLoader() ,
      "com.example.task_evaluated.task_6068",
      "com.example.task_evaluated.task_6068$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(task_6068_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.example.task_evaluated.task_6068",
      "com.example.task_evaluated.task_6068$1"
    );
  }
}
