package dng.com;

public class Twodimarray {
	
	public static void main(String []args)
	{
		int [][] arr;
		arr = new int [2][3];
		
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 25;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[1][2] = 50;
		
		for(int i = 0;i<arr.length;i++)
		{
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.println("Element - " + arr[i][j]);
			}
		}
		
		for(int[] ele : arr)
		{
			for(int e : ele)
			{
				System.out.println("element - " +e);
			}
		}
	
	}
	
}
