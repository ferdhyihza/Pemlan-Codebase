package SolusiUTP;

class Admin {
    private String name;
    private String password;

    // Constructor
    public Admin(String name, String password){
        setName(name);
        setPassword(password);
    }

    // Basic Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Basic Getters

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    // To String return a formattet string of layanan
    public String toString() {
        return "formatted string";
    }

    // Is match with Name and Password
    public boolean isMatch(String name, String password){

        return this.name.equals(name) && this.password.equals(password);
    }
}
