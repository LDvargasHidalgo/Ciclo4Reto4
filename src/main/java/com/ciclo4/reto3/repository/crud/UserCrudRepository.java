package com.ciclo4.reto3.repository.crud;

import com.ciclo4.reto3.model.User;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();
//Reto 5: Listado de cumpleaños del mes
    List<User> findByMonthBirthtDay(String month);
}
