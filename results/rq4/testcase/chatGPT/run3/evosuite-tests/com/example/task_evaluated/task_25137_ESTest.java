/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:07:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_25137;
import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_25137_ESTest extends task_25137_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_25137 task_25137_0 = new task_25137();
      JMenu jMenu0 = new JMenu();
      JPopupMenu jPopupMenu0 = jMenu0.getPopupMenu();
      JMenuItem jMenuItem0 = jPopupMenu0.add((JMenuItem) jMenu0);
      JOptionPane jOptionPane0 = new JOptionPane("~qp %`kjF$4]'zS3", 0, 0);
      JInternalFrame jInternalFrame0 = jOptionPane0.createInternalFrame(jMenuItem0, "V!VGFfD4arZJa5|tG-");
      // Undeclared exception!
      try { 
        task_25137_0.removeComponent(jInternalFrame0, (Component) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.Container", e);
      }
  }
}