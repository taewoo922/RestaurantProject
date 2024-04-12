package org.example.controller;

import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Incheon.Incheon;
import org.example.dto.Incheon.IncheonFood;
import org.example.dto.Incheon.IncheonTown;
import org.example.dto.Member;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Seoul.SeoulFood;
import org.example.dto.Seoul.SeoulTown;

public abstract class Controller {
    public static Member loginedMember;
    public static Seoul seoulFood;

    public static SeoulFood seoulFoodType;

    public  static SeoulTown seoulTown;
    public static Gyeonggi gyeonggiFood;

    public static GyeonggiFood gyeonggiFoodType;

    public  static GyeonggiTown gyeonggiTown;

    public static Incheon incheonFood;

    public static IncheonFood incheonFoodType;

    public  static IncheonTown incheonTown;
    public static boolean isLogined() {
        return loginedMember != null;
    }

    public abstract void doAction(String cmd, String actionMethodName);
    public abstract void makeTestData();
}