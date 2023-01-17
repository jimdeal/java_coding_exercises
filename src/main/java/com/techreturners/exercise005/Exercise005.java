package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;

public class Exercise005 {

    public boolean isPangram(String input) {
        boolean ret = false;
        if(input.length() >= 26)
        {
            Set<Character> chars = new HashSet<>();
            // for all chars in string
            for(char c : input.toCharArray())
            {
                // if char is a letter
                if(Character.isAlphabetic(c))
                {
                    // add it to a set which does not allow duplicates
                    chars.add(c);
                }
            }
            // *IF* all characters of alphabet are present - set should be size == 26
            ret = chars.size()==26;
        }

        return ret;
    }

}
