package utils;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	public List<Integer[]> store = new ArrayList<Integer[]>();
	
	public void print(Integer[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
	public void p(Integer[] a, int s, int len) {
		
		if(len == 0) {
			print(a);
			return;
		}
		for(int i=0;i<len;i++) {
			p(a,i+1,len-1);
		}
	}

	public static void main(String[] args) {
		Integer[] a = {1,2,3};
		new PowerSet().p(a, 0, 3);
	}

}
