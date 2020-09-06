import java.io.*;
import java.util.Scanner;

public class RoomCarpet {

      private RoomDimension roomDimensions;

        private double costOfCarpet;

        public RoomCarpet(RoomDimension roomDimensions, double costOfCarpet) {

            super();

            this.roomDimensions = roomDimensions;

            this.costOfCarpet = costOfCarpet;

        }

        public double getTotalCost() {

            return costOfCarpet * roomDimensions.getArea();

        }

        public String toString() {

          return "RoomCarpet Dimensions of the Room = " + roomDimensions + ", cost of carpet per sq foot = " + costOfCarpet + ", " + "total cost = " + getTotalCost();

        }
}