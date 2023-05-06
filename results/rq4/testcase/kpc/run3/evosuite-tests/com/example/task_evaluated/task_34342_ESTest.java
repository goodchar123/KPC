/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 05:13:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_34342;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiMessage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_34342_ESTest extends task_34342_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      task_34342 task_34342_0 = new task_34342();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      try { 
        task_34342.createMidiMessage(0, 0);
      } catch(InvalidMidiDataException e) {
         //
         // Invalid status byte for MIDI message.
         //
         verifyException("com.example.task_evaluated.task_34342", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MidiMessage midiMessage0 = task_34342.createMidiMessage(144, 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      try { 
        task_34342.createMidiMessage(2068, (-1605));
      } catch(InvalidMidiDataException e) {
         //
         // Invalid status byte for MIDI message.
         //
         verifyException("com.example.task_evaluated.task_34342", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      try { 
        task_34342.createMidiMessage(239, 212);
      } catch(InvalidMidiDataException e) {
         //
         // Invalid status byte for MIDI message.
         //
         verifyException("com.example.task_evaluated.task_34342", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      try { 
        task_34342.createMidiMessage(176, (-1));
      } catch(InvalidMidiDataException e) {
         //
         // Invalid MIDI channel.
         //
         verifyException("com.example.task_evaluated.task_34342", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      try { 
        task_34342.createMidiMessage(144, 2093);
      } catch(InvalidMidiDataException e) {
         //
         // Invalid MIDI channel.
         //
         verifyException("com.example.task_evaluated.task_34342", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MidiMessage midiMessage0 = task_34342.createMidiMessage(128, 1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MidiMessage midiMessage0 = task_34342.createMidiMessage(165, 1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MidiMessage midiMessage0 = task_34342.createMidiMessage(191, 15);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MidiMessage midiMessage0 = task_34342.createMidiMessage(203, 0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MidiMessage midiMessage0 = task_34342.createMidiMessage(212, 0);
  }
}
