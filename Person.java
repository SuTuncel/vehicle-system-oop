
package comp1112projectelifsu;

public class Person {
     
    protected String name;
    protected String phone;
    protected String address;
    
      public String getName() {
        return name;
    }
      
       public String getAddress() {
        return address;
    }


    public String getPhone() {
        return phone;
    }
    
    Person(String name, String phone,String address){
        this.name=name;
        this.phone=phone;
        this.address=address;
        
    }

    

}





