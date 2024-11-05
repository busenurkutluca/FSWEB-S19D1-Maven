package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;
import com.workintech.s18d2.entity.FruitType;

import java.util.List;

public interface FruitService {

    List<Fruit> getByPriceAsc();
    List<Fruit> getByPriceDesc();
    Fruit getById(long id);
    Fruit save(Fruit fruit);
    Fruit delete(long id);
    List<Fruit> searchByName(String name);


}
