//package com.company;

/**
 * This is the good class
 */
public class pps_107_methods_tag {
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * This is the method and this is the beautiful method in the class
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return sum of two numbers as an Interger
     * @throws Exception if i is 0
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}

