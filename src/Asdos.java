public class Asdos extends Mahasiswa {
    private Integer jamNgasdos;

    public Asdos(String nama, Integer SKS, Integer jamNgasdos){
        super(nama, SKS);
        this.jamNgasdos = jamNgasdos;
        
    }
    public Integer getjamNgasdos(){
        return super.getJamSibuk()+jamNgasdos;
    }
}
