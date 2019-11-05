package my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class Elf {
    @InjectRandomInt(min = 3, max = 10)
    private int power;
    @InjectRandomInt(min = 20, max = 30)
    private int speed;
}
