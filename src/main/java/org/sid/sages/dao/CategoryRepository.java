package org.sid.sages.dao;

import org.sid.sages.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends  JpaRepository <Category,Long> {

}
