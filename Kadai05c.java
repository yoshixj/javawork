//15D8102011G Yoshiki Masubuchi 増渕　佳輝　2017/05/19

import java.util.Scanner;

public class Kadai05c{
		int m,i,j;
		m = sc.nextInt();
		System.out.println(m);
		int[][] a = new int[m][m];
		a[0][0] = 1;
		for(i=1;i<m;i++){
				System.out.print(String.format("%4d", a[i][j]));
			System.out.println();
/*
10  
10
   1   1   0   0   0   0   0   0   0   0
   1   2   1   0   0   0   0   0   0   0
   1   3   3   1   0   0   0   0   0   0
   1   4   6   4   1   0   0   0   0   0
   1   5  10  10   5   1   0   0   0   0
   1   6  15  20  15   6   1   0   0   0
   1   7  21  35  35  21   7   1   0   0
   1   8  28  56  70  56  28   8   1   0
   1   9  36  84 126 126  84  36   9   1

