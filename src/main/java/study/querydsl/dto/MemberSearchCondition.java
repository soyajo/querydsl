package study.querydsl.dto;

import lombok.Data;

import java.util.List;

@Data
public class MemberSearchCondition {

    private String username;
    private String teamName;
    private Integer ageGoe;
    private Integer ageLoe;


}
