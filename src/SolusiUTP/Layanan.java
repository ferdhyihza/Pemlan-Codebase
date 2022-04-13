package SolusiUTP;

class Layanan {
    private String name;
    private int price;
    private String description;

    // Constructor
    public Layanan(String name, int price, String description){
        setName(name);
        setPrice(price);
        setDescription(description);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description =  description;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    // Public helper getFormatted Price
    public String getFormattedPrice(){
        return Helper.getFormattedPrice(getPrice());
    }

    // To String return a formattet string of layanan
    public String toString(){
        // String string = String.format("Name\t\t: %s \nPrice\t\t: %s \nDescription\t: %s \n", getName(), getFormattedPrice(), getDescription());
        String string = String.format("Name\t\t: %s \nPrice\t\t: %s \n", getName(), getFormattedPrice());
        return string;
    }
}
