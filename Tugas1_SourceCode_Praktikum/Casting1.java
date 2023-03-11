/*Nama	 : Nurul Azmi
NIM	 : 13020210066
Hari/Tgl : Rabu, 8 Maret 2023*/

public class Casting1 {
	public static void main(String[] args) {
	int a=5, b=6;
 	float d=2.f,e=3.2f;
 	char g='5';
 	double k=3.14;
 	System.out.println((float)a);         // int <-- float = 5.0
 	System.out.println((double)b);        // int <-- double = 6.0
 	System.out.println((int)d);           // float <-- int = 2
 	System.out.println((double)e);        // float <-- double = 3.2000000047683716
 	System.out.println((int)g);           // char <-- int (ASCII) = 53
 	System.out.println((float)g);         // char <-- float (ASCII) = 53.0
 	System.out.println((double)g);        // char <-- double (ASCII) = 53.0
 	System.out.println((int)k); 	      // double <-- int  = 3
 	System.out.println((float)k);         // double <-- float = 3.14
 	}
}