package com.example.demo;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String getUser(String id) {
        return repository.findUser(id);
    }
}
