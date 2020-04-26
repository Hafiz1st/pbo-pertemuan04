public class PenerapanArray {
    public static void main(String[] args) {
        int suhuTubuh[] = {38, 39, 40, 37, 36, 36, 37, 36};

        int positifCovid = 0;
        int negatifCovid = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("Suhu tubuh anda adalah: " + suhuTubuh[i] + " derajat celcius.");
            if (38 <= suhuTubuh[i]) {
                System.out.println("Anda berkemungkinan besar positif COVID-19");
                positifCovid++;
            } else {
                System.out.println("Anda negatif COVID-19");
                negatifCovid++;
            }
        }
        System.out.println("Jumlah pasien positif COVID-19 adalah: " + positifCovid + " orang");
        System.out.println("Dan " + negatifCovid + " orang negatif COVID-19");
    }
}