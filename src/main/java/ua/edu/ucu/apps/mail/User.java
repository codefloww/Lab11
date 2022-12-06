package ua.edu.ucu.apps.mail;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
@Getter
public class User {
    private String name;
    private String email;
    private Gender gender;
    private int age;
    private int id;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;
    public User(){}
    public static void main(String[] args) {
        User user = User.builder()
                .name("Paul")
                .email("pavlo.kryven@ucu.edu.ua")
                .gender(Gender.MALE)
                .age(18)
                .weight(70.0)
                .height(180.5)
                .occupation("Student")
                .occupation("Programmer")
                .build();
        System.out.println(user);
    }
}