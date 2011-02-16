/*
1.e. Create 2D array and a 3D array. Copy 2D array into a part of the 3D array.
*/

class S1e {
	
	public static void main(String[] agrs) {
	
		//2D array
		//declare array
		int[][] a2d;
		
		//construct array
		a2d = new int[4][4];
		
		//initiate array
		//when you initiate array like this - unset elements will have default int value = 0
		a2d[0][0] = 1;
		a2d[0][1] = 3;
		a2d[0][2] = 4;
		a2d[0][3] = 5;
		
		a2d[1][3] = 15;
		
		
		
		
		System.out.println("2D array size: "+a2d.length);
		print2Darray(a2d);
		
		//3D array
		//declare+construct+initiate array in one line
		int[][][] a3d = {{{}},{{}},{{}}};
		System.out.println("3D array size: "+a3d.length);
		
		print3Darray(a3d);	
		
		a3d[1] = a2d;
		
		a3d[2][0] = a2d[0];
		
		print3Darray(a3d);
	}
	
	static void print2Darray(int[][] array2d) {
		
		int county = 0;
		//one way of using for loop
		for(int[] a : array2d) {
			int countx = 0;
			//another way of using for loop
			for(int i=0; i<a.length; i++) {
				System.out.printf("[%d][%d] %2d",countx,county,a[i]);
				countx++;
			}
			county++;
			System.out.println();
		}
	}

	static void print3Darray(int[][][] array3d) {
		int countz = 0;
		for(int[][] a : array3d) {
			int county = 0;
			for(int[] a1 : a) {
				int countx = 0;
				for(int a2 : a1) {
					System.out.printf("[%d][%d][%d] %2d",countx,county,countz,a2);
					countx++;
				}
				county++;
				System.out.println();
			}
			System.out.println();
			countz++;
		}
	}
}