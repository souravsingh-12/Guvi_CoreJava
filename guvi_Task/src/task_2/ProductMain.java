package task_2;

import java.util.Scanner;

class ProductMain extends Product {

    // Method to calculate total amount spent
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;

        for (int i = 0; i < products.length; i++) {
            total += products[i].price * products[i].quantity;
        }

        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[5];

        // Accepting 5 products from user
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));

            System.out.print("Enter PID: ");
            int pid = sc.nextInt();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Finding product with highest price
        double maxPrice = products[0].price;
        int maxPid = products[0].pid;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }

        System.out.println("\nPID of product with highest price: " + maxPid);

        // Calculating total amount spent
        double totalAmount = calculateTotalAmount(products);

        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}
