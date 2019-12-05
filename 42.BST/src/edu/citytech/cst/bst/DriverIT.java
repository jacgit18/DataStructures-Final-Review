package edu.citytech.cst.bst;

public class DriverIT {

	public static void main(String[] args) {

		// Recursion Loop
		// ctrl shift plus to zoom
		// resume completely button f8 after pressing f6 to step over and f5 to step into
		 System.out.println("Positive------------------------------");

		Loop loop = new Loop();
		/*
		 * loop.countTo(1,3, e -> { System.out.println(e); });
		 */
		
		 loop .countTo(0, 20, 1, e ->{ System.out.println(e);
		  
		  });
		 
		 System.out.println("CountDown------------------------------");
		loop.countTo(20, 0, -1, e -> {
			System.out.println(e);

		});

	}

}
