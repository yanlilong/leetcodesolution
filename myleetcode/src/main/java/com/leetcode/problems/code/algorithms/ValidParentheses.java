package com.leetcode.problems.code.algorithms;

/*a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.TreeMap;
import java.lang.String;

public class ValidParentheses {

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '[') {
        stack.push(']');

      } else if (c == '{') {
        stack.push('}');

      } else if (stack.isEmpty() || (stack.pop() != c)) {
        return false;
      }
    }

      return stack.isEmpty();

    }

    /**public static boolean isValid(String s) {
     if(s.equals("")){
     return true;}
     else{
     boolean isParentheses = false;

     TreeMap<Integer, String> indexOrder = new TreeMap<Integer, String>();
     TreeMap<Integer, String> neviOrder = new TreeMap<Integer, String>();
     String result1 = "";
     String result2 = "";
     indexOrder.putAll(getindex("{", s));
     indexOrder.putAll(getindex("[", s));
     indexOrder.putAll(getindex("(", s));
     neviOrder.putAll(getindex("}", s));
     neviOrder.putAll(getindex("]", s));
     neviOrder.putAll(getindex(")", s));
     for (String value : indexOrder.values()) {
     if ((value == "{") || (value == "[") || (value == "(")) {
     result1 = result1 + value;
     }

     }

     for (String value : neviOrder.values()) {
     if ((value == "}") || (value == "]")
     || (value == ")")) {
     result2 = result2 + value;
     }

     }

     HashMap<String, String> brackets = new HashMap<String, String>();
     brackets.put("[", "]");
     brackets.put("(", ")");
     brackets.put("{", "}");

     if (result1.length() == result2.length()) {
     for (int i = 0; i < result1.length(); i++) {
     String a = brackets.get(Character.toString(result1.charAt(i)));
     String b = Character.toString(result2.charAt(result1.length() - 1 - i));
     if (!brackets.get(Character.toString(result1.charAt(i))).equals(Character
     .toString(result2.charAt(result1.length() - 1 - i)))) {

     return isParentheses = false;

     } else {
     isParentheses = true;
     }
     }


     }
     return isParentheses;}

     }

     public static TreeMap<Integer, String> getindex(String bracket, String inputString) {
     String x = inputString;
     TreeMap<Integer, String> indexOrder = new TreeMap<Integer, String>();
     if (x != null) {
     int index = x.indexOf(bracket);
     if (index != -1) {

     indexOrder.put(inputString.indexOf(bracket), bracket);

     while (index >= 0) {
     index = inputString.indexOf(bracket, index + 1);
     if (index >= 0) {
     indexOrder.put(index, bracket);
     }
     }
     }
     }
     return indexOrder;
     }*/


}