package SolusiUTP;

class Helper {

    // Helper to initialize
    static void initialize(){
        // Initilaize admin
        Main.admins[0] = new Admin("Joko", "ini_password_joko");
        Main.admins[1] = new Admin("Dengklek", "ini_password_dengklek");
        
        // Initialize Layanan
        Main.layanans[0] = new Layanan("Ganti Oli", 500000,
                "Layanan ganti oli adalah layanan standar untuk mengganti oli pada mesin. Layanan ini tidak membutuhkan waktu yang lama. Harga standar dari layanan ini adalah Rp. 500.000");
        Main.layanans[1] = new Layanan("Operasi Mobil", 2000000,
                "Mobil Anda mengalami mogok mendadak? Tidak bisa dinyalakan? Tenang, kami memiliki tenaga ahli untuk mengoperasi mobil Anda. Cukup dengan Rp. 2.000.000, mobil Anda akan sehat seperti sedia kala");
        Main.layanans[2] = new Layanan("Ketok Magic", 3000000,
                "Ketok Magic adalah layanan sulap untuk menghilangkan penyok pada body mobil. Apapun masalahnya, BIM SALABIM, bakal waras! Rogoh kantong Anda sebanyak Rp. 3.000.000 dan dapatkan mobil baru seperti sedia kala.");
        Main.layanans[3] = new Layanan("Mobil Racing", 5000000,
                "Bagi kalian jiwa muda yang ingin balapan, kami bisa modifikasi mobil kalian dengan tambahan NOS, serta body standar untuk balapan seharga Rp. 5.000.000 saja dan mobil Anda siap untuk menembus angin.");
        Main.layanans[4] = new Layanan("Mobil Elektrik", 5500000,
                "Modifikasi ini adalah modifikasi baru pada layanan bengkel kami, dimana Anda dapat mengubah mesin yang bertenagakan fosil menjadi bertenaga listrik dengan harga Rp. 5.500.000.");
    }

    // Helper function to authentication
    static boolean authentication(String username, String password) {
        for (Admin admin : Main.admins) {
            if (admin.isMatch(username, password)) {
                return true;
            }
        }
        return false;
    }

    // Helper to format price to rupiah
    static String getFormattedPrice(int price){
        return String.format("Rp. %,d", price);
    }
}
