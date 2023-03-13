package BMS;

public class Customer {
    String name,address,email,accType,cName;
    long phoneNo,accNo;
    int accBal=0;

    public Customer(String name, String address, String email, String accType, long phoneNo, long accNo) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.accType = accType;
        this.phoneNo = phoneNo;
        this.accNo = accNo;

    }

    public Customer(String name, String address, String email, String accType, String cName, long phoneNo, long accNo) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.accType = accType;
        this.cName = cName;
        this.phoneNo = phoneNo;
        this.accNo = accNo;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", accType='" + accType + '\'' +
                ", phoneNo=" + phoneNo +
                ", accNo=" + accNo +
                '}';
    }

    public int getAccBal() {
        return accBal;
    }

    public String getName() {
        return name;
    }

    public String getAccType() {
        return accType;
    }

    public String getcName() {
        return cName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

}
