package com.shapestone.bootcamp2springboot.repostitory;

import org.springframework.data.repository.CrudRepository;

import com.shapestone.bootcamp2springboot.model.Purchases;

public interface PurchaseRepository  extends CrudRepository<Purchases, Integer> {

}
