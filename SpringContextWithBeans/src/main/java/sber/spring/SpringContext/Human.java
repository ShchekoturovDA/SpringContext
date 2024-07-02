package sber.spring.SpringContext;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Human {
    private Parrot parrot1;
    private Parrot parrot2;
    private Cat cat;
    private Dog dog;
}
