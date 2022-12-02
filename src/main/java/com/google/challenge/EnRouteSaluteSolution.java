package com.google.challenge;

public class EnRouteSaluteSolution {

   public static void main(String[] args){
      System.out.println(EnRouteSaluteSolution.solution(">----<"));
      System.out.println(EnRouteSaluteSolution.solution("<<>><"));
   }

   public static int solution(String s) {

      s = s.replaceAll("-", "").replaceAll(">", "1").replaceAll("<", "0");
      int front = getSalutes(s,"10");
      int back = getSalutes(new StringBuilder(s).reverse().toString(),"01");

      return front+back;
   }

   public static int getSalutes(String s, String compareString){
      int counter = 0;
      String tempConcat;
      Character a;
      Character b;
      //Loop front and check for pattern 01
      for (int i = 0; i < s.length(); i++) {
         for (int j = i; j < s.length(); j++) {
            try {
               a = s.charAt(i);
               b = s.charAt(j + 1);
               tempConcat = Character.toString(a) + Character.toString(b);
               if (tempConcat.equalsIgnoreCase(compareString)) {
                  counter++;
               }
            } catch (Exception e) {
               //do nothing
               e.getMessage();
            }
         }
      }

      return counter;
   }

}

