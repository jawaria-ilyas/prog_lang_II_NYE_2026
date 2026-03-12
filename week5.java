package prog_lang_II_NYE_2026;

class Student {
   static int studentcount=0;
   Student(){
    studentcount++;
   }
   static void printstudentcount(){
    System.out.println("thetotal student is "+studentcount);
   }
}

class CoffeeMachine {
    private String brand;
    private double price;
    private double quantity;
    private double capacity;

    CoffeeMachine(String brand,double price,double quantity,double capacity){
        this.brand=brand;
        this.price=price;
        this.quantity=quantity;
        this.capacity=capacity;
    }

    public void setPrice(double price){ 
        if (price>0){
            this.price=price;
        }
    }

    public double getPrice(){
        return price;
    }

    public double getQuantity(){
        return quantity;
    }

    public double buy(double amount){
        if (amount>quantity){
            return -1;
        }
        quantity-=amount;
        return amount*price;
    }

    public double fill(){
        double filled=capacity-quantity;
        quantity=capacity;
        return filled;
    }

    public String toString(){
        return "brand: "+brand+" price: "+price+" quantity: "+quantity+" capacity: "+capacity;
    }
}

class Submarine {
    private int depth;

    Submarine(int depth) {
        this.depth = depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getDepth() {
        return depth;
    }

    public String toString() {
        return "Depth: " + depth;
    }

    public static void emergencySurface(Submarine[] fleet) {
        for (int i = 0; i < fleet.length; i++) {
            fleet[i].setDepth(0);
        }
    }
}

public class week5 {
    public static void main(String[] args) {

        System.out.println("Student Counter:");
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student.printstudentcount();

        System.out.println();

        System.out.println("Coffee Machine:");
        CoffeeMachine c=new CoffeeMachine("Nescafe",10.0,5.0,10.0);
        System.out.println(c);
        System.out.println("price: "+c.getPrice());
        System.out.println("quantity: "+c.getQuantity());
        System.out.println("buy 3 units: "+c.buy(3));
        System.out.println(c);
        System.out.println("fill the machine: "+c.fill());
        System.out.println(c);

        System.out.println();

        System.out.println("Submarine:");
        Submarine sub1 = new Submarine(200);
        Submarine sub2 = new Submarine(500);
        Submarine sub3 = new Submarine(100);

        Submarine[] fleet = {sub1, sub2, sub3};

        System.out.println("Before emergency :");
        for (int i = 0; i < fleet.length; i++) {
            System.out.println("Submarine " + (i + 1) + " " + fleet[i]);
        }

        Submarine.emergencySurface(fleet);

        System.out.println("After emergency :");
        for (int i = 0; i < fleet.length; i++) {
            System.out.println("Submarine " + (i + 1) + " " + fleet[i]);
        }
    }
}