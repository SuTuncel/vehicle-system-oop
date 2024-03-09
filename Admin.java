
package comp1112projectelifsu;

public class Admin extends Person {
    private int Id=2010;
    private String userName;
    private static int count;



    Admin(String name, String phone, String address){
        super(name,phone,address);
        Id+=count;
        count++;
        

    }

    Admin(String userName,String name, String phone, String address){
        super(name,phone,address);
        this.userName= userName;
    }


    public int getId() {
        return Id;
    }

    public String getUserName() {
        return userName;
    }

    public boolean equals(Object o){
        if(o instanceof Admin){
            Admin adm = (Admin)o;

            if(this.userName.equals(adm.userName))
                return true;

        }
        return false;

    }


}
