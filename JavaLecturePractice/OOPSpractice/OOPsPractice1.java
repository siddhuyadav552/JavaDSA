interface PhoneOperations {
    void powerOn();

    void powerOff();

    void ring();
}

class Phone implements PhoneOperations {
    String brandName;
    private int releaseYear;
    private String type;

    public Phone(String BrandName, int ReleaseYear, String typeOfPhone) {
        this.brandName = BrandName;
        this.releaseYear = ReleaseYear;
        this.type = typeOfPhone;
    }

    @Override
    public void powerOff() {
        System.out.println(brandName + " is turning OFF.......");
    }

    @Override
    public void powerOn() {
        System.out.println(brandName + " is turning ON......");
    }

    @Override
    public void ring() {
        System.out.println(brandName + " is ringing....");
    }

    // Getter for releaseYear
    public int getReleaseYear() {
        return releaseYear;
    }

    // Setter for release Year(with logic)
    public void setReleaseYear(int year) {
        if (year > 1876 && year <= 2026) {
            this.releaseYear = year;
        } else {
            System.out.println("Invalid Year! Please enter a valid year");
        }
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        if (type.equalsIgnoreCase("touchscreen") || (type.equalsIgnoreCase("keypad"))) {
            this.type = type;
        } else {
            System.err.println("Enter valid type");
        }
    }

}

class IPhone extends Phone {
    private int iosVersion;
    private String faceIdStatus;

    // Now making constructor
    public IPhone(String brandName, int ReleaseYear, String typeOfPhone, int iosVersion, String faceIdStatus) {
        // Super keyword se Parent(Phone) ka constructor call hoga
        super(brandName, ReleaseYear, typeOfPhone);
        this.iosVersion = iosVersion;
        this.faceIdStatus = faceIdStatus;
    }

    // Iphone class ka apna method
    public void airDrop() {
        System.out.println(brandName + " is sending files via AirDrop......");
    }

    // Method OverRiding: Apple ke liye powerOn method change hoga
    @Override
    public void powerOn() {
        System.out.println("Welcome to iOS.");
    }
    @Override
    public void powerOff(){
        System.out.println("iOS shutting down.");
    }
    

    //Getter For IPhone 

    public int getiosVersion(){
        return iosVersion;
    }

    // Setter of IPhone ios version

    public void setiosVersion(int iosVersion){
        this.iosVersion = iosVersion;
    }

    @Override
    public void ring(){
        System.out.println("ding ding ding ding ding.................");
    }

}

public class OOPsPractice1 {
    public static void main(String args[]) {
        Phone nokiaA1 = new Phone("Nokia", 2006, "keypad");
        Phone nokiaA2 = new Phone("Nokia", 2021, "Touchscreen");

        // Using Getter to get release year data of object
        System.out.println("Release date of " + nokiaA1.brandName + " is " + nokiaA1.getReleaseYear());

        // Using Setter for changing value of a private variable
        nokiaA1.setReleaseYear(2008);

        // Checking value is changed or not
        System.out.println("Updated Release date of " + nokiaA1.brandName + " is " + nokiaA1.getReleaseYear());

        IPhone iphoneA1 = new IPhone("Apple", 2025, "TouchScreen", 10, "Availabe");
        iphoneA1.powerOn();
        iphoneA1.powerOff();

        System.out.println(iphoneA1.getiosVersion());
        iphoneA1.setiosVersion(15);
        System.out.println(iphoneA1.getiosVersion());
        iphoneA1.ring();


    }

}
