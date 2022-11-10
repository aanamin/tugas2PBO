package tugas2;

public class Dosen extends Elemen {
    private int jumlahHariKerja;
    public Dosen(String nama, int jumlahHariKerja){
        super(nama);
        setJamSibuk(jumlahHariKerja);
        System.out.println(getNama() + " adalah seorang dosen dengan jam sibuk "+ getJamSibuk());
    }

    public void setJamSibuk(int newJumlahHariKerja){
        if (newJumlahHariKerja >=0){
            jumlahHariKerja = newJumlahHariKerja * 8;
        }
    }
    public int getJamSibuk(){
        return jumlahHariKerja;
    }
}
