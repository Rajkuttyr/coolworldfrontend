package com.example.demo.Entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "register")
public class Register {
    @Id
    String id;
    String vNo;
    Date date;
    String Cname;
    Long pNum;
    String complaint;
    Double amount;
    String remark;

}
