import java.util.*;
public class GettersSetters {
    public static void main(String args[]){
        Pencil pencil1 = new Pencil();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brand name of the pencil: ");
        String name = sc.nextLine();

        System.out.println("Enter tip size: ");
        int tip = sc.nextInt();

        System.out.println("Enter the owner name: ");
        String owner = sc.nextLine();


         
        pencil1.setName(name);
        pencil1.setTipSize(tip);
        pencil1.setOwner(owner);

        System.out.println("Pencil details:");

        
        pencil1.getOwner();
        pencil1.getName();
        pencil1.gettipSize();

    }
}

class Pencil{
    
    private String name;
    private int tip;
    private String owner;

    
    public void setName(String x){
        this.name = x;
    }

    void setTipSize(int y){
        this.tip = y;
    }

    void setOwner(String z){
        this.owner = z;
    }

    



    public String getName(){
        return name;
    }

    public int gettipSize(){
        return tip;
    }

    public String getOwner(){
        return owner;
    }

}
