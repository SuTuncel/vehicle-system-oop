
package comp1112projectelifsu;


import java.util.Scanner;

public class TestClass {

    static VehiclePark vPark= new VehiclePark();

    public static void main(String[] args) throws Exception {

        Scanner su = new Scanner(System.in);

        String wlc = "Welcome!";

        String mainMenu ="Main Menu\n"+
                "(1) Display all vehicles\n"+
                "(2) Display booked and rented vehicles\n"+
                "(3) Register me\n"+
                "(4) Continue as registered user\n"+
                "(5) Continue as admin\n"+
                "(6) Quit";

        String menu4 = "Menu 4\n"+
                "(1) Display all vehicles\n"+
                "(2) Display booked and rented vehicles\n"+
                "(3) Display available vehicles by type\n"+
                "(4) Book vehicle\n"+
                "(5) Rent vehicle\n"+
                "(6) Load vehicle\n"+
                "(7) Cancel vehicle\n"+
                "(8) Drop vehicle\n"+
                "(9) Quit";

        String menu5 = "Menu 5\n"+
                "(1) Display all vehicles\n"+
                "(2) Display booked and rented vehicles\n"+
                "(3) Add a new vehicle to the system\n"+
                "(4) Remove vehicle\n"+
                "(5) Reports\n"+
                "(6) Quit";




        System.out.println(wlc);

        while(true){
            System.out.println(mainMenu);
            System.out.println("Please select an option: ");
            int optn = su.nextInt();

            if(optn==6) {
                System.out.println("Goodbye...");
                break;

            }
            else if(optn==1){
               vPark.displayVehicles();

            }
            else if(optn==2){
                System.out.println("Rented and booked Vehicles");
              vPark.displayBookedandRentedVehicles();

            }
            else if(optn==3){
                System.out.println("Register");
                System.out.println("Enter your name: ");
                String name= su.next();
                System.out.println("Enter your phone number: ");
                String phone = su.next();
                System.out.println("Enter your address: ");
                String address= su.next();
                vPark.register(name,phone,address);


            }
            else if (optn==4){
                System.out.println("Registered User");

                System.out.println("Enter your Id: ");
                int Id= su.nextInt();

                        while(true) {
                            System.out.println(menu4);
                            System.out.println("Please select an action: ");
                            int actn = su.nextInt();

                            if (actn == 9) {
                                System.out.println("exiting from menu 4...");
                                break;

                            } else if (actn == 1) {
                                vPark.displayVehicles();
                            } else if (actn == 2) {
                                System.out.println("Rented and booked Vehicles");
                                  vPark.displayBookedandRentedVehicles();

                            } else if (actn == 3) {
                                System.out.println("*****");
                            } else if (actn == 4) {
                                System.out.println("Book Vehicle");
                                System.out.println("Enter your Id: ");
                                Id = su.nextInt();
                                System.out.println("Enter book year: ");
                                int bYear = su.nextInt();
                                System.out.println("Enter book month: ");
                                int bMonth = su.nextInt();
                                System.out.println("Enter book day: ");
                                int bDay = su.nextInt();
                                System.out.println("Enter delivery year: ");
                                int dYear = su.nextInt();
                                System.out.println("Enter delivery month: ");
                                int dMonth = su.nextInt();
                                System.out.println("Enter delivery day: ");
                                int dDay = su.nextInt();
                                System.out.println("Enter vehicle's plate number: ");
                                String plate= su.next();
                                vPark.bookVehicle(Id,plate,bYear,bMonth,bDay,dYear,dMonth,dDay);


                            } else if (actn == 5) {
                                System.out.println("Rent Vehicle");
                                System.out.println("Enter your Id: ");
                                Id = su.nextInt();
                                System.out.println("Enter book year: ");
                                int bYear = su.nextInt();
                                System.out.println("Enter book month: ");
                                int bMonth = su.nextInt();
                                System.out.println("Enter book day: ");
                                int bDay = su.nextInt();
                                System.out.println("Enter delivery year: ");
                                int dYear = su.nextInt();
                                System.out.println("Enter delivery month: ");
                                int dMonth = su.nextInt();
                                System.out.println("Enter delivery day: ");
                                int dDay = su.nextInt();
                                System.out.println("Do you want remote pickup? ");
                                boolean company = su.nextBoolean();
                                System.out.println("Do you want remote delivery?");
                                boolean customer = su.nextBoolean();
                                System.out.println("Enter vehicle's plate number: ");
                                String plate= su.next();
                                vPark.rentVehicle(Id,plate,bYear,bMonth,bDay,dYear,dMonth,dDay,company,customer);


                            } else if (actn == 6) {
                                System.out.println("Load Vehicle");
                                System.out.println("Enter your Id: ");
                                Id = su.nextInt();
                                System.out.println("Enter vehicle's plate number: ");
                                String plate= su.next();
                                System.out.println("Enter your capacity: ");
                                double capacity = su.nextDouble();
                                vPark.loadVehicle(Id,plate,capacity);

                            } else if (actn == 7) {
                                System.out.println("Cancel Vehicle");
                                System.out.println("Enter your Id: ");
                                Id = su.nextInt();
                                System.out.println("Enter book year: ");
                                int bYear = su.nextInt();
                                System.out.println("Enter book month: ");
                                int bMonth = su.nextInt();
                                System.out.println("Enter book day: ");
                                int bDay = su.nextInt();
                                System.out.println("Enter cancel year: ");
                                int cYear = su.nextInt();
                                System.out.println("Enter cancel month: ");
                                int cMonth = su.nextInt();
                                System.out.println("Enter cancel day: ");
                                int cDay = su.nextInt();
                                System.out.println("Enter vehicle's plate number: ");
                                String plate= su.next();

                                vPark.cancelVehicle(Id,plate,bYear,bMonth,bDay,cYear,cMonth,cDay);


                            } else if (actn == 8) {
                                System.out.println("Drop Vehicle");
                                System.out.println("Enter your Id: ");
                                Id = su.nextInt();
                                System.out.println("Enter book year: ");
                                int bYear = su.nextInt();
                                System.out.println("Enter book month: ");
                                int bMonth = su.nextInt();
                                System.out.println("Enter book day: ");
                                int bDay = su.nextInt();
                                System.out.println("Enter delivery year: ");
                                int dYear = su.nextInt();
                                System.out.println("Enter delivery month: ");
                                int dMonth = su.nextInt();
                                System.out.println("Enter delivery day: ");
                                int dDay = su.nextInt();
                                System.out.println("Enter vehicle's plate number: ");
                                String plate= su.next();
                                vPark.dropVehicle(Id,plate,bYear,bMonth,bDay,dYear,dMonth,dDay);


                            }
                        }

                    }

            else if (optn==5){
                System.out.println("Enter your userName: ");
                String userName=su.next();
                if(vPark.getAdmin().getUserName().equals(userName)){
                    while(true){
                        System.out.println(menu5);
                        System.out.println("Please select an action: ");
                        int act = su.nextInt();

                        if(act==6){
                            System.out.println("exiting from menu 5...");
                            break;

                        }
                        else if (act ==1){
                            vPark.displayVehicles();

                        }
                        else if (act ==2){
                             System.out.println("Rented and booked Vehicles");
                                 vPark.displayBookedandRentedVehicles();
                        }
                        else if(act==3){
                            System.out.println("Enter the userName");
                            userName= su.next();
                            System.out.println("Enter type of vehicles: ");
                            String type = su.next();

                            if(type.equals("Sports")){
                                System.out.println("Enter plate number: ");
                                String plate = su.next();
                                System.out.println("Enter color: ");
                                String color= su.next();
                                su.nextLine();
                                System.out.println("Enter number of doors: ");
                                int numofDoor = su.nextInt();
                                System.out.println("Enter number of seating: ");
                                int numofseating = su.nextInt();
                                System.out.println("Enter number of Tires: ");
                                int numofTires = su.nextInt();
                                System.out.println("Enter daily fee: ");
                                double df = su.nextDouble();
                                System.out.println("Enter horse power: ");
                                int hP = su.nextInt();
                                vPark.addVehicles(userName,"Sports",color,numofDoor,numofseating,plate,numofTires,df,hP," ",false);

                            }
                            else if(type.equals("StationWagon")){
                                System.out.println("Enter plate number: ");
                                String plate = su.next();
                                System.out.println("Enter color: ");
                                String color= su.next();
                                su.nextLine();
                                System.out.println("Enter number of doors: ");
                                int numofDoor = su.nextInt();
                                System.out.println("Enter number of seating: ");
                                int numofseating = su.nextInt();
                                System.out.println("Enter number of Tires: ");
                                int numofTires = su.nextInt();
                                System.out.println("Enter daily fee: ");
                                double df = su.nextDouble();
                                vPark.addVehicles(userName,"StationWagon",color,numofDoor,numofseating,plate,numofTires,df,0," ",false);

                            }
                           else if(type.equals("Suv")){
                                System.out.println("Enter plate number: ");
                                String plate = su.next();
                                System.out.println("Enter color: ");
                                String color= su.next();
                                System.out.println("Enter wdTYPE (chain or normal):");
                                String wdType= su.next();
                                su.nextLine();
                                System.out.println("Enter number of doors: ");
                                int numofDoor = su.nextInt();
                                System.out.println("Enter number of seating: ");
                                int numofseating = su.nextInt();
                                System.out.println("Enter number of Tires: ");
                                int numofTires = su.nextInt();
                                System.out.println("Enter daily fee: ");
                                double df = su.nextDouble();

                                vPark.addVehicles(userName,"Suv",color,numofDoor,numofseating,plate,numofTires,df,0,wdType,false);

                            }
                          else if(type.equals("SmallTruck")){
                                System.out.println("Enter plate number: ");
                                String plate = su.next();
                                su.nextLine();
                                System.out.println("Enter number of Tires: ");
                                int numofTires = su.nextInt();
                                System.out.println("Enter daily fee: ");
                                double df = su.nextDouble();

                                vPark.addVehicles(userName,"SmallTruck"," ",0,0,plate,numofTires,df,0," ",false);

                            }
                          else if(type.equals("TransportTruck")){
                                System.out.println("Enter plate number: ");
                                String plate = su.next();
                                su.nextLine();
                                System.out.println("Enter number of Tires: ");
                                int numofTires = su.nextInt();
                                System.out.println("Enter daily fee: ");
                                double df = su.nextDouble();
                                System.out.println("Is abroad (true/false): ");
                                boolean abroad= su.nextBoolean();

                                vPark.addVehicles(userName,"TransportTruck"," ",0,0,plate,numofTires,df,0," ",abroad);
                            }

                        } else if (act==4){
                            System.out.println("Remove VEHİCLE");
                            System.out.println("Enter the userName");
                            userName= su.next();
                            System.out.println("Enter vehicle's plate number:");
                            String plate = su.next();
                            vPark.removeVehicles(userName,plate);
                        }
                        else if(act==5){
                            System.out.println("Daily Report");
                            System.out.println("***");
                        }
                    }

                }
                else{
                    System.out.println("There is no such ID");
                }

            }

        }
    }

}




