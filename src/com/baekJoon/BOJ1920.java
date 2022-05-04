package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1920 {
        
    static int[] list;
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        list = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(list);
        
//        for(int i = 0 ;  i < list.length ; i++) {
//            System.out.print(list[i]+" ");
//        }
        
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < m ; i++) {
            if(check(Integer.parseInt(st.nextToken()))) bw.write(1+"\n");
            else bw.write(0+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
        
    private static boolean check(int n) {
        
        int start = 0;
        int end = list.length-1;
        int mid = 0;
        
        while(start <= end) {
            mid = (start+end)/2;
            if(list[mid]==n) {
                return true;
            }else if(list[mid]<n) {
                start = mid+1;
            }else {
                end = mid-1;
            }
            
        }
        
        return false;
    }
    
    
}