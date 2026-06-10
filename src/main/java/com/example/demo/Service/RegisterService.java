package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Register;
import com.example.demo.Repository.RegisterRepo;

@Service
public class RegisterService {
    @Autowired
    RegisterRepo repo;
    public List<Register> getALLDetails(){
        return repo.findAll();

    }
    public List<Register> getByVno(String vno){
        return repo.findByvNo(vno);
    }
    public List<Register> getByPnum(Long pnum){
        return repo.findBypNum(pnum);
    }
    public Register postRegister(Register reg){
        return repo.save(reg);
    }

}
