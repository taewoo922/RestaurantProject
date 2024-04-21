package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor

public class NonMember extends Dto {
//    public int id;
//    public String regDate;
//    public String loginId;
//    public String loginPassword;
//    public String name;
    public String randommenu;
    public String foodtype;

//    public NonMember(String loginId, String loginPassword, String name, String randommenu) {
//        this.loginId = loginId;
//        this.loginPassword = loginPassword;
//        this.name = name;
//        this.randommenu= randommenu;
//    }

    public NonMember(Map<String, Object> row) {
        super(row);
//        this.loginId = (String) row.get("loginId");
//        this.loginPassword = (String) row.get("loginPassword");
//        this.name = (String) row.get("name");
        this.randommenu = (String) row.get("randommenu");
        this.foodtype = (String) row.get("foodtype");
    }
}