package Assignment_9;

class Medicine{
    public void displayLabel(){
        System.out.println("Name: Cipla Pharma");
        System.out.println("Address: Pithampur");
    }
}

class Tablet extends Medicine{
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("Store in a cool dry place");
    }
}

class Oinments extends Medicine{
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("for external use only");
    }
}

class Syrups extends Medicine{
    @Override
    public void displayLabel() {
        super.displayLabel();
        System.out.println("check expiry before use");
    }
}


public class Q3 {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[10];



        for(int i=0;i<10;i++){
            int r=(int)(Math.random()*3+1);
            switch (r){
                case 1:
                    medicines[i]=new Tablet();
                    break;
                case 2:
                    medicines[i]=new Oinments();
                    break;
                case 3:
                    medicines[i]=new Syrups();
                    break;

            }

        }

        for(int i=0;i<10;i++){
            medicines[i].displayLabel();
            System.out.println();
        }
    }
}


//Output-
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        for external use only
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        Store in a cool dry place
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        Store in a cool dry place
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        check expiry before use
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        Store in a cool dry place
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        check expiry before use
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        Store in a cool dry place
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        Store in a cool dry place
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        check expiry before use
//
//        Name: Cipla Pharma
//        Address: Pithampur
//        for external use only
