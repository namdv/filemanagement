package com.cap.filemanagement.repository;

import com.cap.filemanagement.entity.User;

public interface UserRepository  {
    User findByUsername(String username);
}
