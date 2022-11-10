package tugas2;

public class Mahasiswa extends Elemen{
    private int sks;

    public Mahasiswa(String Nama, int sks ){
        super(Nama);
        setJamSibuk(sks);
    }
    public void tampilkanJamSibuk(){
        System.out.println(getNama() +" Adalah seorang mahasiswa dengan jam sibuk "+ getJamSibuk());  
    }
    public void setJamSibuk(int newSks){
        if (newSks >= 0) {
            sks = newSks;
        }
    }
    public int getJamSibuk(){
        return sks*3;
    }
    
}