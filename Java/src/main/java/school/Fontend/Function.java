package school.Fontend;

import java.sql.SQLException;
import java.util.Scanner;

import school.Backend.Question1;
import school.Utils.ScannerUtils;

public class Function {
	public Scanner scanner;
	Question1 question1 = new Question1();
	
	public void addProduct() throws ClassNotFoundException, SQLException {
		System.out.println("Nhập tên sản phẩm:");
		String name = ScannerUtils.inputString(null);
		System.out.println("Nhập tên nhà sản xuất:");
		String produce = ScannerUtils.inputString(null);
		System.out.println("Nhập loại sản phẩm 1. Houseware\n" + "2. ĐMX:");
		short productType = (short) ScannerUtils.inputInt(null);
		question1.addProduct(name, produce, productType);
		
	}
	
	public void showInProduct() throws ClassNotFoundException, SQLException {
		question1.showInforProduct();
	}
	
	
}
