 
import java.util.*;
public class amali{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		String namaPekerja;
		int bilHaribekerja = 31;
		double kadarGaji = 160.00;
		double gajiBulanan;
		
		System.out.println("Nama pekerja:");
		namaPekerja = input.nextLine();
		
		do {
			System.out.println("masukkan bilangan hari bekerja sebulan:");
			bilHaribekerja = input.nextInt();
		if (bilHaribekerja > 31) {
			System.out.println("RALAT!!!!BILANGAN HARI TIDAK BOLEH MELEBIHI 31 HARI!!!!");
		}
		  
		}  while (bilHaribekerja > 31); {
		}
			gajiBulanan = bilHaribekerja * kadarGaji;
			
			System.out.println("rumusan gaji bulanan bagi:" + namaPekerja);
			System.out.println("Jumlah hari bekerja:" + bilHaribekerja);
			System.out.println("GAJI SEBULAN ADALAH:" + gajiBulanan);
			
		
			
	}
}