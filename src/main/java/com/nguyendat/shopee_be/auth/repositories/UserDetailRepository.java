package com.nguyendat.shopee_be.auth.repositories;

import com.nguyendat.shopee_be.auth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepository extends JpaRepository<User,Long> {
    User findByEmail(String username);
    //phương thức truy vấn tùy chỉnh -> SELECT * FROM users WHERE email = ?;
}