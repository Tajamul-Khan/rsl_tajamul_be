package com.rsl_tajamul_be.rsl_tajamul_be.Repository;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
