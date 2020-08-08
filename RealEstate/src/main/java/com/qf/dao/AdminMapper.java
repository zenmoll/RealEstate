package com.qf.dao;

import com.qf.pojo.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {
    int insert(Admin admin);
    Admin login(Admin admin);
    void addAdmin(Admin admin);
    int insertSelect(Admin admin);
}
