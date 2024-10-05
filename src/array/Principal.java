package array;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();



		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
        int value=scan.nextInt();
        a[i]=value;
		}
		scan.close();

		for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
		}
	}
}
