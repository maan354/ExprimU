package org.com.fr.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.com.fr.entity.Roles;
public interface RolesRepository extends JpaRepository<Roles, Long> {
}