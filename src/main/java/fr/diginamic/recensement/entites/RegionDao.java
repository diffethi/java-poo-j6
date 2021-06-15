package fr.diginamic.recensement.entites;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegionDao {
    Region region=new Region();

    {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/recensement");
            PreparedStatement statement=connection.prepareStatement("insert into region (ID_region,nom) value(?,?) ");
            statement.setInt(1,region.getID_region());
            statement.setString(2,region.getNom_region());
            statement.executeUpdate();
            statement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
