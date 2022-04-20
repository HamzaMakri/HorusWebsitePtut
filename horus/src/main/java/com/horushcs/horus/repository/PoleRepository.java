package com.horushcs.horus.repository;

import com.horushcs.horus.model.Pole;
import com.horushcs.horus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PoleRepository extends JpaRepository<Pole, Integer> {

   
}



