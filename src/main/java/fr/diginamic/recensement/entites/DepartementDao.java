package fr.diginamic.recensement.entites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DepartementDao {
    Departement departement=new Departement();

    {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/recensement");
            PreparedStatement statement=connection.prepareStatement("insert into departement (ID_departement,nom) value(?,?) ");
            statement.setInt(1,departement.getID_departement());
            statement.setString(2,departement.getNom_departement());
            statement.executeUpdate();
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}


