/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

	import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for patient details
        System.out.println("Enter patient age: ");
        int age = scanner.nextInt();

        System.out.println("Enter cholesterol level (mg/dL): ");
        int cholesterol = scanner.nextInt();

        System.out.println("Enter blood pressure (mmHg): ");
        int bloodPressure = scanner.nextInt();

        scanner.close();

        // Decision tree logic for heart disease risk classification
        String riskLevel = classifyRisk(age, cholesterol, bloodPressure);

        // Output the classification result
        System.out.println("\n🏥 Heart Disease Risk Level: " + riskLevel);
    }

    public static String classifyRisk(int age, int cholesterol, int bloodPressure) {
        if (age > 50) {
            if (cholesterol > 200 || bloodPressure > 140) {
                return "High Risk";
            } else {
                return "Moderate Risk";
            }
        } else {
            if (cholesterol > 250 || bloodPressure > 150) {
                return "Moderate Risk";
            } else {
                return "Low Risk";
            }
        }
    }
}
