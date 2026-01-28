package main;

import dto.ItemDTO;
import service.ItemService;

import java.util.List;
import java.util.Scanner;

public class LostFoundMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemService service = new ItemService();

        int choice;
        do {
            System.out.println("\n--- Lost & Found System ---");
            System.out.println("1. Add Lost Item");
            System.out.println("2. View All Items");
            System.out.println("3. Update Item Status");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Item Name: ");
                    String name = sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    System.out.print("Location: ");
                    String loc = sc.nextLine();
                    System.out.print("Reporter Name: ");
                    String reporter = sc.nextLine();
                    System.out.print("Status (LOST/FOUND): ");
                    String status = sc.nextLine();

                    ItemDTO item = new ItemDTO(name, desc, loc, reporter, status);
                    if (service.addItem(item)) {
                        System.out.println("Item added successfully!");
                    } else {
                        System.out.println("Failed to add item.");
                    }
                    break;

                case 2:
                    List<ItemDTO> items = service.getAllItems();
                    if (items.isEmpty()) {
                        System.out.println("No items found.");
                    } else {
                        for (ItemDTO i : items) {
                            System.out.println(i);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Item ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter new status (LOST/FOUND): ");
                    String newStatus = sc.nextLine();
                    if (service.updateItemStatus(id, newStatus)) {
                        System.out.println("Status updated successfully!");
                    } else {
                        System.out.println("Failed to update status.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
