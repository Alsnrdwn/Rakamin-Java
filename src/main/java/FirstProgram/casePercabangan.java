package FirstProgram;

import java.util.Scanner;
public class casePercabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nilai : ");
        int nilai = scanner.nextInt();
        String grade;

        if (nilai >= 90) {
            grade = "A";
        } else if (true == nilai >= 80) {
            grade = "B";
        } else if (true == nilai >= 70) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Nilai Anda Adalah : " + grade);
    }
}
