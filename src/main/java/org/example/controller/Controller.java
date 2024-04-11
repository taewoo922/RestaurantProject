package org.example.controller;

import org.example.dto.Member;
import org.example.dto.Seoul;
import org.example.dto.SeoulFood;

public abstract class Controller {
    public static Member loginedMember;
    public static Seoul seoulFood;

    public static boolean isLogined() {
        return loginedMember != null;
    }

    public abstract void doAction(String cmd, String actionMethodName);
    public abstract void makeTestData();
}