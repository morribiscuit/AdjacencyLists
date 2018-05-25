
import java.util.Random;

public class Algorithms {
	public static int[] initialize(int s) {
		int ar[]= new int[s];
		Random generator  = new Random();
		for(int i =0; i<s;i++) {
			
			int number= generator.nextInt(1000000);
			ar[i] = number;
		}
		return ar;
	}
	
	//Linear method
		public static int linearCount(int[] array, int search) {
		int occur = 0;
		int length = array.length;
		
		for(int i=0;i<length;i++) {
			if(array[i] == search) {
				occur++;
			}
		}
		return occur;
	}
		
	
		
	
		public static void main(String args[])
		{
			int size=10000;
			Timer myTimer=new Timer();
			int[] data = initialize(size);
			myTimer.start();
			int position = linearCount(data, 50);
			myTimer.stop();
			System.out.println("Search Time : " + myTimer.getTime());
			myTimer.start();
			bubbleSort(data);
			myTimer.stop();
			System.out.println("Sort Time : " + myTimer.getTime());
		}
		
		//Bubble sort
				public static int[] bubbleSort(int[] data) {
					int length = data.length;
					int temp;
					for(int i=0;i<(length-1);i++) {
						for(int j=1;j<(length -i);j++) {
							 if(data[j-1] > data[j])
				                {
				                    temp = data[j-1];
				                    data[j-1]=data[j];
				                    data[j]=temp;
				                }
						}
				}
					return data;
				}

		




}
