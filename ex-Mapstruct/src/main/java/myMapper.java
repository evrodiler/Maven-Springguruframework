import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface myMapper {

    myMapper INSTANCE = Mappers.getMapper( myMapper.class );

    @Mapping(source = "name", target = "fullName")
    @Mapping(source = "age", target = "yearsOld")
    public  Target sourceToTarget(Source source);

}

