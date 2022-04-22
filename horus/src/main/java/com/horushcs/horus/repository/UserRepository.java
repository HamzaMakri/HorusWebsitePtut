package com.horushcs.horus.repository;

import com.horushcs.horus.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {




    @Query(nativeQuery = true, value = "SELECT * FROM User WHERE email = :email AND password = :password LIMIT 1")
    User findUserByLogs(@Param("email") String email, @Param("password") String password);

    Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);

    void deleteByUserId(Long id);

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE user SET first_name =:first_name, last_name =:last_name, email = :email WHERE user_id = :id ")
    void updateInfo(@Param(value = "first_name") String first_name, @Param(value = "last_name") String last_name, @Param(value = "email") String email, @Param(value = "id") Long id);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "" +
            "INSERT INTO user_role (id_role, id_user) VALUES (:id_role, :id_user)")
    void updateUserRoles(@Param("id_role") Integer id_role, @Param("id_user") Long id_user);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "" +
            "DELETE FROM user_role WHERE id_user = :id_user" )
    void resetUserRoles( @Param("id_user") Long id_user);

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE user SET password =:password WHERE user_id = :id ")
    void updateUserPswd( @Param("id") Long id_user, @Param("password") String password );


}



