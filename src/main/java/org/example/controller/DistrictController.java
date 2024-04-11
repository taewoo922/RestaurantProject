package org.example.controller;

import org.example.Container;

import org.example.dto.Gyeonggi.Gyeonggi;
import org.example.dto.Gyeonggi.GyeonggiFood;
import org.example.dto.Gyeonggi.GyeonggiTown;
import org.example.dto.Seoul.Seoul;
import org.example.dto.Seoul.SeoulFood;
import org.example.dto.Seoul.SeoulTown;
import org.example.service.*;
import org.example.service.Gyeonggi.GyeonggiFoodService;
import org.example.service.Gyeonggi.GyeonggiService;
import org.example.service.Gyeonggi.GyeonggiTownService;
import org.example.service.Seoul.SeoulFoodService;
import org.example.service.Seoul.SeoulService;
import org.example.service.Seoul.SeoulTownService;
import org.example.util.Util;

import java.util.Scanner;

public class DistrictController extends Controller{
    private Scanner sc;
    private String cmd;
    private String actionMethodName;
    private MemberService memberService;
    public DistrictService districtService;
    public SeoulService seoulService;
    public SeoulFoodService seoulFoodService;

    public SeoulTownService seoulTownService;
    public GyeonggiService gyeonggiService;
    public GyeonggiFoodService gyeonggiFoodService;
    public GyeonggiTownService gyeonggiTownService;

    public DistrictController (Scanner sc) {
        this.sc = sc;

        memberService = Container.memberService;
        districtService = Container.districtService;
        seoulService = Container.seoulService;
        seoulFoodService = Container.seoulFoodService;
        seoulTownService = Container.seoulTownService;
        gyeonggiService = Container.gyeonggiService;
        gyeonggiFoodService = Container.gyeonggiFoodService;
        gyeonggiTownService = Container.gyeonggiTwonService;

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

        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "일식", "밥류(초밥,돈부리,장어덮밥,오므라이스,카레라이스,텐동),면류(우동,라멘,소바)"));
        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "중식", "면류(짜장면,짬뽕,도삭면,기스면,우육면)\n"+ "탕류(마라탕,누룽지탕,불도장,훠궈),\n" +
                "만두류(딤섬,소롱포,춘권,만터우)\n" +"요리류(탕수육,깐풍기,고추잡채,양장피,유산슬 등)"));
        Container.seoulDao.add(new Seoul(Container.seoulDao.getNewId(), Util.getNowDateStr(), "양식", "파스타, 리조또, 스테이크, 수제버거, 스튜, 라자냐, 케밥"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"국물요리" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"구이류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"볶음류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"분식" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"건강식" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"죽&비빔밥" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"찜" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"탕" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"면류", "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"탕류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"만두" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"요리류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulTownDao.add(new SeoulTown(Container.seoulTownDao.getNewId(), "국물요리" , "종로","합천돼지국밥","서울특별시 종로구 낙원동 290-1","02-742-4142"));
        Container.gyeonggiDao.add(new Gyeonggi(Container.gyeonggiDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.gyeonggiFoodDao.add(new GyeonggiFood(Container.gyeonggiFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.gyeonggiTownDao.add(new GyeonggiTown(Container.gyeonggiTownDao.getNewId(), "국물요리" , "종로","합천돼지국밥","서울특별시 종로구 낙원동 290-1","02-742-4142"));
    }

    public void showSeoul() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Seoul seoul = seoulService.getSeoulByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        seoulFood = seoul;

        System.out.printf("서울지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, seoulFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        SeoulFood seoulfood = seoulFoodService.getSeoulFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        seoulFoodType = seoulfood;
        System.out.printf("서울지역에 %s 중 원하시는 위치를 입력해주세요.\n", seoulFoodType.town);
        String resname = sc.nextLine();

        SeoulTown seoultown = seoulTownService.getSeoulTownByResname(resname);

        seoulTown = seoultown;
        System.out.println("번호 |  날짜  |  메뉴  |  지역  |   식당이름   |          주소          |    전화번호   |");
        System.out.printf("%4d | %6s | %6s | %4s | %6s | %10s | %6s\n", seoultown.id, seoultown.regDate, seoultown.food, seoultown.town, seoultown.resname, seoultown.address, seoultown.num);




    }

    private void showGyeonggi() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Gyeonggi gyeonggi = gyeonggiService.getGyeonggiByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        gyeonggiFood = gyeonggi;

        System.out.printf("서울지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, gyeonggiFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        GyeonggiFood gyeonggifood = gyeonggiFoodService.getGyeonggiFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        gyeonggiFoodType = gyeonggifood;
        System.out.printf("서울지역에 %s 중 원하시는 위치를 입력해주세요.\n", gyeonggiFoodType.town);
        String resname = sc.nextLine();

        GyeonggiTown gyeonggitown = gyeonggiTownService.getSeoulTownByResname(resname);

        gyeonggiTown = gyeonggitown;
        System.out.println("번호 |  날짜  |  메뉴  |  지역  |   식당이름   |          주소          |    전화번호   |");
        System.out.printf("%4d | %6s | %6s | %4s | %6s | %10s | %6s\n", gyeonggitown.id, gyeonggitown.regDate, gyeonggitown.food, gyeonggitown.town, gyeonggitown.resname, gyeonggitown.address, gyeonggitown.num);
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
