/*Nama	 : Nurul Azmi
NIM	 : 13020210066
Hari/Tgl : Rabu, 10 Maret 2023*/

/* Contoh pengoperasian variabel bertype dasar */
public class Oprator {
	public static void main(String[] args) {
		boolean Bool1, Bool2, TF ; 
		int i,j, hsl ;
		float x,y,res; 
	System.out.println("operasi Logika");
		Bool1 = true; Bool2 = false;
		TF = Bool1 && Bool2 ; /* Boolean AND */ 
		System.out.println("TF = " + TF);	
		TF = Bool1 || Bool2 ; /* Boolean OR */ 
		System.out.println("TF = " + TF);
		TF = ! Bool1 ; /* NOT */
		System.out.println("TF = " + TF);
		TF = Bool1 ^Bool2; /* XOR */
		System.out.println("TF = " + TF);
 	System.out.println("operasi Numerik");
 		i = 5; j = 2 ;
		hsl = i+j; 
		System.out.println("hsl =" + hsl);
		hsl = i - j; 
		System.out.println("hsl =" + hsl);
		hsl = i / j; 
		System.out.println("hsl =" + hsl);
		hsl = i * j; 
		System.out.println("hsl = " + hsl);
		hsl = i /j ; /* pembagian bulat */
		System.out.println("hsl = " + hsl);
		hsl = i%j ; /* sisa modulo */
		System.out.println("hsl = " + hsl);
	/* operasi numerik */ 
		x = 5 ; y = 5 ;
		res = x + y;
		System.out.println("res = " + res); 
		res = x - y; 
		System.out.println("res = " + res); 
		res = x / y; 
		System.out.println("res = " + res); 
		res = x * y;
		System.out.println("res = " + res); 
	System.out.println("operasi relasional numerik atau permandingan");
 		TF = (i==j); 
		System.out.println("TF = " + TF);
 		TF = (i!=j);
		System.out.println("TF = " + TF);
		TF = (i < j); 
		System.out.println("TF = " + TF);
		TF = (i > j); 
		System.out.println("TF = " + TF);
		TF = (i <= j);
		System.out.println("TF = " + TF); 
		TF = (i >= j);
		System.out.println("TF = " + TF);
	/* operasi relasional numerik */ 
		TF = (x != y);
		System.out.println("TF = " + TF);
		TF = (x < y); 
		System.out.println("TF = " + TF);
		TF = (x > y); 
		System.out.println("TF = " + TF);
		TF = (x <= y); 
		System.out.println("TF = " + TF);
		TF = (x >= y);
		System.out.println("TF = " + TF);
 	}
}