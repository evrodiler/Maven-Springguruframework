public class CarDto {

    private String make;
    private int seatCount;

    public CarDto(String make, int seatCount) {
        this.make = make;
        this.seatCount = seatCount;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}