package edu.citytech.cst.bst;

import java.util.function.Consumer;

public class Loop {

	public void countTo(int start, final int end, Consumer<Integer> consumer) {

//		if (end >= start) {
//			consumer.accept(start++);
//			
//			countTo(start, end, consumer);
//		} else
//			return;
		
		// does the same thing just less lines of code
		countTo(start,end, 1, consumer);

	}

	public void countTo(int start, int end, int rate, Consumer<Integer> consumer) {

//		boolean isReverse = rate < 1;
//
//		if (isReverse == false) {
//			// toggle breakpoint to keep loop from running infinite in the loop
//
//			if (end >= start) {
//				// Base Condition
//
//				consumer.accept(start);
//				// call the method it self inside itself running this would be infinite needs
//				// condition
//				start += rate;
//				countTo(start, end, rate, consumer);
//			} else
//				return;
//		} else {
//			if (start >= end) {
//
//				consumer.accept(start);
//				start += rate;
//				countTo(start, end, rate, consumer);
//			}
//		
//		else 
//			return;
//		
//	}

		if (rate >= 0) {
			pcountTo(start, end,rate, consumer);
			}
		else if (rate < 0) {
			ncountTo(start, end,rate, consumer);
			}
		
	}

	
	
	private void pcountTo(int start, int end, int rate, Consumer<Integer> consumer) {

			if (end >= start) {
				consumer.accept(start);
			
				start += rate;
				pcountTo(start, end, rate, consumer);
			} else
				return;
		
	

	}
	
	private void ncountTo(int start, int end, int rate, Consumer<Integer> consumer) {

		if (start >= end) {
			consumer.accept(start);
		
			start += rate;
			ncountTo(start, end, rate, consumer);
		} else
			return;
	

	}
}
