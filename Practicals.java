package First_package;

public class Practicals {

     private static int total;
	
	
	public static void main(String[] args) {
		resultsExam();
		displayPercentage();
	}


	public static void resultsExam() {
		int Physics = 40;
		int Chemistry = 40;
		int Biology = 45;
		int total = Physics + Chemistry + Biology;
		System.out.println("Physics: " + Physics);
		System.out.println("Chemistry: " + Chemistry);
		System.out.println("Biology: " + Biology);
		System.out.println("total marks: " + total);
	}

	public static int displayPercentage() {
		int total1 = 125;
		int percentage = total1 * 100 / 450;
		System.out.println(percentage + "%");
		return percentage;
	
	}
	
}


