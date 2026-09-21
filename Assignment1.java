//Sheri Evangelene
//I comment for my memory. Sorry if they are long and obvious


import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scannervar= new Scanner(System.in);

        System.out.println("Enter the number of days: ");
        int numberOfDays = scannervar.nextInt();

        System.out.println("Enter the temperature values for each of the " + numberOfDays + " days: ");

      //create an array the size that the user entered
      double[] temperatures = new double[numberOfDays];

      //add the user inputs as values in the array
      for(int day = 0; day < numberOfDays; day++)
        temperatures[day]= scannervar.nextDouble();

      //Find the average temp. Loop through every index in the temperatures array. Add each value at index position day, to totalTemp. Divide the total by the number of days fro the average. 
      double totalTemp = 0;
      for(int day = 0; day < temperatures.length; day ++){
        totalTemp += temperatures[day];
      } 
       double aveTemp = (totalTemp/ numberOfDays);

       System.out.println("The average temp is: " + aveTemp);

       //Find the temperatures over the average. Loop through every index in the temperatures array. Compare the value at position temp to the aveTemp. If the indexed value is higher than the aveTemp increase aboveAve by 1. 
       int aboveAve = 0;
       for(int temp = 0; temp < temperatures.length; temp++){
        if(temperatures[temp] > aveTemp){
            aboveAve ++;
        }
       }
         System.out.println("There are " + aboveAve + " temperatures in your set that are above the average temp");
    }    
}


