package com.techreturners.exercise003;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise003 {

    private String[] flavours = {"Pistachio",
                                    "Raspberry Ripple",
                                    "Vanilla",
                                    "Mint Chocolate Chip",
                                    "Chocolate",
                                    "Mango Sorbet"};
    int getIceCreamCode(String iceCreamFlavour) {
        return Arrays.asList(flavours).indexOf(iceCreamFlavour);
    }

    String[] iceCreamFlavours() {
        return flavours;
    }

}
