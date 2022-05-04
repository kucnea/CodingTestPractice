package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1463 {
    
    static int[] list;
    static int n;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        
        // 3으로 나누어 떨어지면 3으로 나눈다
        // 2로 나누어 떨어지면 2로 나눈다.
        // 1을 뺀다.
        
        list = new int[n+1];
        
        String temp = check1(n)+"";
        bw.write(temp);
        bw.flush();
        br.close();
        bw.close();
            
    }
    
    private static int check(int x) {
        
        if(x==1) return 1;
        if(x==2) return 1;
        if(x==3) return 1;
        
        if(x%3 == 0) {
            return Math.min(check(x/3)+1, check(x-1)+1);
        }else if(x%2 == 0) {
            return Math.min(check(x/2)+1, check(x-1)+1);
        }else {
            return check(x-1)+1;
        }
    }
    
    private static int check1(int x) {
        
        if(x==1) list[x] = 1;
        if(x==2) list[x] = 1;
        if(x==3) list[x] = 1;
        
        if(x%3 == 0) {
            list[x] = Math.min(check1(x/3)+1, check(x-1)+1);    
        }else if(x%2 == 0) {
            list[x] = Math.min(check(x/2)+1, check(x-1)+1);
        }
        
        return list[x];
    }
}
