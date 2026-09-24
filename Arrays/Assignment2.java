//Sheri Evangelene
//I decided to use a switch then it kind of got away from me and started to turn into a whole management system lol I stopped before all the validations

//False=available, True=reserved
// starts as false


import java.util.Scanner;


public class Assignment2 {
    public static void displaySeats(boolean[][] seats){
         for (int row = 0; row < seats.length; row++){       //choose a row
                        for (int seat = 0; seat< seats[row].length; seat++){     //visit each seat in that row
                            if (seats[row][seat]){                          //if the current seat is true
                            System.out.print("X ");
                        } else{
                        System.out.print("O ");
                    }
                }
                System.out.println();   // after all seats in this row, move to the next line
            }
    }

    public static void main(String[] args){
        boolean [][] seats= new boolean[3][4]; //3 rows, 4 columns
        Scanner scannervar = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Display seating chart");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Cancel a reservation");
            System.out.println("4. Exit"); 
            
            int choice = scannervar.nextInt();

            switch (choice){
                case 1:
                    displaySeats(seats);
                    break;                   
                
                case 2:
                    System.out.println("Enter the row number to reserve (1-3): ");
                    int row = scannervar.nextInt() - 1;  //convert to human understanding

                    System.out.println("Enter the seat number you wish to reserve (1-4): ");
                    int seat = scannervar.nextInt() - 1;

                    if (seats[row][seat]){  //if the current seat is reserved (true)
                        System.out.println("That seat is not available");
                    
                    boolean suggestionFound = false;    

                        // If seat is not available show AN available seat    
                    for (int availableRow = 0; availableRow < seats.length  && !suggestionFound; availableRow++){
                        for (int availableSeat = 0; availableSeat < seats[availableRow].length; availableSeat++){
                            if (!seats[availableRow][availableSeat]){
                                System.out.println("Available seat: row " + (availableRow + 1)
                                        + " , seat " + (availableSeat + 1));
                                suggestionFound = true;
                                break;
                                }
                            }
                            
                        }
                    }else{
                        seats[row][seat] = true;
                        System.out.println("Your seat has been reserved!"); //if false make true
                        System.out.println();
                        }
                    displaySeats(seats);    
                    break;
                
                case 3:
                    System.out.println("Enter the row number you wish to cancel (1-3): ");
                    int cancelRow = scannervar.nextInt() - 1;

                    System.out.println("Enter the seat number you wish to cancel (1-4): ");
                    int cancelSeat = scannervar.nextInt() - 1;

                    seats[cancelRow][cancelSeat] = false;
                    System.out.println("Your reservation has been canceled");
                    displaySeats(seats);
                    break;
                    
                case 4:
                    System.out.println("Goodbye");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1-4") ;   


            }
        }
    }
 }    
