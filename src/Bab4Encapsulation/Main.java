package Bab4Encapsulation;

class Customer {

    private String nama;
    private String alamat;
    private int memberCard = 0; // Default, 0 berarti tidak memiliki membercard
    private final int harga = 10000; // Tetapan harga per tiket
    private int totalHarga;

    public Customer(){

    }

    // Constructor untuk pembuatan akun customer dengan membercard
    public Customer(String nama, String alamat, int memberCard) {
        this.nama = nama;
        this.alamat = alamat;
        this.memberCard = memberCard;
    }

    // Constructor untuk pembuatan akun customer biasa
    public Customer(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    // Method untuk pemesanan tiket (Customer member dan non member)
    public void pesanTiket(int jumlah){
        totalHarga = (memberCard == 0) ? harga * jumlah : (int) (harga * 0.8) * jumlah;
        printData(jumlah);
        String status = (memberCard == 0) ? "^ Anda bukan member, tidak dapat diskon" : "^ Anda member, dapat diskon 20%";
        System.out.println(status);
        System.out.println("---------------------------------------\n\n");
    }

    // Method untuk pemesanan tiket dengan apply Voucher
    public void pesanTiket(int jumlah, String kodeVoucher){
        // Untuk memastikan punya membercard atau tidak
        if (memberCard == 0) {
            totalHarga = 0;
            totalHarga += (int) (harga * 0.9) * jumlah;
            printData(jumlah);
            System.out.println("^ Anda bukan member, voucher berhasil " +
                    "\ndigunakan: " + kodeVoucher +
                    "\ndapat diskon 10%");
            System.out.println("---------------------------------------\n\n");
        } else {
            pesanTiket(jumlah);
        }
    }

    // Method untuk menampilkan informasi
    private void printData(int jumlah){
        System.out.println("--------------- Invoice ---------------");
        System.out.printf("%-15s = %s\n", "Nama", this.nama);
        System.out.printf("%-15s = %s\n", "Kartu member", this.memberCard);
        System.out.printf("%-15s = %s\n", "Alamat", this.alamat);
        System.out.printf("%-15s = %d\n", "Jumlah tiket", jumlah);
        System.out.printf("%-15s = Rp%d\n\n", "Harga", this.totalHarga);
    }
}

class Main {

    public static void main(String[] args) {

        // Skenario 1: Customer Biasa memesan tiket, bayar full (normal)
        Customer cust1 = new Customer("Arie", "Malang");
        cust1.pesanTiket(10);

        // Skenaario 2: Customer Biasa memesan tiket dengan apply Voucher, diskon 10%
        cust1.pesanTiket(10, "7hbKJsnui78");

        // Skenario 3: Customer Member memesan tiket, diskon 20%
        Customer cust2 = new Customer("Sandi", "Batu", 54688);
        cust2.pesanTiket(10);

        // Skenario 4: Customer Member memesan tiket dengan apply Voucher (voucher akan useless), tetap diskon 20%
        cust2.pesanTiket(10, "kjasfb78G");
        
    }
}
