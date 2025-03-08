/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

/**
 *
 * @author liefh
 */
import java.util.Scanner;
import FlightControl.controlsystem.Logic;
import FlightControl.information.Airplane;
import FlightControl.information.Flight;
import FlightControl.information.Place;

public class UserInterface {

    private Scanner scanner;
    private Logic controlsystem;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.controlsystem = new Logic();
    }

    public void start() {
        airportAssetControl();
        flightControl();
    }

    private void airportAssetControl() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Choose an action:\n");
//        sb.append("[1] Add an airplane\n");
//        sb.append("[2] Add a flight\n");
//        sb.append("[x] Exit Airport Asset Control");
        while (true) {

            
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.println(">");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                addAirplane();
            }
            if (input.equals("2")) {
                addFlight();
            }
            if (input.equals("x")) {
                break;
            }
        }
    }

    private void flightControl() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Choose an action:\n");
//        sb.append("[1] Print airplanes\n");
//        sb.append("[2] Print flights\n");
//        sb.append("[3] Print airplane details\n");
//        sb.append("[x] Exit Airport Asset Control");
        while (true) {

            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.println(">");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                printAirplanes();
            }
            if (input.equals("2")) {
                printFlights();
            }
            if (input.equals("3")) {
                printAirplaneDetails();
            }
            if (input.equals("x")) {
                break;
            }
        }
    }

    private void addAirplane() {
        System.out.println("Give the airplane id: ");
        String input1 = scanner.nextLine();
        System.out.println("Give the airplane capacity: ");
        int input2 = Integer.valueOf(scanner.nextLine());

        this.controlsystem.addAirplane(input1, input2);
    }

    private void addFlight() {
        System.out.println("Give the airplane id: ");
        String input1 = scanner.nextLine();
        Airplane inputPlane = askForAirplane(input1);
        if (inputPlane == null) {
            return;
        }
        System.out.println("Give the departure airport id: ");
        String input2 = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String input3 = scanner.nextLine();

        this.controlsystem.addFlight(inputPlane, input2, input3);
    }

    private Airplane askForAirplane(String input) {
        Airplane airplane = null;
        while (airplane == null) {
            airplane = this.controlsystem.getAirplane(input);

            if (airplane == null) {
                System.out.println("No airplane with the id " + input + ".");
                break;
            }
        }
        return airplane;
    }

    private void printAirplanes() {
        this.controlsystem.printAirplanes();
    }

    private void printFlights() {
        this.controlsystem.printFlights();
    }

    private void printAirplaneDetails() {
        System.out.println("Give the airplane id: ");
        String input = scanner.nextLine();
        Airplane airplane = askForAirplane(input);
        System.out.println(airplane.toString());
    }

}
