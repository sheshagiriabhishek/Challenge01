package com.example.challenge01.Repository;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.example.challenge01.entity.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {
	
	

}
