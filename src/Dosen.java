public class Dosen extends Elemen {
    private Integer jumlahHariKerja;
    public Dosen(String nama, Integer hariKerja){
        super(nama);
        this.jumlahHariKerja = hariKerja;
    }
    public Integer getJamSibuk(){
        return jumlahHariKerja*8;
        
    }
}
