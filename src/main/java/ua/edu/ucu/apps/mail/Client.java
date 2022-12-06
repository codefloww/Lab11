package ua.edu.ucu.apps.mail;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Client extends User {
    private static int counter = 0;

    public static void main(String[] args) {
        Client client = (Client)User.builder()
                .name("Paul")
                .email("pavlo.kryven@ucu.edu.ua")
                .gender(Gender.MALE)
                .age(18)
                .id(counter++)
                .build();
        System.out.println(client);
    }
}
