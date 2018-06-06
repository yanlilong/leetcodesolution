package com.leetcode.problems.code.algorithms.String;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentAttendRecordITest {

  @Test
  public void studentAttendRecordI() throws Exception {
    assertTrue(StudentAttendRecordI.studentAttendRecordI("PPALLP"));
    assertFalse(StudentAttendRecordI.studentAttendRecordI("PPALLL"));
    assertTrue(StudentAttendRecordI.studentAttendRecordI("LALL"));

  }

}