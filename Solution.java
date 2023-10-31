import java.util.HashMap;

class Solution {
    public static char mostFrequentChar(String s) {
      char largestChar = s.charAt(0);
      HashMap <Character, Integer> frequent = new HashMap<Character, Integer>();
      for(int i = 0; i<s.length(); i++){

        if(frequent.containsKey(s.charAt(i))){
          frequent.put(s.charAt(i), frequent.get(s.charAt(i))+1);
        }
        else{
          frequent.put(s.charAt(i), 1);
        }
      }

      for(int i = 0; i<s.length(); i++){
        if(frequent.get(s.charAt(i)) > frequent.get(largestChar)){
          largestChar = s.charAt(i);
        }
      }

      return largestChar;
    }
  
    public static void main(String[] args) {
   
      // Try out your test cases:
      System.out.println(mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
      System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

  }
