package com.leetcode.problems.code.algorithms.String;

public class AddBinary {

  public static String addBinary(String a, String b) {
    char placeValue = '0';
    StringBuilder result = new StringBuilder();
    int lengthA=a.length();
    int lengthB=b.length();

      if(lengthA>lengthB){
        for(int m=0;m< lengthA-lengthB;m++){
          b="0"+b;
        }
      }else{
        for(int m=0;m< lengthB-lengthA;m++){
          a="0"+a;
        }

      }

char [] charArrayA=a.toCharArray();
      char[] charArrayB=b.toCharArray();
    for (int i = charArrayA.length - 1, j = charArrayB.length - 1; i >= 0 && j >= 0; i--, j--) {
      if (Character.getNumericValue(charArrayA[i]) +
          Character.getNumericValue(charArrayB[j]) == 0) {
        if (Character.getNumericValue(placeValue) == 1) {
          result.append("1");
          placeValue = '0';
        } else {
          result.append("0");;
        }

      } else if (Character.getNumericValue(charArrayA[i]) +
          Character.getNumericValue(charArrayB[j]) == 1) {

        if (Character.getNumericValue(placeValue) == 1) {
          result.append("0");;
          placeValue = '1';
        } else {
          result.append("1");;
          placeValue = '0';
        }


      } else if (Character.getNumericValue(charArrayA[i]) +
          Character.getNumericValue(charArrayB[j]) == 2) {
        if (Character.getNumericValue(placeValue) == 1) {
          result.append("1");;
          placeValue = '1';
        } else {
          result.append("0");;
          placeValue = '1';
        }

      }
    }
    if (placeValue == '1') {
      result.append("1");
    }
    result.reverse();

    return result.toString();
  }

  public static void main(String... args) {
    System.out.println(AddBinary.addBinary("1", "1"));
  }

}
