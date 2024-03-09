
package comp1112projectelifsu;

public class Sports extends Car{
    private int horsePower;


    Sports(String color, int numOfDoors, int seatingCap, String plateNumber, int numberOfTires, double DailyFee,int horsePower) {
        super(color, numOfDoors, seatingCap, plateNumber, numberOfTires, DailyFee);
        this.horsePower= horsePower;

    }

    public int getHorsePower() {
        return horsePower;
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
        super.bookMe(bYear, bMonth, bday, dYear, dMonth, dday) ;
    }

    @Override
    public void cancelMe(int bYear, int bMonth, int bday, int cYear, int cMonth, int cday) throws Exception {
        super.cancelMe(bYear, bMonth, bday, cYear, cMonth, cday);
    }

    @Override
    public void rentMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday, boolean company, boolean customer) throws Exception{
        super.rentMe(bYear, bMonth, bday, dYear, dMonth, dday, company, customer);
    }


    @Override
    public void dropMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        super.dropMe(bYear, bMonth, bday, dYear, dMonth, dday);
    }



    public String toString(){
        return super.toString()+ "HP: "+horsePower;
    }



}





