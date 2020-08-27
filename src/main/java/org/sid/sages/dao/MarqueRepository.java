package org.sid.sages.dao;

import org.sid.sages.entity.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MarqueRepository extends JpaRepository <Marque,Long>{

}
