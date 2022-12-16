package leetcodeDec2022;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @Sir Darey
 * 
 * LeetCode Daily Challenge: December 2022, Day 3
 * Problem 451: Sort Characters By Frequency
 *
 */


class Day3_451_SortCharactersByFrequency {
    
    private class Data <Character, Integer>{
        private final char c;
        private final int freq;

        public Data(char c, int freq) {
            this.c = c;
            this.freq = freq;
        }

        public char getC() {
            return c;
        }
        
        public int getFreq() {
            return freq;
        }
    }
    
    public String frequencySort(String s) {
        Comparator <Data<Character, Integer>> compareFreq = (Data<Character, Integer> data1, Data<Character, Integer> data2) -> {
            if (data2.getFreq() > data1.getFreq())
                return 1;
            else 
                return -1;
        };
        
        Map <Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        Set <Data<Character, Integer>> set = new TreeSet<>(compareFreq);
        
        map.entrySet().forEach(x-> {
            set.add(new Data(x.getKey(), x.getValue()));
        });
        
        StringBuilder sb = new StringBuilder();
        set.forEach(data -> {
            for (int i=0; i<data.getFreq(); i++)
                sb.append(data.getC());
        });
        
        return sb.toString();
    }
}