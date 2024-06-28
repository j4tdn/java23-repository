package shopping;

import java.util.Scanner;

public class Vehicle {
    private String ownerName;
    private String model;
    private int capacity;
    private double price;

    public Vehicle(String ownerName, String model, int capacity, double price) {
        this.ownerName = ownerName;
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    public double calculateTax() {
        if (capacity < 100) {
            return price * 0.01;
        } else if (capacity <= 200) {
            return price * 0.03;
        } else {
            return price * 0.05;
        }
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%d\t%.2f\t%.2f", ownerName, model, capacity, price, calculateTax());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng xe:");
        int numberOfVehicles = scanner.nextInt();
        scanner.nextLine(); 

        Vehicle[] vehicles = new Vehicle[numberOfVehicles];

        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.println("Nhập tên chủ xe");
            String owner = scanner.nextLine();
            System.out.println("Nhập loại xe");
            String model = scanner.nextLine();
            System.out.println("Nhập dung tích ");
            int capacity = scanner.nextInt();
            System.out.println("Nhập trị giá xe ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            vehicles[i] = new Vehicle(owner, model, capacity, price);
        }

        System.out.println("Tên chủ xe\tLoại xe\tDung tích\tTrị giá\tThuế phải nộp");
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
        scanner.close();
    }
}
