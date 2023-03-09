package SMS;

public class Address {
    private int pno,fno,pincode;
    private String hname, area, city, state , country;

    //Argument constructor: Parametrised constructor


    public Address(int pno,int pincode, String hname,
                   String area, String city, String state, String country) {

        this.pno = pno;
        this.pincode = pincode;
        this.hname = hname;
        this.area = area;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "pno=" + pno +
                ", pincode=" + pincode +
                ", hname='" + hname + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

