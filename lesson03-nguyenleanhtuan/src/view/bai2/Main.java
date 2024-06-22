package view.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int soxe = 0;

        System.out.print("Nhập số lượng xe cần nhập: ");
        Scanner ip = new Scanner(System.in);
        soxe = ip.nextInt();
        ip.nextLine();
        Vehicle[] vehicles = new Vehicle[soxe];

        for (int i = 0; i < vehicles.length; i++) {
            Vehicle xe = new Vehicle();
            System.out.print("\nNhập thông tin xe: \n");
            xe.Nhap();
            vehicles[i] = xe;
        }

        displayVehicleTaxes(vehicles);
    }

    public static void displayVehicleTaxes(Vehicle[] vehicles) {
        TaxDeclaration td = new TaxDeclaration();
        System.out.println("\n");
        System.out.println("====================================================================================================");
        printWithPadding("Tên chủ xe", 20);
        printWithPadding("Loại xe", 20);
        printWithPadding("Dung tích", 20);
        printWithPadding("Trị giá", 20);
        printWithPadding("Thuế phải nộp", 20);
        System.out.println();
        System.out.println("====================================================================================================");

        for (Vehicle vehicle : vehicles) {
            double tax = td.calculateTaxRate(vehicle.getDungtich(), vehicle.getGiaxe());
            printWithPadding(vehicle.getChuxe(), 20);
            printWithPadding(vehicle.getLoaixe(), 20);
            printWithPadding(String.valueOf(vehicle.getDungtich()), 20);
            printWithPadding(String.format("%.2f", vehicle.getGiaxe()), 20);
            printWithPadding(String.format("%.2f", tax), 20);
            System.out.println();
        }
    }

    public static void printWithPadding(String text, int padding) {
        System.out.print(text);
        for (int i = text.length(); i < padding; i++) {
            System.out.print(" ");
        }
    }
}
