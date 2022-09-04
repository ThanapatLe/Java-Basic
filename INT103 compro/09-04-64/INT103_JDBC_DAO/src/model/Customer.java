package model;

public class Customer {
    private int cus_id;
    private String cus_name;

    public Customer(int cus_id, String cus_name) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
    }

    public int getCus_id() {
        return cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{cus_id=").append(cus_id);
        sb.append(", cus_name=").append(cus_name);
        sb.append('}');
        return sb.toString();
    }
    
    
}

