import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int row, column;
		System.out.println("Mayýn Tarlasýna Hoþgeldiniz.");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz.");
		System.out.print("Satýr sayýsý: ");
		row=scan.nextInt();
		System.out.print("Sütun sayýsý: ");
		column=scan.nextInt();
		
		MayinTarlasi mayin= new MayinTarlasi(row,column);
		mayin.run();

	}

}
