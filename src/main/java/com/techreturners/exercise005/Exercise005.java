package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;

public class Exercise005 {

    public boolean isPangram(String input) {
        boolean ret = false;
        if(input.length() >= 26)
        {
            Set<Character> chars = new HashSet<>();

            for(char c : input.toCharArray())
            {
                if(Character.isAlphabetic(c))
                {
                    chars.add(c);
                }
            }
            ret = chars.size()==26;
        }

        return ret;
    }

}
