package fr.diginamic.recensement.entites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VilleDao {
    Villes villes=new Villes();
    Departement departement= new Departement();


    {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/recensement");
            PreparedStatement statement=connection.prepareStatement("insert into Villes (ID_ville,nom,ID_departement) value(?,?) ");
            statement.setInt(1,villes.getID_ville());
            statement.setString(2,villes.getNom());
            statement.setInt(3,departement.getID_departement());
            statement.executeUpdate();
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}


