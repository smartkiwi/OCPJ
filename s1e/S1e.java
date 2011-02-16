/*
1.e. Create 2D array and a 3D array. Copy 2D array into a part of the 3D array.
*/

class S1e {
	public static void main(String[] agrs) {
		//2D array
		int[][] a2d = {{1,3,4,5,6,7,8,9,10},{11,12,13,14,15,16}};
		
		System.out.println("2D array size: "+a2d.length);
		print2Darray(a2d);
		
		//3D array
		int[][][] a3d = {{{}},{{}},{{}}};
		System.out.println("3D array size: "+a3d.length);
		
		print3Darray(a3d);	
		
		a3d[1] = a2d;
		
		a3d[2] = a2d;
		
		print3Darray(a3d);
	}
	
	static void print2Darray(int[][] array2d) {
		
		int county = 0;
		for(int[] a : array2d) {
			int countx = 0;
			for(int a1 : a) {
				System.out.printf("[%d][%d] %2d",countx,county,a1);
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
			}
			System.out.println();
			countz++;
		}
	}

	
}