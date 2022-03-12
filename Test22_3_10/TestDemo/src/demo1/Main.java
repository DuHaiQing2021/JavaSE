package demo1;


public class Main {
	public static void main(String[] args) {
		int count=0;
		int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,ij,iq,ik;
		for(i1=0;i1<=4;i1++) {
			for(i2=0;i2<=4;i2++) {
				for(i3=0;i3<=4;i3++) {
					for(i4=0;i4<=4;i4++) {
						for(i5=0;i5<=4;i5++) {
							for(i6=0;i6<=4;i6++) {
								for(i7=0;i7<=4;i7++) {
									for(i8=0;i8<=4;i8++) {
										for(i9=0;i9<=4;i9++) {
											for(i10=0;i10<=4;i10++) {
												for(ij=0;ij<=4;ij++) {
													for(iq=0;iq<=4;iq++) {
														for(ik=0;ik<=4;ik++) {
															if((i1+i2+i3+i4+i5+i6+i7+i8+i9+i10+ij+iq+ik)==13) {
																count++;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
		}
		System.out.println(count);	
	}
}
