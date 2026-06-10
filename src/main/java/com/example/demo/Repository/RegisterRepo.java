package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Register;


public interface  RegisterRepo extends MongoRepository<Register, String> {
    public List<Register> findByvNo(String vNo);
    public List<Register> findBypNum(Long pNum);

}
