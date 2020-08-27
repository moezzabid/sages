package org.sid.sages.dao;

import org.sid.sages.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProduitRepository extends  JpaRepository <Produit, Long> {

}
