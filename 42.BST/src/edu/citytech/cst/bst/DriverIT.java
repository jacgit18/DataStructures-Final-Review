package edu.citytech.cst.bst;

public class DriverIT {

	public static void main(String[] args) {

		// Recursion Loop
		// ctrl shift plus to zoom
		// resume completely button f8 after pressing f6 to step over and f5 to step into

		Loop loop = new Loop();
		System.out.println("First method -----------------------");
		loop.countTo(1,3, e -> { System.out.println(e); });
		System.out.println("First method Alternate-----------------------");

		loop.countTo(4,10,System.out::println);

		 
		
		 System.out.println("Positive Second method------------------------------");

		 loop .countTo(0, 10, 1, e ->{ System.out.println(e);
		  
		  });
		 
		 System.out.println("CountDown Second method------------------------------");
		loop.countTo(10, 0, -1, e -> {
			System.out.println(e);

		});
		
		 System.out.println("CountDown Second method Alternate Way------------------------------");
		loop.countTo(10,0, -1, System.out::println);


	}

}
