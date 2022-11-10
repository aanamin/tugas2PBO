package tugas2;

public class Simulator {
    public static void main(String[] args) {
        Elemen siAsdos = new Asdos("Fairuzikun", 24, 1); //upcasting
        siAsdos.tampilkanJamSibuk();

        Elemen pakDosen = new Dosen("Raja OP Damanik", 5); //upcasting
        Elemen siAsdos2 = new Asdos("Angel-chan", 21, 1); //upcasting
        siAsdos2.tampilkanJamSibuk();

        Elemen mahasiswa1 = new Mahasiswa("Firman", 20); //upcasting
        mahasiswa1.tampilkanJamSibuk();
        
        Elemen mahasiswa2 = new Mahasiswa("Nid to pass this sem", 23);//upcasting
        mahasiswa2.tampilkanJamSibuk();
        
        Elemen bangDosen = new Dosen("Nivotko", 3); //upcasting
        // line 5,8,9,12,15,18 termasuk polymorphism karena terdapat banyak objek dengan banyak bentuk ada yang dosen,asdos,mahasiswa
        
        int totalJamSibuk = siAsdos.getJamSibuk() + pakDosen.getJamSibuk() + siAsdos2.getJamSibuk() + mahasiswa1.getJamSibuk() +mahasiswa2.getJamSibuk() +bangDosen.getJamSibuk();
        System.out.println("Total jam sibuk Fasilkom adalah " + totalJamSibuk);
    }
}
