package com.sudhirkumar.javacodingtask.repository;

import com.sudhirkumar.javacodingtask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
