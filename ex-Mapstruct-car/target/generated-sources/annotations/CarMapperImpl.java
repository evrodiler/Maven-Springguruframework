
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-11T15:58:31+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.20.1 (Amazon.com Inc.)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto carToCarDto(Car car) {
        if ( car == null ) {
            return null;
        }

        int seatCount = 0;
        String make = null;

        seatCount = car.getNumberOfSeats();
        make = car.getMake();

        CarDto carDto = new CarDto( make, seatCount );

        return carDto;
    }
}
