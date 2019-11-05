package lombok_examples;

import lombok.*;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@Wither
@Slf4j
public class Person implements Comparable<Person> {


    @Setter
    private String name;
    private int age;
    @NonNull
    private String gender;
    @Singular
    private Map<String, Integer> beers;

    @Singular("דג")
    private List<String> fish;

    public void doX() {
        log.info("ljdhfksjdh");
    }

    @Override
    @SneakyThrows
    public int compareTo(Person o) {
        Thread.sleep(1);
        return 12;

    }
}
