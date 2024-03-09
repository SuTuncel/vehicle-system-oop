
package comp1112projectelifsu;

public class StationWagon extends Car{
    private static double loadingCap=500.0;


    StationWagon(String color, int numOfDoors, int seatingCap, String plateNumber, int numberOfTires, double DailyFee) {
        super(color, numOfDoors, seatingCap, plateNumber, numberOfTires, DailyFee);

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
    public void rentMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday, boolean company, boolean customer) throws Exception {
        super.rentMe(bYear, bMonth, bday, dYear, dMonth, dday, company, customer);
    }

    @Override
    public void bookMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) throws Exception {
        super.bookMe(bYear, bMonth, bday, dYear, dMonth, dday);
    }

    @Override
    public void dropMe(int bYear, int bMonth, int bday, int dYear, int dMonth, int dday) {
        super.dropMe(bYear, bMonth, bday, dYear, dMonth, dday);
    }

    @Override
    public void cancelMe(int bYear, int bMonth, int bday, int cYear, int cMonth, int cday) throws Exception {
        super.cancelMe(bYear, bMonth, bday, cYear, cMonth, cday);
    }

    @Override
    public void loadMe(double capacity) throws Exception{
        if(capacity>loadingCap){
         throw new Exception("OverWeight");
        }
        else{
            loadingCap-=capacity;
            System.out.println("Your load is suitable for the vehicle. Capacity: "+ loadingCap+" .");

        }
    }

    public String toString(){
        return super.toString();
    }



}


