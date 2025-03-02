class Film {
    String judul;
    String genre;
    String jamTayang;
    int hargaTiket;


    public Film(String judul, String genre, String jamTayang, int hargaTiket) {
        this.judul = judul;
        this.genre = genre;
        this.jamTayang = jamTayang;
        this.hargaTiket = hargaTiket;
    }
    
}

class Studio {
    int nomorStudio;
    int kapasitasKursi;
    Film film;

    public Studio(int nomorStudio, int kapasitasKursi, Film film) {
        this.nomorStudio = nomorStudio;
        this.kapasitasKursi = kapasitasKursi;
        this.film = film;
    }
     
}    

class Penonton {
    String namaPenonton;

    public Penonton(String namaPenonton) {
        this.namaPenonton = namaPenonton;
    }

}

class Tiket {
    int nomorTiket;
    Film film;
    Studio studio;
    int nomorKursi;
    Penonton penonton;
    int hargaTiket;

    public Tiket(int nomorTiket, Film film, Studio studio, int nomorKursi, Penonton penonton){
        this.nomorTiket = nomorTiket;
        this.film = film;
        this.studio = studio;
        this.nomorKursi = nomorKursi;
        this.penonton = penonton;
        this.hargaTiket = film.hargaTiket;   
    }

    public void displayInfo(){
        System.out.println("----------------------------------");
        System.out.println("Nomor Tiket #" + nomorTiket);
        System.out.println("Penonton   : " + penonton.namaPenonton);
        System.out.println("Film       : " + film.judul);
        System.out.println("Genre      : " + film.genre);
        System.out.println("Jam Tayang : " + film.jamTayang);
        System.out.println("Studio     : " + studio.nomorStudio);
        System.out.println("Nomor Kursi: " + nomorKursi);
        System.out.println("Harga      : Rp" + film.hargaTiket);
        System.out.println("----------------------------------");
    }
}

