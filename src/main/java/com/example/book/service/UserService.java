package com.example.book.service;

import com.example.book.model.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO create(UserDTO dto);
    UserDTO getById(Long id);
    List<UserDTO> getAll();
}
