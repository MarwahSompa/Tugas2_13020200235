// Nama                     : MARWAH SOMPA 
// NIM                      : 13020200235 
//HARI/ TANGGAL DAN WAKTU  : SELASA /22 MARET / 10:33 PM
// KELAS                    : B3
import java.util.Scanner; 
 
/* Baca N, Print i = 1 s/d N dengan WHILE */  
	public class PrintWhile { 
 
/**   
* @param args   
*/  
	public static void main(String[] args) {   
	// TODO Auto-generated method stub   
	/* Kamus : */    
	int N;   
	int i;   
		Scanner masukan=new Scanner(System.in);   
		/* Program */ 
 
  		System.out.print ("Nilai N >0 = "); /* Inisialisasi */    
		N = masukan.nextInt();    
		i = 1; /* First Elmt */ 
 
  		System.out.print ("Print i dengan WHILE: \n");    
	while (i <= N) /* Kondisi pengulangan */   { 
		System.out.println (i); /* Proses */ 
 
  		i++; /* Next Elmt */ 
 
  		}; 
		/* (i > N) */ 
 
 } 
 
} 
 