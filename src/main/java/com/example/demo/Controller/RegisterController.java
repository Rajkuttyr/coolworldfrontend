package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Register;
import com.example.demo.Service.RegisterService;



@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {org.springframework.web.bind.annotation.RequestMethod.GET, org.springframework.web.bind.annotation.RequestMethod.POST, org.springframework.web.bind.annotation.RequestMethod.PUT, org.springframework.web.bind.annotation.RequestMethod.DELETE, org.springframework.web.bind.annotation.RequestMethod.OPTIONS})
@RestController
public class RegisterController {
    @Autowired
    RegisterService regSer;

    @GetMapping("home/all")
    public List<Register> getMethodName() {
        return regSer.getALLDetails();
    }
    @GetMapping("home/pnum")
    public List<Register> getMethodName(@RequestParam(value="pnum") Long param) {
        return regSer.getByPnum(param);
    }
    @GetMapping("home/vno")
    public List<Register> getMethodName(@RequestParam(value="vno") String param) {
        return regSer.getByVno(param);
    }
    @PostMapping("home/post")
    public Register postMethodName(@RequestBody Register entity) {
        //TODO: process POST request
        
        return regSer.postRegister(entity);
    }
    
    
    
}
