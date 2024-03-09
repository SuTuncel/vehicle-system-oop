
package comp1112projectelifsu;

public class RegisteredUser extends Person{
    private int Id=1010;
    private static int count;

    RegisteredUser(String name,String phone, String address){
        super(name,phone,address);
        Id=Id+count;
        count++;
       

    }

  

    public int getId() {
        return Id;
    }



    public boolean equals(Object o ){
        if(o instanceof RegisteredUser){
            RegisteredUser rU = (RegisteredUser) o;

            if (this.Id== rU.Id)
                return true;

        }

        return false;
    }

}
