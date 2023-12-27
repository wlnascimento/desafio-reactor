package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        return Flux.fromIterable(users)
                .switchIfEmpty(Mono.defer(() -> Mono.error(new Exception("Lista está vazia"))))
                .filter(User::isAdmin)
                .count();
    }

}
