import java.util.Scanner;

public class bmi {
	
	public static String rankBMI(double imc) {
		if (imc < 16.0) {
			return "Severe thinness";
		}
		else if (imc == 16.0 || imc < 17.0) {
			return "Moderate thinness";
		}
		else if (imc == 17.0 || imc < 18.5) {
			return "Slight thinness";
		}
		else if (imc == 18.5 || imc < 25.0) {
			return "Healthy";
		}
		else if (imc == 25.0 || imc < 30.0) {
			return "Overweight";
		}
		else if (imc == 30.0 || imc < 35.0) {
			return "Grade I Obesity";
		}
		else if (imc == 35.0 || imc < 40.0) {
			return "Grade II Obesity";
		}
		else {
			return "Grade III Obesity";
		}
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double weight;
		double height;
		double bmi;
		
		System.out.println("Enter your weight in kilograms: ");
		weight = sc.nextDouble();
		
		System.out.println("Enter your height in meters: ");
		height = sc.nextDouble();
		
		bmi = weight / (height * height);
		
		System.out.printf("\nYour body mass index is:  %.2f kg/m²\n", bmi);
		System.out.printf("Your rating is: %s.\n", rankBMI(bmi));

	}

}
