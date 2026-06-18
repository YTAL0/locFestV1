package Entities;
import Enums.Role;

public class User {
    private String name;
    private int age;
    private Role role;
    private String password;
    private String email;
    private String number;
    private String cpf;

    public User(String name, int age, Role role, String password, String email, String number, String cpf) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.password = password;
        this.email = email;
        this.number = number;
        this.cpf = cpf;
    }
}
