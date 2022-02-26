package com.company;
/**
 *
 * first //1. super will be added then //2. inialization block will be executed //3. all the statements in the constructor
 * . when any constructor is called
 *for ever instance intalization block will be executed once.
 *
 *
 * static blocks are only exexuted once.when the class is loaded.
 * **/
public class initializationBlocks {
    int[] a;

    {
        a = new int[10];

        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }
    }
}
