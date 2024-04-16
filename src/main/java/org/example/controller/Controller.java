package org.example.controller;

import org.example.dto.Busan.Busan;
import org.example.dto.Busan.BusanFood;
import org.example.dto.Busan.BusanTown;
import org.example.dto.Daegu.Daegu;
import org.example.dto.Daegu.DaeguFood;
import org.example.dto.Daegu.DaeguTown;
import org.example.dto.Daejeon.Daejeon;
import org.example.dto.Daejeon.DaejeonFood;
import org.example.dto.Daejeon.DaejeonTown;
import org.example.dto.Gwangju.Gwangju;
import org.example.dto.Gwangju.GwangjuFood;
import org.example.dto.Gwangju.GwangjuTown;
import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Incheon.Incheon;
import org.example.dto.Incheon.IncheonFood;
import org.example.dto.Incheon.IncheonTown;
import org.example.dto.Jeju.Jeju;
import org.example.dto.Jeju.JejuFood;
import org.example.dto.Jeju.JejuTown;
import org.example.dto.Member;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Seoul.SeoulFood;
import org.example.dto.Seoul.SeoulTown;
import org.example.dto.Ulsan.Ulsan;
import org.example.dto.Ulsan.UlsanFood;
import org.example.dto.Ulsan.UlsanTown;

public abstract class Controller {
    public static Seoul seoulFood;

    public static SeoulFood seoulFoodType;

    public  static SeoulTown seoulTown;
    public static Gyeonggi gyeonggiFood;

    public static GyeonggiFood gyeonggiFoodType;

    public  static GyeonggiTown gyeonggiTown;

    public static Incheon incheonFood;

    public static IncheonFood incheonFoodType;

    public  static IncheonTown incheonTown;
    public static Daejeon daejeonFood;

    public static DaejeonFood daejeonFoodType;

    public  static DaejeonTown daejeonTown;
    public static Daegu daeguFood;

    public static DaeguFood daeguFoodType;

    public  static DaeguTown daeguTown;
    public static Gwangju gwangjuFood;

    public static GwangjuFood gwangjuFoodType;

    public  static GwangjuTown gwangjuTown;
    public static Ulsan ulsanFood;
    public static UlsanFood ulsanFoodType;
    public static UlsanTown ulsanTown;
    public static Busan busanFood;
    public static BusanFood busanFoodType;
    public static BusanTown busanTown;
    public static Jeju jejuFood;
    public static JejuFood jejuFoodType;
    public static JejuTown jejuTown;


    public abstract void doAction(String cmd, String actionMethodName);
//    public abstract void makeTestData();
}