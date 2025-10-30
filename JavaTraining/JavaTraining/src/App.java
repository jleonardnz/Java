//import java.util.HashSet;
//import java.util.Set;

import java.util.*;

public class App {
    public static void main(String[] args)  {
        removeVowelRepetition("progromming");
        removeVowelRepetition("bookkeeper");
    }

    /// Remove vowel repetition
    static void removeVowelRepetition(String str) {
        System.out.println(str);

        String n = str;
        Set<Character> set = new LinkedHashSet<>();
        for(char c : n.toCharArray()) {
            set.add(c);
        }
        //System.out.println(set);
        
        StringBuilder sb = new StringBuilder();
        
        for(char b : set) {
          sb.append(b);  
        }

        System.out.println(sb);
        System.out.println("");
    }
}
