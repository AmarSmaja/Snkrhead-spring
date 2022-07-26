package com.akademija.snkrhead.repos;

import com.akademija.snkrhead.entity.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {
}
