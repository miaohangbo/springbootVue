package com.qf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qf.pojo.*;
/**
 * Created by 54110 on 2020/8/17.
 */
public interface UserResponsitory extends JpaRepository<User,Integer> {
}
