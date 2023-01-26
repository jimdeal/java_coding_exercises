package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    // test comment
    public String capitalizeWord(String word) {
        String retWord = new String();
        if(word!=null)
        {
            retWord = word;
            if(!Character.isUpperCase(word.charAt(0)))
            {
                retWord = word.substring(0,1).toUpperCase() + word.substring(1);
            }
        }
        // if first char not already an uppercase - change it
        return retWord;
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1).toUpperCase() + "." + lastName.substring(0,1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        double retOut = originalPrice;
        if(vatRate != 0)
        {
            double ret = originalPrice + (originalPrice * (vatRate / 100));
            retOut = (double) Math.round(ret * 100) / 100;
        }
        // set 2 decimal places by using divide / multiply by 100
        return retOut;
    }

    public String reverse(String sentence) {
        String retString = new String();
        if(sentence != null)
        {
            StringBuilder outStrBuild = new StringBuilder();
            outStrBuild.append(sentence).reverse();
            retString = outStrBuild.toString();
        }
        return retString;
    }

    public int countLinuxUsers(List<User> users) {
        int ret = 0;

        if(users != null)
        {
            for(User u : users)
            {
                if(u.getType().equals("Linux"))
                {
                    ret++;
                }
            }
        }

        return ret;
    }
}
