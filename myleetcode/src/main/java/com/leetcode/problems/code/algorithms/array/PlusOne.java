package com.leetcode.problems.code.algorithms.array;

public class PlusOne {
  public static int[] plusOne(int[] digits){
    int plus=1;
    for(int i=digits.length-1;i>=0;i--){
      if(digits[i]==9){

         digits[i]=0;


      }else if(digits[i]!=9){
        digits[i]++;

        return  digits;

      }

    }


      int []result=new int[digits.length+1];
      result[0]=1;

      return result;



  }



  public static int[] plusOne2(int[] digits) {
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
      if(digits[i] < 9) {
        digits[i]++;
        return digits;
      }

      digits[i] = 0;
    }

    int[] newNumber = new int [n+1];
    newNumber[0] = 1;

    return newNumber;
  }



}
