package dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;
import model.dao.CustomerDao;

public class CustomerDaoImp implements CustomerDao {

    @Override
    public int insert(Customer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        try ( Connection conn = DatabaseConnection.getConnection();  Statement stm = conn.createStatement()) {
            ResultSet rs = stm.executeQuery("SELECT * FROM customer");
            while (rs.next()) {
                customers.add(
                        new Customer(
                                rs.getInt("cus_id"),
                                rs.getString("cus_name")
                        )
                );
            }

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return customers;
    }
    // method ไหนที่ไม่ได้เขียนก็ให้คง code นี้ไว้ได้: throw new UnsupportedOperationException("Not supported yet."); 

    @Override
    public List<Customer> findByName(String name) {
        List<Customer> customers = new ArrayList<>();
        try ( Connection conn = DatabaseConnection.getConnection();  
                PreparedStatement stm = conn.prepareStatement("SELECT * FROM customer WHERE cus_name LIKE %?%")) {
            stm.setString(1, name);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                customers.add(
                        new Customer(
                                rs.getInt("cus_id"),
                                rs.getString("cus_name")
                        )
                );
            }

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return customers;
    }

}
