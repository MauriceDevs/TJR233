// Name : Tyler Richard
// CptS 233 MicroAssignment #01 
// 9/6/20
// gitRepo URL : https://github.com/MauriceDevs/TJR233

// Apologies on the tardiness. I had the program written with a lot of time to spare,
// but I ran into some issues pushing from the command line.



import java.util.Scanner;
import java.io.*;

class Main {
  public static void main(String[] args) {

    Scanner myObj = new Scanner(System.in);  
    
    System.out.println("Enter room width:");

    double width = myObj.nextDouble();  

    System.out.println("Enter room length:");

    double length = myObj.nextDouble();  

    System.out.println("Enter price per square foot of carpet:");

    double ppsf = myObj.nextDouble(); 

    // Create RoomDimension and RoomCarpet objects.

    RoomDimension dimensions = new RoomDimension(length, width);

    RoomCarpet roomCarpet = new RoomCarpet(dimensions,ppsf);

    System.out.println(roomCarpet);

    // "The cost of carpeting a room of "+ dimensions + " square feet will cost: $" + 
  }
}