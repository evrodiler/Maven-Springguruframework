import org.mapstruct.factory.Mappers;

public class Main {
    public static void main(String[] args) {

        Source source = new Source("John",30);

        myMapper INSTANCE = Mappers.getMapper( myMapper.class );

        Target target = myMapper.sourceToTarget(source);

        System.out.println("Full Name: " + target.getFullName());
        System.out.println("Years Old: " + target.getYearsOld());
    }
}
