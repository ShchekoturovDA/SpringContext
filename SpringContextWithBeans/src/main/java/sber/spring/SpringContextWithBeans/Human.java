package sber.spring.SpringContext;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Human {
    private String name = "Vasil'";
    @Autowired
    private Parrot parrot1;
    @Autowired
    private Parrot parrot2;
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
}
