package tugas2;
public class  Asdos extends Mahasiswa{
    private int jamNgasdos;
    public Asdos(String nama, int sks, int jamNgasdos){
        super( nama,  sks);
        setJamNgasdos(jamNgasdos);
        
    }
    public void tampilkanJamSibuk(){
        System.out.println(getNama() + " adalah seorang asdos dengan jam sibuk " + getJamSibuk());
    }
    public void setJamNgasdos(int newJamNgasdos){
        if(newJamNgasdos >=0){
            jamNgasdos = newJamNgasdos;
        }
    }
    public int getJamSibuk(){
        return jamNgasdos + super.getJamSibuk();
    }
    
}