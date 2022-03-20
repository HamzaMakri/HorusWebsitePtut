package com.horushcs.horus.repository;

import com.horushcs.horus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM User WHERE email = :email AND password = :password LIMIT 1")
    User findUserByLogs(@Param("email") String email, @Param("password") String password);

}



