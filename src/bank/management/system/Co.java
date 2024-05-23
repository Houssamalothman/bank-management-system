package bank.management.system;

import java.sql.*;

public class Co {
    Connection connection;

    Statement statement;
    public Co(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/bankSystem", "root", "Khaled.95");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
