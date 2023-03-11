/*Nama	 : Nurul Azmi
NIM	 : 13020210066
Hari/Tgl : Rabu, 10 Maret 2023*/

public class Ekspresi1 {
    public static void main(String[] args) {
        int x = 1; 
        int y = 2; 
        float fx; 
        float fy;
        /* ALGORITMA */
        System.out.print("x/y (format integer) = " + x / y);
        System.out.print("\nx/y (format float) = " + (float) x / y);

        /* supaya hasilnya tidak nol */
        fx = x;
        fy = y;
        System.out.print("\nx/y (format integer) = " + (int) fx / (int) fy);
        System.out.print("\nx/y (format float) = " + fx / fy);
        /* casting */
        System.out.print("\nfloat(x)/float(y) (format integer) = " +  x / y);
        System.out.print("\nfloat(x)/float(y) (format float) = " + (float) x / y);
        x = 10; 
        y = 3;
        System.out.print("\nx/y (format integer) = " + x / y);
        System.out.print("\nx/y (format float) = " + (float) x / y);
    }
}
