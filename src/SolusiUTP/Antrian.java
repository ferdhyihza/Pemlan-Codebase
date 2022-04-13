package SolusiUTP;

class Antrian {
    private String name;
    private String phoneNumber;
    private String licenseNumber;
    private Layanan[] layanans;
    private int totalPrice;

    // Helper index in layanans
    private int indexLayanan;

    // Constructor
    public Antrian(String name, String phoneNumber, String licenseNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
        setLicenseNumber(licenseNumber);
        this.indexLayanan = 0;
        setLayanans(new Layanan[3]);
        setTotalPrice(0);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber =  phoneNumber;
    }

    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber =  licenseNumber;
    }

    public void setLayanans(Layanan[] layanans){
        this.layanans = layanans;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getLicenseNumber(){
        return licenseNumber;
    }

    public Layanan[] getLayanan(){
        return layanans;
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }

    // Public helper getFormatted Price
    public String getFormattedPrice(){
        return Helper.getFormattedPrice(getTotalPrice());
    }

    // To String return a formattet string of layanan
    public String toString(){
        String string = String.format("Name\t\t: %s \nPhone\t\t: %s \nLicense\t\t: %s \n", getName(), getPhoneNumber(), getLicenseNumber());
        string += String.format("Daftar Layanan\t\t: \n");
        // Loop
        for (Layanan layanan : layanans) {
            if (layanan == null) {
                break;
            }
            string += String.format("----------------------------------------------------------\n");
            string += String.format("%s\n", layanan.toString());
            string += String.format("----------------------------------------------------------\n");
        }
        string += String.format("Total\t\t: %s \n", getFormattedPrice());
        return string;
    }

    // Helper untuk menambahkan layanan
    public void addLayanan(Layanan layanan){
        // Ini sudah gk bisa nambah lagi
        if (indexLayanan == 2) {
            return;
        }

        // Penambahan
        layanans[indexLayanan] = layanan;
        addTotalPrice(layanan.getPrice());
        indexLayanan++;
    }

    // Helper untuk menambahkan totalPrice
    public void addTotalPrice(int layananPrice){
        totalPrice += layananPrice;
    }
}
