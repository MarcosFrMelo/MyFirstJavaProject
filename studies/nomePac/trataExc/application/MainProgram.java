package nomePac.trataExc.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import nomePac.trataExc.model.entiteis.Reservation;
import nomePac.trataExc.model.exception.DataException;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date chekIn = new Date();
        Date checkOut = new Date();
        Reservation reservation = new Reservation();
        int roomNumber;
        boolean valid;
        do{
            valid = true;
            try {
                System.out.println("Enter the room number: ");
                roomNumber = sc.nextInt();
                System.out.println("Enter check-in date (dd/MM/yyyy): ");
                chekIn = sdf.parse(sc.next());
                System.out.println("Enter check-out date (dd/MM/yyyy): ");
                checkOut = sdf.parse(sc.next());

                reservation = new Reservation(roomNumber, chekIn, checkOut);
                
                System.out.println("Enter check-in date:");
                chekIn = sdf.parse(sc.next());
                System.out.println("Enter check-out date: ");
                checkOut = sdf.parse(sc.next());

                reservation.updateDates(chekIn, checkOut);
                System.out.println(reservation);

            } catch (ParseException e) {
                System.out.println("Invalid date format");
                valid = false;
            } catch (DataException e) {
                System.out.println("Error in reservation: " + e.getMessage());
                valid = false;
            } catch (RuntimeException e) {
                System.out.println("Unexpected error");
                valid = false;
            }

        }while(valid == false);

        sc.close();
    }   
}
