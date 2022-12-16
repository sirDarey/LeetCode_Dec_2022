package leetcodeDec2022;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 1
 * Problem 1704: Determine if String Halves Are Alike
 *
 */


class Day1_1704_DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();

        int vowel1 = 0, vowel2 = 0;
        int i = 0, j = s.length()-1;

        Set <Character> set = new HashSet <>();
        set.add ('a'); 
        set.add ('e'); 
        set.add ('i');
        set.add ('o');
        set.add ('u');

        while (i < j) {
            if (set.contains(s.charAt(i)))
                vowel1++;
            if (set.contains(s.charAt(j)))
                vowel2++;
            i++; j--;
        }

        return vowel1 == vowel2;
    }
}