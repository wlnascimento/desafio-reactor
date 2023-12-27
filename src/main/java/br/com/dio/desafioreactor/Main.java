package br.com.dio.desafioreactor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Integer qtdNumbers = random.nextInt(1000);
        List<Long> numbers = new ArrayList<>();

        for(int i = 0; i <= qtdNumbers; i++){
            numbers.add((long) i);
        }
        Question1 q1 = new Question1();
        System.out.println("LISTA: " + numbers);
        System.out.print("LISTA COM INC: ");
        q1.inc(numbers).collectList().subscribe(System.out::println);

        System.out.println("==================================================");

        Question2 q2 = new Question2();
        User user = new User(10L, "Wiliam", "wiliam@teste.com.br", "12345o", true);
        User user1 = new User(1L, "Teste 1", "teste1@teste.com.br", "1234567o", true);
        User user2 = new User(2L, "Teste 2", "teste2@teste.com.br", "1234567q", false);
        User user3 = new User(3L, "Teste 3", "teste3@teste.com.br", "1234567w", true);
        User user4 = new User(4L, "Teste 4", "teste4@teste.com.br", "1234567r", false);
        List<User> usersEmpty = new ArrayList<>();
        List<User> users = List.of(user1, user2, user3, user4);
        System.out.println(users.toString() + "\n");
        System.out.print("Qtd Admins: ");
        q2.countAdmins(users).subscribe(System.out::println);
        //q2.countAdmins(usersEmpty).subscribe();

        System.out.println("==================================================");

        Question3 q3 = new Question3();
        System.out.println("Usuario: " + user.toString());
        q3.userIsValid(user1).subscribe(System.out::println);

        System.out.println("==================================================");
    }


}
