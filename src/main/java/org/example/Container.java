package org.example;

import org.example.dao.*;

import org.example.dto.SeoulFood;
import org.example.service.*;

public class Container {
    public static ArticleDao articleDao;
    public static MemberDao memberDao;
    public static DistrictDao districtDao;
    public static SeoulDao seoulDao;
    public static SeoulFoodDao seoulFoodDao;
    public static ArticleService articleService;
    public static MemberService memberService;
    public static DistrictService districtService;
    public static SeoulService seoulService;
    public static SeoulFoodService seoulFoodService;

    static {
        districtDao = new DistrictDao();
        articleDao = new ArticleDao();
        memberDao = new MemberDao();
        seoulDao = new SeoulDao();
        seoulFoodDao = new SeoulFoodDao();
        articleService = new ArticleService();
        memberService = new MemberService();
        districtService = new DistrictService();
        seoulService = new SeoulService();
        seoulFoodService = new SeoulFoodService();
    }
}