package io.shaiksha.uom.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.shaiksha.uom.model.Uom;
/**
 * UomRepository.java
 * @author shaiksha
 * @version 1.0
 * @since 31/01/2019
 *
 */
@Repository
public interface UomRepository extends MongoRepository<Uom, String> {

}
