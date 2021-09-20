package com.codegym;

public class Main {

    public static void main(String[] args) {
	int[] a = {1,2,3};
    int[] b = {4,5,6};
    totalarray(a, b);
    }
    public static int[] totalarray(int[] a, int[] b){
        int n = a.length + b.length;
        int[] n1 = new int[n];
        for (int i = 0; i < a.length; i++) {
            n1[i] = a[i];
        }
        for (int i = 0; i < b.length ; i++) {
            n1[a.length + i]  = b[i];
        }
        return  n1;
    }
}
