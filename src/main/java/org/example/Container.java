package org.example;

import org.example.dao.*;

import org.example.dao.Gyeonggi.GyeonggiDao;
import org.example.dao.Gyeonggi.GyeonggiFoodDao;
import org.example.dao.Gyeonggi.GyeonggiTownDao;
import org.example.dao.Seoul.SeoulDao;
import org.example.dao.Seoul.SeoulFoodDao;
import org.example.dao.Seoul.SeoulTownDao;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.service.*;
import org.example.service.Gyeonggi.GyeonggiFoodService;
import org.example.service.Gyeonggi.GyeonggiService;
import org.example.service.Gyeonggi.GyeonggiTownService;
import org.example.service.Seoul.SeoulFoodService;
import org.example.service.Seoul.SeoulService;
import org.example.service.Seoul.SeoulTownService;

public class Container {
    public static ArticleDao articleDao;
    public static MemberDao memberDao;
    public static DistrictDao districtDao;
    public static SeoulDao seoulDao;
    public static SeoulFoodDao seoulFoodDao;
    public static SeoulTownDao seoulTownDao;

    public static GyeonggiDao gyeonggiDao;
    public static GyeonggiFoodDao gyeonggiFoodDao;
    public static GyeonggiTownDao gyeonggiTownDao;
    public static ArticleService articleService;
    public static MemberService memberService;
    public static DistrictService districtService;
    public static SeoulService seoulService;
    public static SeoulFoodService seoulFoodService;
    public static SeoulTownService seoulTownService;
    public static GyeonggiService gyeonggiService;
    public static GyeonggiFoodService gyeonggiFoodService;
    public static GyeonggiTownService gyeonggiTwonService;

    static {
        districtDao = new DistrictDao();
        articleDao = new ArticleDao();
        memberDao = new MemberDao();
        seoulDao = new SeoulDao();
        seoulFoodDao = new SeoulFoodDao();
        seoulTownDao = new SeoulTownDao();
        gyeonggiDao = new GyeonggiDao();
        gyeonggiFoodDao = new GyeonggiFoodDao();
        gyeonggiTownDao = new GyeonggiTownDao();
        articleService = new ArticleService();
        memberService = new MemberService();
        districtService = new DistrictService();
        seoulService = new SeoulService();
        seoulFoodService = new SeoulFoodService();
        seoulTownService = new SeoulTownService();
        gyeonggiService = new GyeonggiService();
        gyeonggiFoodService = new GyeonggiFoodService();
        gyeonggiTwonService = new GyeonggiTownService();
    }
}