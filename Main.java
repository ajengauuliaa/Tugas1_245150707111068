public class Main {
    public static void main(String[] args) {
        //Instansiasi Film
        Film film1 = new Film("Big Hero 6" , "Animasi, Laga, Petualagan", "14:50", 30000);
        Film film2 = new Film("The Moon" , "Petualagan, Drama, Sci-Fi", "12:40", 45000);
        Film film3 = new Film("Spider-Man: No Way Home" , "Laga, Petualangan, Komedi", "18:15", 35000);

        //Instansiasi Studio
        Studio studio1 = new Studio(1, 120, film1);
        Studio studio2 = new Studio(2, 95, film2);
        Studio studio3 = new Studio(3, 150, film3);

        //Instansiasi Penonton
        Penonton penonton1 = new Penonton("Yotha");
        Penonton penonton2 = new Penonton("Gun");
        Penonton penonton3 = new Penonton("Faifa");

        //Instansiasi Tiket
        Tiket tiket1 = new Tiket(103, film1, studio1, 17, penonton1);
        Tiket tiket2 = new Tiket(104, film2, studio2, 9, penonton2);
        Tiket tiket3 = new Tiket(105, film3, studio3, 15, penonton3);

        //Menampilkan Informasi Film & Studio
        System.out.println("\n======= Informasi Film & Studio =======");
        Studio[] daftarStudio = {studio1, studio2, studio3};
        for (Studio studio : daftarStudio) {
            System.out.println("Studio : " + studio.nomorStudio + 
                               " | Film: " + studio.film.judul + 
                               " | Kapasitas: " + studio.kapasitasKursi + " kursi");
        
        }

        //Menampilkan Daftar Tiket
        System.out.println("\n======= Daftar Tiket =======");
        Tiket[] daftarTiket = {tiket1, tiket2, tiket3};
        for (Tiket tiket : daftarTiket) {
            tiket.displayInfo();
        }

        System.out.println("\nTerima kasih telah menggunakan layanan kami!");
    }
}
