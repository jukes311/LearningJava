import java.io.IOException;
import java.sql.SQLException;

public class LearningJava {

	public static void main(String[] args) {
		DatabaseTest test = new DatabaseTest();
		try {
			test.testConnection();
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
