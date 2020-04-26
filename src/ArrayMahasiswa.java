public class ArrayMahasiswa {
    public static void main(String[] args) {
        String mataKuliah[];
        mataKuliah = new String[5];

        mataKuliah[0] = "Pemograman Berbasis Objek 1";
        mataKuliah[1] = "Visual 2";
        mataKuliah[2] = "Rekayasa Perangkat Lunak";
        mataKuliah[3] = "Organisasi Komputer";
        mataKuliah[4] = "Pemograman Web 2";

        for(int i = 0; i < 5; i++) {
            System.out.println(mataKuliah[i]);
        }
    }
}