package com.horushcs.horus.repository;

import java.util.List;
import java.util.Optional;

import com.horushcs.horus.model.Permission;
import com.horushcs.horus.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.horushcs.horus.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);

    @Query(nativeQuery = true, value =
            " SELECT p.name " +
            " FROM Permission p" +
            " INNER JOIN role_permission rp on rp.id_role = p.permission_id " +
            " INNER JOIN Role r on p.permission_id = r.role_id " +
            " WHERE r.name =:name")
    List<String> getPermissions(@Param("name") String name);


}