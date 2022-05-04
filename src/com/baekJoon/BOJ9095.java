package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9095 {
    
    static int[] list;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        
        list = new int [12];
        check(11);
        for(int i = 0 ; i < t ; i++) {
            int n = Integer.parseInt(br.readLine());
            String temp = list[n]+"\n";
            bw.write(temp);
        }
        bw.flush();
        br.close();
        bw.close();
    
    }
    
    private static int check(int n) {
        
        if(n==1) list[n] = 1;
        if(n==2) list[n] = 2;
        if(n==3) list[n] = 4;
        
        if(n>=4) {
            list[n] = check(n-1) + check(n-2) + check(n-3);
        }
        
        return list[n];
    }
}
