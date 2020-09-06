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