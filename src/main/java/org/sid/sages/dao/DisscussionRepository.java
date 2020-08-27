package org.sid.sages.dao;

import org.sid.sages.entity.Disscussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface DisscussionRepository extends JpaRepository <Disscussion,Long> {

}
