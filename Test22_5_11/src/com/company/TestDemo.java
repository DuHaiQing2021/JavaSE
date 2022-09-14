package com.company;

class Solution {
    public int firstUniqChar(String s) {
        int[] array=new int[26];
        for(int i=0;i<s.length();i++){
            int t=s.charAt(i);
            array[t-97]++;
        }
        for (int i=0;i<s.length();i++){
            if (array[s.charAt(i)-97]==1){
                return i;
            }
        }
        return -1;
    }
}
public class TestDemo{

}