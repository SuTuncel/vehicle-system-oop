
package comp1112projectelifsu;


import java.util.GregorianCalendar;

public class Suv extends Car{

    private String typeWD;

    Suv(String color, int numOfDoors,int seatingCap,String plateNumber, int numberOTires, double DailyFee,String typeWD){
        super(color, numOfDoors, seatingCap, plateNumber, numberOTires, DailyFee);
        this.typeWD= typeWD;

    }

    public String getTypeWD() {
        return typeWD;
    }

    public void setTypeWD(String typeWD) { // daha sonradan ayarlanabilir belki diye koydum
        this.typeWD = typeWD;
    }

    @Override
    public double getDailyFee(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        return super.getDailyFee(bYear, bMonth, bday, dYear, dMonth, dday);
    }

    @Override
    public int getNumberOfDays(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        return super.getNumberOfDays(bYear, bMonth, bday, dYear, dMonth, dday);
    }

    @Override
    public void bookMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) throws Exception {
        super.bookMe(bYear, bMonth, bday, dYear, dMonth, dday);
    }

    @Override
    public void cancelMe(int bYear, int bMonth, int bday, int cYear, int cMonth, int cday) throws Exception{
        super.cancelMe(bYear, bMonth, bday, cYear, cMonth, cday);
    }

    @Override
    public void rentMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday,boolean company, boolean customer)
    throws Exception{
        this.bookDate= new GregorianCalendar(bYear,bMonth-1, bday);
        this.deliveryDate= new GregorianCalendar(dYear,dMonth-1,dday);

        if(numberOfVehicles>0) {
            if (company && !customer) {
                System.out.println("This option is not available for SUVs");
            } else if (!company && customer) {
                System.out.println("This option is not available for SUVs");
            } else if (company && customer) {
                System.out.println("This option is not available for SUVs");
            } else {
                System.out.println("You rented the vehicle on " + bookDate.getTime() + ". You must deliver it on " + deliveryDate.getTime() + " .");
                numberOfVehicles--;

            }
        }else{
            throw  new Exception("SorryWeDontHaveThatOne");

        }

    }

    @Override
    public void dropMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        super.dropMe(bYear, bMonth, bday, dYear, dMonth, dday);
    }

    public String toString(){

        return super.toString()+ " WD type:"+ typeWD;

    }

}
