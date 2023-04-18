package org.example;

import javax.persistence.*;

@Entity
@Table(name = "TPC_PTE")
@AttributeOverrides({
        @AttributeOverride(name = "id",column = @Column(name = "id")),
        @AttributeOverride(name = "name",column = @Column(name = "name"))
})
public class PartTimeEmp extends Employee{

    private int hrs_sal,no_of_hrs;


    public PartTimeEmp(int id, String name, int hrs_sal,int no_of_hrs) {
        super(id, name);
        this.hrs_sal = hrs_sal;
        this.no_of_hrs= no_of_hrs;
    }

    public PartTimeEmp(){

    }

    public int getHrs_sal() {
        return hrs_sal;
    }

    public void setHrs_sal(int hrs_sal) {
        this.hrs_sal = hrs_sal;
    }

    public int getNo_of_hrs() {
        return no_of_hrs;
    }

    public void setNo_of_hrs(int no_of_hrs) {
        this.no_of_hrs = no_of_hrs;
    }
}

