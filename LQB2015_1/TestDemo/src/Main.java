/**
 * ����7�����֣�����1������2������3��...����7���������ų�һ�С�
Ҫ������1����1���������֣�����2����2���������֣��Դ����ƣ�����7֮����7���������֡����¾���һ������Ҫ������У�

17126425374635

��Ȼ�����������������Ҳ�Ƿ���Ҫ��ġ�

�����ҳ���һ�ַ���Ҫ������з�������������з�����74��ͷ�ġ�

ע�⣺ֻ��д���14λ��������������д�κζ�������ݣ�����˵��ע�͵ȡ�
 * @author DHQ
 *
 */

public class Main {                             
	static int[] a = new int[] { 0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0 };
 
	public static void getResult(int index) {
		if (index == 4) {
			index++;
		}
		if (index >= 7) {
			for (int i = 1; i < a.length; i++) {
				System.out.print(a[i]);
			}
		}
		for (int i = 3; i < 14; i++) {
			if ((i + index + 1) <= 14 && a[i] == 0 && a[i + index + 1] == 0) {
				a[i] = a[i + index + 1] = index;
				getResult(index + 1);
				a[i] = a[i + index + 1] = 0;
			}
		}
	}
 
	public static void main(String[] args) {
		getResult(1);
	}
}
