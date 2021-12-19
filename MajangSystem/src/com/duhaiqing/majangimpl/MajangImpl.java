package com.duhaiqing.majangimpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajangImpl {
	public int majangSystem(String date) {
		int[] count = new int[27];//TDW����
		int[] tmp = new int[27];//TDW����
		List<String> huPai = new ArrayList<String>();
		for(int i=0;i<27;i++){
			count[i]=0;
		}
		for(int i=0;i<date.length();i += 2){
			if(date.charAt(i+1)=='T'){
				int num = Integer.parseInt(date.charAt(i)+"")-1;
				count[num]++;
			}else if(date.charAt(i+1)=='D'){
				int num = Integer.parseInt(date.charAt(i)+"")-1;
				count[num+9]++;
			}else if(date.charAt(i+1)=='W'){
				int num = Integer.parseInt(date.charAt(i)+"")-1;
				count[num+9*2]++;
			}
		}
		
		for(int i=0;i<27;i++){
			count[i]++;
			for(int j=0;j<27;j++)
				tmp[j] = count[j];
			boolean flag = isHU(tmp);
			if(flag)
				huPai.add(translate(i));
			count[i]--;
		}
		System.out.println("���Ƹ���:"+huPai.size());
		for(String x:huPai)
			System.out.print("��ҪҪ�����ƣ�"+x);
		if(huPai.size() != 0) {
			return 1;
		}else {
			return 0;
		}
	}
	private static String translate(int i) {
		int n = i/9;
		int pre = i%9+1;
		String r = null;
		switch (n) {
		case 0:
			r = pre + "T";
			break;
		case 1:
			r = pre + "D";
			break;
		case 2:
			r = pre + "W";
			break;
		default:
			break;
		}
		return r;
	}
 
	private static boolean isHU(int[] count) {
		
		boolean result = tryHU(count, 14);
		return result;
	}
 
	private static boolean tryHU(int[] count, int len) {
		if(len==0)
			return true;
		if(len%3==2){//˵������û����
			for(int i=0;i<27;i++){
				if(count[i]>=2){
					count[i] -= 2;
					if(tryHU(count, len - 2))
						return true;
					count[i] += 2;
				}
			}
		}
		else{
			//����һ����
			for(int i=0;i<27;i++){
				if(count[i]>=3){
					count[i] -= 3;
					if(tryHU(count, len - 3))
						return true;
					count[i] += 3;
				}
			}
			//�Ƿ���˳��
			for(int i=0;i<27-2;i++){
				if(count[i]>0&&count[i+1]>0&&count[i+2]>0){
					count[i] -= 1;
					count[i+1] -= 1;
					count[i+2] -= 1;
					if(tryHU(count, len - 3))
						return true;
					count[i] += 1;
					count[i+1] += 1;
					count[i+2] += 1;
				}
			}
		}
		return false;
	}
}
