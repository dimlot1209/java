/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.btl.repository;

import com.btl.pojo.User;
import java.util.List;

/**
 *
 * @author Lọt
 */
public interface UserRepository {
    boolean addUser(User user);
    List<User> getUsers(String username);
}
