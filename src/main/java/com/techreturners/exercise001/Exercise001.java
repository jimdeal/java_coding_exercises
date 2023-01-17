package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        String retWord = word;
        // if first char not already an uppercase - change it
        if(!Character.isUpperCase(word.charAt(0)))
        {
            retWord = word.substring(0,1).toUpperCase() + word.substring(1);
        }

        return retWord;
    }

    public String generateInitials(String firstName, String lastName) {
        String retStr = new String();
        String fChar = firstName.substring(0,1).toUpperCase();
        String sChar = lastName.substring(0,1).toUpperCase();
        retStr = fChar + "." + sChar;

        return retStr;
    }

    public double addVat(double originalPrice, double vatRate) {
        double ret = originalPrice + (originalPrice * (vatRate / 100));
        // set 2 decimal places by using divide / multiply by 100
        double retOut = (double) Math.round(ret * 100) / 100;
        return retOut;
    }

    public String reverse(String sentence) {
        // use stringbuilder...
        StringBuilder outStrBuild = new StringBuilder();
        outStrBuild.append(sentence);
        // ... and just call it's reverse method
        outStrBuild.reverse();
        return outStrBuild.toString();
    }

    public int countLinuxUsers(List<User> users) {
        int ret = 0;

        for(User u : users)
        {
            if(u.getType().compareTo("Linux")==0)
            {
                ret++;
            }
        }

        return ret;
    }
}
