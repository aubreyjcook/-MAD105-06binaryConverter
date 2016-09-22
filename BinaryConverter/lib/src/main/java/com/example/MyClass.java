package com.example;

public class MyClass {
    public static void main(String[] args){
        String binaryString = "100101110";
        char[] binaryArray = binaryString.toCharArray();

        int binaryNumber = binaryConversion(binaryArray);

        System.out.println(binaryNumber);
    }

    public static int binaryConversion(char binaryArray[]) {
        int binaryNumber = 0;

        if (binaryArray[0] == '1') {
            binaryNumber = binaryNumber + 256;
        }

        if (binaryArray[1] == '1') {
            binaryNumber = binaryNumber + 128;
        }

        if (binaryArray[2] == '1') {
            binaryNumber = binaryNumber + 64;
        }

        if (binaryArray[3] == '1') {
            binaryNumber = binaryNumber + 32;
        }

        if (binaryArray[4] == '1') {
            binaryNumber = binaryNumber + 16;
        }

        if (binaryArray[5] == '1') {
            binaryNumber = binaryNumber + 8;
        }

        if (binaryArray[6] == '1') {
            binaryNumber = binaryNumber + 4;
        }

        if (binaryArray[7] == '1') {
            binaryNumber = binaryNumber + 2;
        }

        if (binaryArray[8] == '1') {
            binaryNumber = binaryNumber + 1;
        }

        return binaryNumber;
    }
}