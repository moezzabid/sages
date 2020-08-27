package org.sid.sages.dao;

import org.sid.sages.entity.users.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CompteRepository extends  JpaRepository<Compte,Long> {

}
