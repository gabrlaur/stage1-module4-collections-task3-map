package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.toLowerCase().replace('.', ' ').replace(',', ' ').split(" ");
        Map<String, Integer> repetitionMap = new LinkedHashMap<>();
        for (String word : words) {
            if (!word.trim().equals("")) {
                if (repetitionMap.containsKey(word)) {
                    repetitionMap.put(word, repetitionMap.get(word) + 1);
                } else {
                    repetitionMap.put(word, 1);
                }
            }
        }
        return repetitionMap;
    }
}
