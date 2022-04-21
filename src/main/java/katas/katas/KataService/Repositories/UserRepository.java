package katas.katas.KataService.Repositories;

import katas.katas.KataService.Models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
}
