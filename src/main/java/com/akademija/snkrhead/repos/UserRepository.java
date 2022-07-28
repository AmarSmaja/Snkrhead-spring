package com.akademija.snkrhead.repos;

import com.akademija.snkrhead.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
