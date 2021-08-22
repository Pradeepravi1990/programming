package utils;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	public List<Integer[]> store = new ArrayList<Integer[]>();
	public void p(Integer[] a, int s, int len) {
		
		if(len == 0) {
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
