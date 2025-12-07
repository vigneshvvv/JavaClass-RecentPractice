package stream;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DatabaseConnection {
	
	String hostname = "jdbc:mysql://localhost:3306/javatrainingpro";
	String user = "root";
	String password = "Vignesh333#";
	Connection connection;
	
	public void getBookDetails() throws SQLException {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(hostname, user, password);
			Statement state =   connection.createStatement();
			ResultSet rs =   state.executeQuery("select * from books where books.price = 200");
			
			List<Books> bookslist = new ArrayList<Books>();
			while(rs.next()) {
				Books book = new Books();
				book.setId(rs.getInt("id"));
				book.setBook_name(rs.getString("book_name"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getInt("price"));
				
				bookslist.add(book);
			}
			
			System.out.println(bookslist);
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
		}
	}
	
	public void addBookDetails(Books books) throws ClassNotFoundException, SQLException {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(hostname,user,password);
			PreparedStatement ps = connection.prepareStatement("insert into books (id,book_name,author,price )values(?,?,?,?)");
			ps.setInt(1,books.getId());
			ps.setString(2,books.getBook_name());
			ps.setString(3,books.getAuthor());
			ps.setInt(4,books.getPrice());
			
			boolean status = ps.execute();
			System.out.println("status is"+status);
//			getbooklist();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
