package org.example;

import org.example.dao.*;

import org.example.dao.Daegu.DaeguDao;
import org.example.dao.Daegu.DaeguFoodDao;
import org.example.dao.Daegu.DaeguTownDao;
import org.example.dao.Daejeon.DaejeonDao;
import org.example.dao.Daejeon.DaejeonFoodDao;
import org.example.dao.Daejeon.DaejeonTownDao;
import org.example.dao.Gyeonggi.GyeonggiDao;
import org.example.dao.Gyeonggi.GyeonggiFoodDao;
import org.example.dao.Gyeonggi.GyeonggiTownDao;
import org.example.dao.Incheon.IncheonDao;
import org.example.dao.Incheon.IncheonFoodDao;
import org.example.dao.Incheon.IncheonTownDao;
import org.example.dao.Seoul.SeoulDao;
import org.example.dao.Seoul.SeoulFoodDao;
import org.example.dao.Seoul.SeoulTownDao;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.service.*;
import org.example.service.Daegu.DaeguFoodService;
import org.example.service.Daegu.DaeguService;
import org.example.service.Daegu.DaeguTownService;
import org.example.service.Daejeon.DaejeonFoodService;
import org.example.service.Daejeon.DaejeonService;
import org.example.service.Daejeon.DaejeonTownService;
import org.example.service.Gyeonggi.GyeonggiFoodService;
import org.example.service.Gyeonggi.GyeonggiService;
import org.example.service.Gyeonggi.GyeonggiTownService;
import org.example.service.Incheon.IncheonFoodService;
import org.example.service.Incheon.IncheonService;
import org.example.service.Incheon.IncheonTownService;
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
    public static IncheonDao incheonDao;
    public static IncheonFoodDao incheonFoodDao;
    public static IncheonTownDao incheonTownDao;
    public static DaejeonDao daejeonDao;
    public static DaejeonFoodDao daejeonFoodDao;
    public static DaejeonTownDao daejeonTownDao;
    public static DaeguDao daeguDao;
    public static DaeguFoodDao daeguFoodDao;
    public static DaeguTownDao daeguTownDao;


    public static ArticleService articleService;
    public static MemberService memberService;
    public static DistrictService districtService;
    public static SeoulService seoulService;
    public static SeoulFoodService seoulFoodService;
    public static SeoulTownService seoulTownService;
    public static GyeonggiService gyeonggiService;
    public static GyeonggiFoodService gyeonggiFoodService;
    public static GyeonggiTownService gyeonggiTwonService;
    public static IncheonService incheonService;
    public static IncheonFoodService incheonFoodService;
    public static IncheonTownService incheonTownService;
    public static DaejeonService daejeonService;
    public static DaejeonFoodService daejeonFoodService;
    public static DaejeonTownService daejeonTownService;
    public static DaeguService daeguService;
    public static DaeguFoodService daeguFoodService;
    public static DaeguTownService daeguTownService;


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
        incheonDao = new IncheonDao();
        incheonFoodDao = new IncheonFoodDao();
        incheonTownDao = new IncheonTownDao();
        daejeonDao = new DaejeonDao();
        daejeonFoodDao = new DaejeonFoodDao();
        daejeonTownDao = new DaejeonTownDao();
        daeguDao = new DaeguDao();
        daeguFoodDao = new DaeguFoodDao();
        daeguTownDao = new DaeguTownDao();

        articleService = new ArticleService();
        memberService = new MemberService();
        districtService = new DistrictService();
        seoulService = new SeoulService();
        seoulFoodService = new SeoulFoodService();
        seoulTownService = new SeoulTownService();
        gyeonggiService = new GyeonggiService();
        gyeonggiFoodService = new GyeonggiFoodService();
        gyeonggiTwonService = new GyeonggiTownService();
        incheonService = new IncheonService();
        incheonFoodService = new IncheonFoodService();
        incheonTownService = new IncheonTownService();
        daejeonService = new DaejeonService();
        daejeonFoodService = new DaejeonFoodService();
        daejeonTownService = new DaejeonTownService();
        daeguService = new DaeguService();
        daeguFoodService = new DaeguFoodService();
        daeguTownService = new DaeguTownService();
    }
}