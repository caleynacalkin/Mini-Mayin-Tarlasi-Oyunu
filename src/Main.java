import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int row, column;
		System.out.println("May�n Tarlas�na Ho�geldiniz.");
		System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz.");
		System.out.print("Sat�r say�s�: ");
		row=scan.nextInt();
		System.out.print("S�tun say�s�: ");
		column=scan.nextInt();
		
		MayinTarlasi mayin= new MayinTarlasi(row,column);
		mayin.run();

	}

}
