
package comp1112projectelifsu;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Car extends Vehicle{

    private String color;
    private int numOfDoors;
    private int seatingCap;

    Car(String color, int numOfDoors,int seatingCap,String plateNumber, int numberOfTires, double DailyFee){
        super(plateNumber, numberOfTires, DailyFee);
        this.color= color;
        this.numOfDoors= numOfDoors;
        this.seatingCap= seatingCap;
    }

    public String getColor() {
        return color;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public int getSeatingCap() {
        return seatingCap;
    }

    @Override
    public void cancelMe(int bYear, int bMonth, int bday,int cYear, int cMonth, int cday) throws Exception{
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        Calendar cancelDate= new GregorianCalendar(cYear,cMonth-1,cday);

        if(cancelDate.compareTo(bookDate)>0){
           throw new Exception("NoCancellationYouMustPay");
        }
        else{
            System.out.println("Your book is canceled");
            numberOfVehicles++;
        }
    }

    @Override
    public void dropMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        System.out.println("Number of days you rent: "+getNumberOfDays( bYear,  bMonth, bday, dYear, dMonth, dday)+
                " and your total price: $"+getDailyFee( bYear, bMonth, bday, dYear,  dMonth, dday)+" .");
        numberOfVehicles++;
    }


    @Override
    public void bookMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) throws Exception {
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        this.deliveryDate= new GregorianCalendar(dYear,dMonth-1,dday);

        if(numberOfVehicles==0){
            throw new Exception("SorryWeDontHaveThatOne ");
        }
        System.out.println("You booked the vehicle between "+ bookDate.getTime()+ " and "+ deliveryDate.getTime()+" .");
        numberOfVehicles--;
    }

    @Override
    public void rentMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday,boolean company, boolean customer) throws
            Exception{
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        this.deliveryDate= new GregorianCalendar(dYear,dMonth-1,dday);

        if(numberOfVehicles>0) {
            if (company && !customer) {
                System.out.println("You rented the vehicle on " + bookDate.getTime() + ". You must deliver it on " + deliveryDate.getTime() + " .");
                numberOfVehicles--;
                System.out.println("Your vehicle will be delivered to your desired location by the company");

            } else if (!company && customer) {
                System.out.println("You rented the vehicle on " + bookDate.getTime() + ". You must deliver it on " + deliveryDate.getTime() + " .");
                numberOfVehicles--;
                System.out.println("You can leave your vehicle wherever you want.");

            } else if (company && customer) {
                System.out.println("You rented the vehicle on " + bookDate.getTime() + ". You must deliver it on " + deliveryDate.getTime() + " .");
                numberOfVehicles--;
                System.out.println("Your vehicle will be delivered to your desired location by the company " + " and " +
                        "You can leave your vehicle wherever you want.");

            } else {
                System.out.println("You rented the vehicle on " + bookDate.getTime() + ". You must deliver it on " + deliveryDate.getTime() + " .");
                numberOfVehicles--;

            }
        }else{
            throw new Exception("SorryWeDontHaveThatOne");

        }
    }

    @Override
    public void loadMe(double capacity) throws Exception {
        System.out.println(" ");
    }

    public String toString(){
        return super.toString()+ " Color: "+ color+ " Number of doors: "+ numOfDoors+ " Seating capacity:"+seatingCap;

    }

    @Override
    public int getNumberOfDays(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        return super.getNumberOfDays(bYear, bMonth, bday, dYear, dMonth, dday);
    }

}
