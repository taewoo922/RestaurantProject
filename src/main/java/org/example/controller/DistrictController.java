package org.example.controller;

import org.example.Container;

import org.example.dto.Member;
import org.example.dto.Seoul;
import org.example.service.DistrictService;
import org.example.service.MemberService;
import org.example.service.SeoulService;
import org.example.util.Util;

import java.util.Scanner;

public class DistrictController extends Controller{
    private Scanner sc;
    private String cmd;
    private String actionMethodName;
    private MemberService memberService;
    public DistrictService districtService;
    public SeoulService seoulService;

    public DistrictController (Scanner sc) {
        this.sc = sc;

        memberService = Container.memberService;
        districtService = Container.districtService;
        seoulService = Container.seoulService;
    }
    public void doAction(String cmd, String actionMethodName) {
        this.cmd = cmd;
        this.actionMethodName = actionMethodName;
        switch ( actionMethodName ) {
            case "서울":
                showSeoul();
                break;
            case "경기":
                showGyeonggi();
                break;
            case "인천":
                showIncheon();
                break;
            case "수원":
                showSuwon();
                break;
            case "대전":
                showDaejeon();
                break;
            case "대구":
                showDaegu();
                break;
            case "광주":
                showGwangju();
                break;
            case "울산":
                showUlsan();
                break;
            case "부산":
                showBusan();
                break;
            case "제주":
                showJeju();
                break;
            default:
                System.out.println("존재하지 않는 명령어 입니다.");
                break;
        }
    }

    public void showSeoul() {

        String food = null;
        while ( true ) {

            System.out.println("== 메뉴 목록 ==");
            System.out.println("== 한식 ==");
            System.out.println("== 양식 ==");
            System.out.println("== 중식 ==");
            System.out.println("== 일식 ==");
            System.out.println("== 동남아 요리 ==");
            System.out.println("메뉴를 선택해 주세요");

            food = sc.nextLine();

            Seoul seoul = SeoulService.getSeoulByFood(food);
//
//            if ( isJoinabledfood(food) == false ) {
//                System.out.printf("%s 메뉴는 정보를 제공하지 않습니다.\n", food);
//                continue;
//            }
//
//            break;


        }
    }

    private void showGyeonggi() {
    }

    private void showIncheon() {
    }

    private void showSuwon() {
    }

    private void showDaejeon() {
    }

    private void showDaegu() {
    }

    private void showGwangju() {
    }

    private void showUlsan() {
    }

    private void showBusan() {
    }

    private void showJeju() {
    }


    public void makeTestData() {
        System.out.println("테스트를 위한 추천 데이터를 생성합니다.");

//        Container.districtDao.join(new Member(Container.districtDao.getNewId(), Util.getNowDateStr(), "admin", "admin", "관리자"));
//        Container.districtDao.join(new Member(Container.districtDao.getNewId(), Util.getNowDateStr(), "user1", "user1", "홍길동"));
//        Container.districtDao.join(new Member(Container.districtDao.getNewId(), Util.getNowDateStr(), "user2", "user2", "홍길순"));
    }

//    private boolean isJoinabledfood(String food) {
//        String food = seoulService.getSeoulByFood(food);
//
//        if ( food == null ) {
//            return true;
//        }
//
//        return false;
//    }
}
