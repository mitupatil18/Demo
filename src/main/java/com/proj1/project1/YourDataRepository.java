package com.proj1.project1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YourDataRepository extends JpaRepository<YourDataEntity, Long> {
    // Custom queries or methods can be added here if needed
}
