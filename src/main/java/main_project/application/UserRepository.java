package main_project.application;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{

    List<User> findByName(String name);

    //List<User> findByAgeGreaterThan(int age);

    User findByEmail(String email);

    List<User> findByNameContaining(String keyword);

    //List<User> findByNameContainingPart(String namePart);

    //List<User> findByAgeBetween(int startAge, int endAge);

    //@Query("SELECT u FROM User u WHERE u.age > ?1")
    //List<User> findUsersOlderThan(int age);

    @Query(value = "SELECT * FROM users WHERE email = ?1", nativeQuery= true)
    User findByEmailNative(String email);

}