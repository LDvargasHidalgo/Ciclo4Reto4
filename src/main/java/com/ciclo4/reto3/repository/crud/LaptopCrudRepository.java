package com.ciclo4.reto3.repository.crud;

import com.ciclo4.reto3.model.Laptop;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.Query;

public interface LaptopCrudRepository extends MongoRepository<Laptop, Integer> {

    //Para seleccionar el producto con id maximo // Para que en el front el id se cree solo
    Optional<Laptop> findTopByOrderByIdDesc();
    //Reto 5
    public List<Laptop> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Laptop> findByDescriptionLike(String description);

}
