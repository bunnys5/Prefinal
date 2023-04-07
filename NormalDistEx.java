package preFinal;

import java.util.Random;

public class NormalDistEx {
	
	
	public static void main(String [] args) {
		
		int[] freq = new int[15];
		
		Random rand = new Random(System.currentTimeMillis());
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		
		for(int i = 0; i < 100000000; i++ ) {
			double value = rand.nextGaussian();
//			System.out.println("i:" + i + ", value:" + value);
			
			
			
			if(value > max) {
				max = value;
			}
			if(value < min) {
				min = value;
			}
			
			if(value < -6.0) {
				freq[0] += 1;
			} else if(value < -5.0) {
				freq[1] += 1;
			} else if(value < -4.0) {
				freq[2] += 1;
			} else if(value < -3.0) {
				freq[3] += 1;
			} else if(value < -2.0) {
				freq[4] += 1;
			} else if(value < -1.0) {
				freq[5] += 1;
			} else if(value < 0.0) {
				freq[6] += 1;
			} else if(value == 0.0) {
				freq[7] += 1;
			} else if(value < 1.0) {
				freq[8] += 1;
			} else if(value < 2.0) {
				freq[9] += 1;
			} else if(value < 3.0) {
				freq[10] += 1;
			} else if(value < 4.0) {
				freq[11] += 1;
			} else if(value < 5.0) {
				freq[12] += 1;
			} else if(value < 6.0) {
				freq[13] += 1;
			} else if(value < 7.0) {
				freq[14] += 1;
			} else {
				freq[15] += 1;
			}
			
			double scaledValue = value / 0.2;
			double maxScaled = Double.MIN_VALUE;
			double minScaled = Double.MAX_VALUE;
		}
		
		System.out.println("min." + min + ", max:" + max);
		for(int i = 0; i < freq.length; i++) {
			System.out.println("freq[" + i + "]:" + freq[i]);
		}
		
	}
}
