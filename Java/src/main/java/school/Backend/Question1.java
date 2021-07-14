package school.Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import school.Utils.JdbcUtils;

public class Question1 {
	private JdbcUtils jdbcUtils;
	private Connection connection;

	public void showInforProduct() throws ClassNotFoundException, SQLException {
		connection = jdbcUtils.connect();

		Statement statement = connection.createStatement();

		String sql = "SELECT * FROM product";

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			System.out.println(resultSet.getString("ProductId"));
			System.out.println(resultSet.getString("ProductName"));
			System.out.println(resultSet.getString("Producer"));
			System.out.println(resultSet.getString("ProductTypeId"));
		}
		connection.close();
	}

	public void addProduct(String name, String produce, short productType) throws ClassNotFoundException, SQLException {
		connection = jdbcUtils.connect();

		String sql = "INSERT INTO Product	(ProductName, 	Producer, 	ProductTypeId) VALUES\r\n"
				+ "							('?',			'?',		'?')";
		
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, produce);
		preparedStatement.setShort(3, productType);
		
		int eff = preparedStatement.executeUpdate();
		
		if (eff > 0) {
			System.out.println("Thêm thành công!");
		} else {
			System.err.println("Thêm không thành công!");
		}
	}
}
