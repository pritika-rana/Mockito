package com.example.LearnMockito.Repository;

import com.example.LearnMockito.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByAddress(String address);
}
