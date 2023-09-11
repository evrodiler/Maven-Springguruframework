import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class CarMapperTest {
    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car( "Morris", 5);

        //when
        CarDto carDto = CarMapper.INSTANCE.carToCarDto( car );
        assertEquals(carDto.getMake(),"Morris");
        assertEquals(carDto.getSeatCount(),5);

    }
}
