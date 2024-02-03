package com.proj1.project1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YourDataRepository extends JpaRepository<YourDataEntity, Long> {

}
