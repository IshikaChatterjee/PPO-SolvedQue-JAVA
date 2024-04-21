// AN Automobile company manufactures both 2 wheelers and 4 wheelers . A Company Manager wants to make the produiction of four types of vehicles 
//using the data given :
//1.) Total number of vehicles (T.W + F.W)
//2.)Total number of wheels = W
// tHE TASK IS TO FIND HOW MANY TWO- WHEELERS AS WELL AS 4_wHEELERS NEEDS TO BE MANUFACTURED AS PER THE GIVEN DATA

//(These are the constraints: 1. 2 <= W, 2.W % 2 = 0, 3. V < W)
import java.util.Scanner;
public class CompanyManufac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of vehicles: ");
        int totalVehicles = scanner.nextInt();

        System.out.print("Enter the total number of wheels: ");
        int totalWheels = scanner.nextInt();

        if (totalWheels < 2 || totalWheels % 2 != 0 || totalVehicles >= totalWheels) {
            System.out.println("Invalid input! Constraints not met.");
            return;
        }

        int twoWheelerCount = 0;
        int fourWheelerCount = 0;


        for (int t2 = 0; t2 <= totalVehicles; t2++)
        {
            int t4 = totalVehicles - t2;

            if ((2 * t2) + (4 * t4) == totalWheels) 
            {
                twoWheelerCount = t2;
                fourWheelerCount = t4;

                break;
            }
        }

        System.out.println("Number of two-Wheelers Vehicles to be manufactured :" +twoWheelerCount);
        System.out.println("Number of four-Wheelers to be manufactured:" +fourWheelerCount);

        scanner.close();


    }
}



