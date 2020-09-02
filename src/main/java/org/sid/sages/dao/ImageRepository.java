package org.sid.sages.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.sid.sages.entity.Image;


public interface ImageRepository extends JpaRepository<Image, Integer> {

    @Query("Select a from Image a where user_id = ?1 and document_type = ?2")

    Image checkDocumentByUserId(Integer userId, String docType);

    @Query("Select fileName from Image a where user_id = ?1 and document_type = ?2")

    String getUploadDocumnetPath(Integer userId, String docType);

}

