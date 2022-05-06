package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ11279 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0 ; i < n ; i++) {
            int x = Integer.parseInt(br.readLine());
            if(x==0) {
                Integer temp = pq.poll();
                if(temp==null) bw.write(0+"\n");
                else bw.write(temp+"\n");
            }
            else pq.add(x);
        }
        bw.flush();
        bw.close();
        br.close();
    }
    
}