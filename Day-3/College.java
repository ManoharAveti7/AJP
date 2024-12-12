public class College {
    String collegeCode;
    String collegeName;
    String address;
    Long phoneNumber;
    static String affilation="JNTU";
    void collegeDetails(){
        System.out.println("================");
        System.out.println("college Details:\n================\n"+collegeCode+"\n"+collegeName+"\n"+address+"\n"+affilation+"\n"+phoneNumber);
    }
    void transportationDetails(){
       System.out.println("tranportDetails");
    }
    public static void main(String[] args) {
        College college1 = new College();
        college1.collegeCode="AVIH";
        college1.collegeName="Avanthi";
        college1.address="Hyderabad";
        college1.phoneNumber=9876543210l;
        college1.collegeDetails();  

        College college2 = new College();
        college2.collegeCode="bril";
        college2.collegeName="briliant";
        college2.address="Hyderabad";
        college2.affilation="Autonomus";
        college2.phoneNumber=9876543210l;
        college2.collegeDetails(); 

    
         Fee f=new Fee();
         f.Name="Mani Kumar";
         f.RollNo="22Q65A6703";
         f.Money=90000;
         f.jntuhfee=true;
         f.tutionfee=false;
         f.CRTfee=true;
         f.FeeStructure();
   }
    
}
