import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//generates constructors automatically
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;
}
