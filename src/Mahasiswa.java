public class Mahasiswa extends Elemen {
    private Integer SKS;

    public Mahasiswa(String nama, Integer SKS){
        super (nama);
        this.SKS = SKS;
    }
    public Integer getJamSibuk(){
       return  SKS*3;
    }
}
