package com.encurtador.url.repository;

import com.encurtador.url.model.EncurtadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncurtadorRepository extends JpaRepository<EncurtadorEntity, Long> {

}
