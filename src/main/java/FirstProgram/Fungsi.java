package FirstProgram;

public class Fungsi {
    public static int tambah(int a, int b){
        return a + b;
    }

    public static int kuadrat(int x){
        return x * x;
    }

    public static void main(String[] args){
        int hasilTambah = tambah(5, 3);
        int hasilKuadrat = kuadrat(4);

        System.out.println("Hasil Tambah : " + hasilTambah);
        System.out.println("Hasil kuadrat : " + hasilKuadrat);
        System.out.println("Hasil kuadrat : " + hasilKuadrat);
    }
}
