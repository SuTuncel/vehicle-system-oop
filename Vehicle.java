package comp1112projectelifsu;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Vehicle implements Bookable,Rentable {

    protected String plateNumber; // plaka
    protected int numberOfTires; // lastik sayısı
    protected double DailyFee; // günlük ücreti
    protected static int numberOfVehicles=100; // şirketteki araç sayısı
    protected Calendar bookDate; // kiralama tarihi
    protected Calendar deliveryDate; // teslim tarihi


    Vehicle(String plateNumber, int numberOfTires, double DailyFee){
        this.plateNumber= plateNumber;
        this.numberOfTires= numberOfTires;
        this.DailyFee= DailyFee;

    }

    public int getNumberOfDays(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        this.deliveryDate= new GregorianCalendar(dYear,dMonth-1,dday);
        Date bookD= bookDate.getTime();
        Date deliveryD= deliveryDate.getTime();

        return (int)((deliveryD.getTime()- bookD.getTime())/(1000*60*60*24))%365;

    }


    public double getDailyFee(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        return DailyFee*getNumberOfDays( bYear,bMonth,bday,dYear,dMonth,dday);
    }

    public String getPlateNumber(){
        return this.plateNumber;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public Calendar getBookDate() {
        return bookDate;
    }

    public Calendar getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public abstract void bookMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) throws Exception;

    public abstract void cancelMe(int bYear, int bMonth, int bday,int cYear, int cMonth, int cday)  throws Exception;

    @Override
    public abstract void rentMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday,boolean company, boolean customer) throws Exception;

    public abstract void dropMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday);

    public abstract void loadMe(double capacity) throws Exception;

    @Override
    public String toString(){
        return "Plate Number: "+ plateNumber+ " Number of tires: "+numberOfTires+ " Daily Fee:"+DailyFee;

    }


    public boolean equals(Object o){

        if(o instanceof Vehicle){
            Vehicle v= (Vehicle)o;

            if(this.plateNumber.equals(v.plateNumber))
                return true;

        }

        return false;

    }


}
