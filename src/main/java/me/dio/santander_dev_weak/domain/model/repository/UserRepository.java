package me.dio.santander_dev_weak.domain.model.repository;

import me.dio.santander_dev_weak.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
