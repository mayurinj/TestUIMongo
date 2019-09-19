package com.cg.SpringMongoDBProd.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.SpringMongoDBProd.bean.Product;

@Repository
public interface ProductDao extends MongoRepository<Product, String> {

}
