package app;

import dataaccess.CustomerDaoImp;
import java.util.List;
import model.Customer;
import model.dao.CustomerDao;
import sample.CustomerSample;

public class Application {
    public static void main(String[] args) {
        DatabaseInitialization.reNew(); // ใช้เฉพาะในการสอบนี้เท่านั้นเพื่อเคลียข้อมุลใหม่ทุกครั้งที่รัน
       // core application
       // core application
       
//// // ตัวอย่างการเรียกใช้งานในข้อ 1 สร้าง class ไว้ใช้งานได้
        System.out.println("\n-->  ตัวอย่างการเรียกใช้งานในข้อ 1 สร้าง class ไว้ใช้งานได้");
        Customer[] custs=CustomerSample.genCustomer();
        

//
        CustomerDao custDao2=new CustomerDaoImp();
        List<Customer> custInDb2_1=custDao2.getAll();
//        List<Customer> custInDb2_2=custDao2.findById(7001);
//        List<Customer> custInDb2_3=custDao2.findByName("Dawn");
        for (Customer customer : custInDb2_1) {
            System.out.println(customer.toString());
        }
       
    }
    
}
