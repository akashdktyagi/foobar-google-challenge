package com.google.challenge;

public class BrailleTranslationSolution {
   public static void main(String[] args){
      System.out.println(BrailleTranslationSolution.solution("code"));
      System.out.println(BrailleTranslationSolution.solution("Super Duper"));
   }

     public static String solution(String s){
        java.util.HashMap<Character, String> mapping = new java.util.HashMap<Character,String>();
        mapping.put('a',"100000");
        mapping.put('b',"110000");
        mapping.put('c',"100100");
        mapping.put('d',"100110");
        mapping.put('e',"100010");
        mapping.put('f',"110100");
        mapping.put('g',"110110");
        mapping.put('h',"110010");
        mapping.put('i',"010100");
        mapping.put('j',"010110");
        mapping.put('k',"101000");
        mapping.put('l',"111000");
        mapping.put('m',"101100");
        mapping.put('n',"101110");
        mapping.put('o',"101010");
        mapping.put('p',"111100");
        mapping.put('q',"111110");
        mapping.put('r',"111010");
        mapping.put('s',"011100");
        mapping.put('t',"011110");
        mapping.put('u',"101001");
        mapping.put('v',"111001");
        mapping.put('w',"010111");
        mapping.put('x',"101101");
        mapping.put('y',"101111");
        mapping.put('z',"101011");
        mapping.put(' ',"000000");

        String result="";
        String temp;
        for(int i=0;i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))){
                temp =  "000001"+mapping.get(Character.toLowerCase(s.charAt(i)));
            }else{
                temp =  mapping.get(s.charAt(i));
            }
            result = result + temp ;
        }
        System.out.println("Text: " + s);
        System.out.println("result: " + result);
        return result;
    }

}

