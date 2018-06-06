package com.leetcode.problems.code.algorithms.String;

public class LengthLastWord {

  /*Durch split*/
  public static int lengthOfLastWord1(String s) {
    String[] words = s.split(" ");
    if (words.length == 0) {
      return 0;
    } else {
      return words[words.length - 1].length();
    }
  }

  /*löschen leerzeichen von zwei stelle eines String.1.anfang stelle 2.end stelle
* durch while-schleife, man kann auch mit trim direkt leerzeichen löschen*/
  public static int lengthOfLastWord(String s) {
    if (s.length() == 0) {
      return 0;
    }

    while (s.endsWith(" ")) {
      s = s.substring(0, s.length() - 1);
    }

    while (s.startsWith(" ")) {

      s = s.substring(1, s.length());

    }
    for (int i = s.length() - 1; i >= 0; i--) {

      if ((s.charAt(i) == ' ')) {
        return (s.length() - 1 - i);
      }
    }

    return s.length();

  }

  public static int lengthOfLastWord2(String s) {
    if (s.length() == 0) {
      return 0;
    }
    s = s.trim();

    for (int i = s.length() - 1; i >= 0; i--) {

      if ((s.charAt(i) == ' ')) {
        return (s.length() - 1 - i);
      }
    }

    return s.length();

  }

  public static void main(String... args) {
    System.out.println(LengthLastWord.lengthOfLastWord("  a a "));
  }

}


