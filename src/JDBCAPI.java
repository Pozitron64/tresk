import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCAPI {
    private static final String URL = "jdbc:mysql://localhost:3306/nameDB";
    private static final String USERNAME = "USERNAME";
    private static final String PASSWORD = "PASSWORD";
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("java.sql.Driver");
        Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from TABLE");
        List<Person> listPerson = new ArrayList<>();
        while (resultSet.next()){
            listPerson.add(new Person(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getInt("age")));
        }
    }
}
class Person{
    private int id;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}