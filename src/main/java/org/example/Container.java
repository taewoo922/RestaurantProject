package org.example;

import org.example.dao.ArticleDao;
import org.example.dao.DistrictDao;
import org.example.dao.MemberDao;
import org.example.dao.SeoulDao;

import org.example.service.ArticleService;
import org.example.service.MemberService;
import org.example.service.DistrictService;
import org.example.service.SeoulService;

public class Container {
    public static ArticleDao articleDao;
    public static MemberDao memberDao;
    public static DistrictDao districtDao;
    public static SeoulDao seoulDao;
    public static ArticleService articleService;
    public static MemberService memberService;
    public static DistrictService districtService;
    public static SeoulService seoulService;

    static {
        districtDao = new DistrictDao();
        articleDao = new ArticleDao();
        memberDao = new MemberDao();
        seoulDao = new SeoulDao();
        articleService = new ArticleService();
        memberService = new MemberService();
        districtService = new DistrictService();
        seoulService = new SeoulService();
    }
}