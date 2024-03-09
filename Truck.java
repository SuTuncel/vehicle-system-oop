
package comp1112projectelifsu;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Truck extends Vehicle{

    private static double loadingCAP=2000.0;
    private Calendar rentedDate;


    Truck(String plateNumber,int numberOfTires,double dailyFee){
        super(plateNumber,numberOfTires,dailyFee);
        rentedDate= new GregorianCalendar();
    }

    public Calendar getRentedDate() {
        return rentedDate;
    }


    @Override
    public int getNumberOfDays(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        return super.getNumberOfDays(bYear, bMonth, bday, dYear, dMonth, dday);
    }


    @Override
    public double getDailyFee(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        return super.getDailyFee(bYear, bMonth, bday, dYear, dMonth, dday);
    }

    @Override
    public void bookMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) throws Exception {
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        this.deliveryDate= new GregorianCalendar(dYear,dMonth-1,dday);
        rentedDate= new GregorianCalendar();

        Date rentedD= rentedDate.getTime();
        Date bookD= bookDate.getTime();

        int days = (int)((bookD.getTime()-rentedD.getTime()) /(1000*60*60*24))%365;
        if(days>7){
            if(numberOfVehicles==0){
               throw new Exception("SorryWeDontHaveThatOne");

            }
            System.out.println("You booked the vehicle between "+ bookDate.getTime()+ " and "+ deliveryDate.getTime()+" .");
            numberOfVehicles--;

        }
        else{
            System.out.println("You have to book the truck at least 7 days in advance.");

        }

    }


    @Override
    public void dropMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        System.out.println("Number of days you rent: "+getNumberOfDays( bYear,  bMonth, bday, dYear, dMonth, dday)+
                " and your total price: $"+getDailyFee( bYear, bMonth, bday, dYear,  dMonth, dday)+" .");
        numberOfVehicles++;
    }


    @Override
    public void rentMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday,boolean company, boolean customer) throws Exception {
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        this.deliveryDate= new GregorianCalendar(dYear,dMonth-1,dday);
        rentedDate= new GregorianCalendar();

        Date rentedD= rentedDate.getTime();
        Date bookD= bookDate.getTime();

        int days = (int)((bookD.getTime()-rentedD.getTime()) /(1000*60*60*24))%365;

        if(days>7){
            if(numberOfVehicles>0) {
                if (company && !customer) {
                    System.out.println("This option is not available for Trucks");

                } else if (!company && customer) {
                    System.out.println("This option is not available for Trucks");
                } else if (company && customer) {
                    System.out.println("This option is not available for Trucks");
                } else {
                    System.out.println("You rented the vehicle on " + bookDate.getTime() + ". You must deliver it on " + deliveryDate.getTime() + " .");
                    numberOfVehicles--;

                }
            }else{
                throw  new Exception("SorryWeDontHaveThatOne");

            }
        }else{
            System.out.println("You have to book the truck at least 7 days in advance.");

        }

    }


    @Override
    public void cancelMe(int bYear, int bMonth, int bday,int cYear, int cMonth, int cday) throws Exception {
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        Calendar cancelDate= new GregorianCalendar(cYear,cMonth-1,cday);

        if(cancelDate.compareTo(bookDate)>0){
            throw  new Exception("NoCancellationYouMustPay");
        }
        else{
            System.out.println("Your book is canceled");
            numberOfVehicles++;
        }

    }


    @Override
    public void loadMe(double capacity) throws Exception {
        if(capacity>loadingCAP){
           throw  new Exception("OverWeight");
        }
        else{
            loadingCAP-=capacity;
            System.out.println("Your load is suitable for the vehicle. Capacity: "+ loadingCAP+" .");

        }

    }

    public String toString(){
        return super.toString();

    }



}



