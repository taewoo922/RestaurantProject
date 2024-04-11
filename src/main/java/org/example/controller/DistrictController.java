package org.example.controller;

import org.example.Container;

import org.example.dto.Member;
import org.example.dto.Seoul;
import org.example.dto.SeoulFood;
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

    public void makeTestData() {
        System.out.println("테스트를 위한 회원 데이터를 생성합니다.");

        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&amp;비빔밥,찜,탕"));
        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "일식", "밥류(초밥,돈부리,장어덮밥,오므라이스,카레라이스,텐동),면류(우동,라멘,소바)"));
        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "중식", "면류, 밥류(짜장면,짬뽕,도삭면,기스면,우육면), 탕류(마라탕,누룽지탕,불도장,훠궈),\n" +
                "만두류(딤섬,소롱포,춘권,만터우) ,요리류(탕수육,깐풍기,고추잡채,양장피,유산슬 등)"));
        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "양식", "파스타, 리조또, 스테이크, 수제버거, 스튜, 라자냐, 케밥"));
    }

    public void showSeoul() {
        System.out.println("== 메뉴 목록 ==");
        System.out.println("== 한식 ==");
        System.out.println("== 양식 ==");
        System.out.println("== 중식 ==");
        System.out.println("== 일식 ==");
        System.out.println("== 동남아 요리 ==");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Seoul seoul = seoulService.getSeoulByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        seoulFood = seoul;
        System.out.printf("서울지역에 %s(은)는 %s(이)가 있습니다.\n", food, seoulFood.foodtype);



//        Seoul seoul = SeoulService.getSeoulByFood(food);

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
