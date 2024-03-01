package vaccinescanner;

import java.util.Scanner;

public class VaccineScanner1March24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("** We will check your eligibility for a booster shot ** ");
        System.out.println("Have you done your first shoot? please enter YES or NO:");
        String firstShot = input.next();
        if (firstShot.equalsIgnoreCase("no")) {
            System.out.println("You are not eligible for booster shot, please complete first and second shot first!");
            System.out.println("Your booster query process done");
        } else {
            System.out.println("Have you done second shot? please answer YES or NO: ");
            String secondShot = input.next();
            if (secondShot.equalsIgnoreCase("no")) {
                System.out.println("You are not eligible for a booster shot, please complete second shot first!");
                System.out.println("Your booster query process done");
            } else {
                System.out.println("Alright ! How many month since you completed your second shot? : ");
                double timeSecondShot = input.nextDouble();
                if (timeSecondShot >= 6) {
                    System.out.println("You are eligible for booster shot!");
                    System.out.println("Please visit our website for make an appointment!");
                } else {
                    System.out.println("You are not eligible for booster shot at this time, please come back in after " + (6 - timeSecondShot) + " month.");
                    System.out.println("Your booster query process done");
                }
            }
        }
        input.close();

    }
}

