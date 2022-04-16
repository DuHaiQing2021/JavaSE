
public class Main {
	public static boolean isRet(int a) {
		int temp=a;
		while(temp!=0) {
			int t=temp%10;
			if(t==2||t==4) {
				return false;
			}
			temp/=10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<2019;i++) {
			if(isRet(i))break;
			for(int j=i+1;j<2019;j++) {
				if(isRet(j))break;
				for(int k=j;k<2019;k++) {
					if(isRet(k)) break;
					if((i+j+k)==2019) count++;
					
				}
				
			}
		}
		System.out.println(count);
		
	}
}
