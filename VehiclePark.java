
package comp1112projectelifsu;

import java.util.ArrayList;

public class VehiclePark {

    private ArrayList<Vehicle> listVehicle;
    private Admin admin= new Admin("su30560","ElifSu","12345","Şile");
    private ArrayList<RegisteredUser> registerList;
    private ArrayList<Vehicle> bookAndrentList;

    VehiclePark(){
        listVehicle=new ArrayList<>();
        registerList= new ArrayList<>();
        bookAndrentList= new ArrayList<>();

    }

    public Admin getAdmin() {
        return admin;
    }

    public ArrayList<RegisteredUser> getRegisterList() {
        return registerList;
    }

    public ArrayList<Vehicle> getListVehicle() {
        return listVehicle;
    }

    public ArrayList<Vehicle> getBookAndrentList() {
        return bookAndrentList;
    }

    public void register(String name, String phone, String address){ // kayıt olması için
        RegisteredUser rU = new RegisteredUser(name,phone,address);
        registerList.add(rU);
        System.out.println("Here is your Id: "+rU.getId());

    }



    public void addVehicles(String userName,String type,String color, int numOfDoors,int seatingCap,String plateNumber,
                            int numberOfTires, double DailyFee, int horsePower, String WdType,boolean isabroad){

        if(admin.getUserName().equals(userName)){
            if (type.equals("Sports")){
                listVehicle.add(new Sports(color,numOfDoors,seatingCap,plateNumber,numberOfTires,DailyFee,horsePower));

            }
            else if (type.equals("StationWagon")){
                listVehicle.add(new StationWagon(color,numOfDoors,seatingCap,plateNumber,numberOfTires,DailyFee));

            }
            else if (type.equals("Suv")){
                listVehicle.add(new Suv(color,numOfDoors,seatingCap,plateNumber,numberOfTires,DailyFee,WdType));

            }
            else if (type.equals("SmallTruck")){
                listVehicle.add(new SmallTruck(plateNumber,numberOfTires,DailyFee));
            }
            else if(type.equals("TransportTruck")){

                listVehicle.add(new TransportTruck(plateNumber,numberOfTires,DailyFee,isabroad));

            }


        }

    }

    public void removeVehicles(String userName,String plateNumber) {
        if (admin.getUserName().equals(userName)) {
            for (int i = 0; i < listVehicle.size(); i++) {
               if(listVehicle.get(i).getPlateNumber().equals(plateNumber)){
                   listVehicle.remove(i);
               }
            }
        }
    }

    public void rentVehicle(int Id,String plateNumber, int byear, int bMonth, int bday, int dyear, int dMonth, int dday,
                            boolean company, boolean customer) throws Exception {

        for (int j = 0; j < registerList.size(); j++) {
            if (registerList.get(j).getId()==Id) {

                for (int i = 0; i < listVehicle.size(); i++) {
                    if (listVehicle.get(i).getPlateNumber().equals(plateNumber)) {
                        listVehicle.get(i).rentMe(byear, bMonth, bday, dyear, dMonth, dday, company, customer);
                        Vehicle a = listVehicle.get(i);
                        bookAndrentList.add(a);
                    }

                }
            } else {
                System.out.println("Id does not match");
            }
        }
    }


    public void bookVehicle(int Id,String plateNumber, int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) throws Exception{
        for (int j = 0; j < registerList.size(); j++) {
            if (registerList.get(j).getId()==Id) {
                for (int i = 0; i < listVehicle.size(); i++) {

                    if (listVehicle.get(i).getPlateNumber().equals(plateNumber)) {
                        listVehicle.get(i).bookMe(bYear,bMonth,bday,dYear,dMonth,dday);
                        Vehicle a = listVehicle.get(i);
                        bookAndrentList.add(a);
                    }

                }
            } else {
                System.out.println("Id does not match");
            }
        }



    }

    public void cancelVehicle(int Id,String plateNumber,int bYear, int bMonth, int bday,int cYear, int cMonth, int cday) throws Exception{
        for (int j = 0; j < registerList.size(); j++) {
            if (registerList.get(j).getId()==Id) {
                for (int i = 0; i < listVehicle.size(); i++) {

                    if (listVehicle.get(i).getPlateNumber().equals(plateNumber)) {
                        listVehicle.get(i).cancelMe(bYear,bMonth,bday,cYear,cMonth,cday);
                    }

                }
            } else {
                System.out.println("Id does not match");
            }
        }

    }


    public void loadVehicle(int Id,String plateNumber,double capacity) throws Exception{
        for (int j = 0; j < registerList.size(); j++) {
            if (registerList.get(j).getId()==Id) {
                for (int i = 0; i < listVehicle.size(); i++) {

                    if (listVehicle.get(i).getPlateNumber().equals(plateNumber)) {
                        listVehicle.get(i).loadMe(capacity);
                    }

                }
            } else {
                System.out.println("Id does not match");
            }
        }

    }

    public  void dropVehicle(int Id,String plateNumber,int bYear, int bMonth, int bday, int dYear, int dMonth, int dday){
        for (int j = 0; j < registerList.size(); j++) {
            if (registerList.get(j).getId()==Id) {
                for (int i = 0; i < listVehicle.size(); i++) {

                    if (listVehicle.get(i).getPlateNumber().equals(plateNumber)) {
                        listVehicle.get(i).dropMe(bYear,bMonth,bday,dYear,dMonth,dday);
                    }

                }
            } else {
                System.out.println("Id does not match");
            }
        }
    }

    public void displayVehicles(){
        System.out.println("All Vehicles: ");
        for(int i=0;i< listVehicle.size(); i++){
            System.out.println(listVehicle.get(i).toString()+" ");

        }

    }


    public void displayBookedandRentedVehicles(){
        for(int i=0; i<bookAndrentList.size(); i++){
            System.out.println(bookAndrentList.get(i)+" ");


        }

    }


    }








