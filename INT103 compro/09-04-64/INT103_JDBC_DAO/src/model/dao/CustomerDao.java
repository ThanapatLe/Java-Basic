
package model.dao;

import java.util.List;
import model.Customer;



public interface CustomerDao{
    int insert(Customer obj);
    List<Customer> getAll();
   
    // เพื่อให้สามารถทดสอบเมื่อเขียนโปรแกรมบางส่วนได้จึงทำไว้เป็น default method
    default List<Customer> findById(int id){ 
        throw new UnsupportedOperationException("findById ไม่ได้เลือกทำจึง ยังไม่สามารถเรียกใช้งานได้ ควร comment การเรียกใช้ไว้ก่อน"); 
    }
    default List<Customer> findByName(String name){
        throw new UnsupportedOperationException("findByName ไม่ได้เลือกทำจึง ยังไม่สามารถเรียกใช้งานได้ ควร comment การเรียกใช้ไว้ก่อน"); 
    }
}
