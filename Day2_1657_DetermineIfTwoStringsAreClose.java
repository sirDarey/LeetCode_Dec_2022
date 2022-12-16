package leetcodeDec2022;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 2
 * Problem 1657: Determine if Two Strings Are Close
 *
 */


class Day2_1657_DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        
        Set <Character> set1 = new HashSet<>(),
                        set2 = new HashSet<>();
        
        Map <Character, Integer> map1 = new HashMap<>(),
                                 map2 = new HashMap<>();

        Map <Integer, Integer> freq1 = new HashMap<>(),
                               freq2 = new HashMap<>();

        for (int i=0; i<word1.length(); i++) {
            char c1 = word1.charAt(i), c2 = word2.charAt(i);
            set1.add(c1);
            set2.add(c2);
            map1.put (c1, map1.getOrDefault(c1, 0)+1);
            map2.put (c2, map2.getOrDefault(c2, 0)+1);
            freq1.put (map1.get(c1), freq1.getOrDefault(map1.get(c1), 0)+1);
            freq2.put (map2.get(c2), freq2.getOrDefault(map2.get(c2), 0)+1);
        }
        return set1.equals(set2) && freq1.equals(freq2);
    }
}