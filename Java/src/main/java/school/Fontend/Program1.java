package school.Fontend;

import java.sql.SQLException;

import school.Utils.ScannerUtils;



public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		menuFunction();
	}
	
	public static void menuFunction() throws ClassNotFoundException, SQLException {
		Function function = new Function();
		System.out.println("Chức năng sử dụng: " + "\n"
		+ "1. Show" + "\n"
		+ "2. Add" + "\n"
		+ "3. Exit");
		
		
		while (true) {
			System.out.print("Mời bạn nhập chức năng bạn: ");
			int choose = ScannerUtils.inputInt("Nhập đúng chức năng!");
			
			switch (choose) {
			case 1:
				function.showInProduct();
				break;
			case 2:
				function.addProduct();
				break;
			case 3:
				System.out.println("Đã thoát khỏi chương trình!");
				return;
			default: 
				System.out.println("Mời bạn nhập lại chức năng!");
			}
		}
	}
}
