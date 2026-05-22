import java.util.ArrayList;

interface adminProductOperations {
    void addToStock(Product p, int quantity);
    void placeOrder(Product p, Customer c);
    void cancelOrder(Product p, Customer c);

}



class Product {
    String nameofproduct;
    int price;
    int quantity;
    String productID;

    public Product(String nameofproduct, int quantity, String productID, int price) {
        this.nameofproduct = nameofproduct;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

}

class Electronics extends Product {
    int warrantryMonths;

    public Electronics(String nameofproduct, int quantity, String productID, int warrantryMonths, int price) {
        super(nameofproduct, quantity, productID, price);
        this.warrantryMonths = warrantryMonths;

    }

}

class Clothing extends Product {
    String sizeOfCloth;

    public Clothing(String nameofproduct, int quantity, String ProductID, String sizeOfCloth, int price) {
        super(nameofproduct, quantity, ProductID, price);
        this.sizeOfCloth = sizeOfCloth;
    }

}

class Customer {
    String nameofcustomer;
    int userid;
    int wallet = 10000;
    ArrayList<String> purchasedProductIDs = new ArrayList<>();

    public Customer(String nameofcustomer, int userid) {
        this.nameofcustomer = nameofcustomer;
        this.userid = userid;

    }

}

class Manager implements adminProductOperations{
    ArrayList<Product> Inventory = new ArrayList<>();

    @Override
    public void addToStock(Product p, int quantity) {
        boolean found = false;
        for (int i = 0; i < Inventory.size(); i++) {
            if (Inventory.get(i).productID.equalsIgnoreCase(p.productID)) {
                p.quantity = Inventory.get(i).quantity + quantity;

                Inventory.set(i, p);

                System.out.println(p.nameofproduct + " Stock updated");
                found = true;
                break;
            }
        }
        if (!found) {
            p.quantity = quantity;
            Inventory.add(p);
            System.out.println(p.nameofproduct + " New item added.");
        }

        System.out.println("Items added to stock successfully");

    }

    @Override
    public void cancelOrder(Product p, Customer c) {
        if (c.purchasedProductIDs.contains(p.productID)) {
            p.quantity++; // quantity update krdi inventory me
            c.wallet = c.wallet + p.price; // refund
            System.out.println("Return Approved and refund addded to " + c.nameofcustomer + "'s " + "account.");
            System.out.println("Updated Wallet Balance: " + c.wallet);
            c.purchasedProductIDs.remove(p.productID);
        } else {
            System.out.println("Error");
        }

        System.out.println(c.nameofcustomer + "'s" + " Order cancelled successfully");

    }

    @Override
    public void placeOrder(Product p, Customer c) {
        if (p.quantity <= 0) {
            System.out.println("Item out of stock.");
            
            return;
        }

        if (c.wallet < p.price) {
            System.out.println("You don't have sufficient balance.");
            return;
        }

        p.quantity--;
        c.wallet = c.wallet - p.price;
        c.purchasedProductIDs.add(p.productID);

        System.out.println();
        System.out.println();
        System.out.println("Order Successfull for: " + p.nameofproduct);
        System.out.println("Amount Deducted: " + p.price);
        System.out.println("Remaining Wallet Balance: " + c.wallet);
        System.out.println();
        System.out.println();

        System.out.println("Order placed successfully");

    }
}

public class ECommerce {
    public static void main(String args[]) {

        Manager admin = new Manager();

        Clothing tshirt = new Clothing("Tshirt", 5, "tA1", "XL", 1500);
        Electronics earphone = new Electronics("Earphone", 5, "earA1", 6, 2000);
        Customer Rohan = new Customer("Rohan", 0001);

        admin.addToStock(earphone, 15);
        admin.addToStock(tshirt, 15);
        admin.addToStock(tshirt, 15); // To check item already available or not
        admin.placeOrder(earphone, Rohan);
        admin.cancelOrder(earphone, Rohan);




    }
}