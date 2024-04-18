package org.example.controller;

import org.example.container.Container;
import org.example.dto.Article;
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
import org.example.service.Busan.BusanFoodService;
import org.example.service.Busan.BusanService;
import org.example.service.Busan.BusanTownService;
import org.example.service.Daegu.DaeguFoodService;
import org.example.service.Daegu.DaeguService;
import org.example.service.Daegu.DaeguTownService;
import org.example.service.Daejeon.DaejeonFoodService;
import org.example.service.Daejeon.DaejeonService;
import org.example.service.Daejeon.DaejeonTownService;
import org.example.service.DistrictService;
import org.example.service.Gwangju.GwangjuFoodService;
import org.example.service.Gwangju.GwangjuService;
import org.example.service.Gwangju.GwangjuTownService;
import org.example.service.Gyeonggi.GyeonggiFoodService;
import org.example.service.Gyeonggi.GyeonggiService;
import org.example.service.Gyeonggi.GyeonggiTownService;
import org.example.service.Incheon.IncheonFoodService;
import org.example.service.Incheon.IncheonService;
import org.example.service.Incheon.IncheonTownService;
import org.example.service.Jeju.JejuFoodService;
import org.example.service.Jeju.JejuService;
import org.example.service.Jeju.JejuTownService;
import org.example.service.MemberService;
import org.example.service.Seoul.SeoulFoodService;
import org.example.service.Seoul.SeoulService;
import org.example.service.Seoul.SeoulTownService;
import org.example.service.Ulsan.UlsanFoodService;
import org.example.service.Ulsan.UlsanService;
import org.example.service.Ulsan.UlsanTownService;
import org.example.util.Util;


import java.util.List;
import java.util.Scanner;

public class DistrictController extends Controller{
    private Scanner sc;
    private String cmd;
    private String actionMethodName;
    private MemberService memberService;
    private Session session;
    public DistrictService districtService;
    public SeoulService seoulService;
    public SeoulFoodService seoulFoodService;

    public SeoulTownService seoulTownService;
    public GyeonggiService gyeonggiService;
    public GyeonggiFoodService gyeonggiFoodService;
    public GyeonggiTownService gyeonggiTownService;
    public IncheonService incheonService;
    public IncheonFoodService incheonFoodService;
    public IncheonTownService incheonTownService;
    public DaejeonService daejeonService;
    public DaejeonFoodService daejeonFoodService;
    public DaejeonTownService daejeonTownService;
    public DaeguService daeguService;
    public DaeguFoodService daeguFoodService;
    public DaeguTownService daeguTownService;
    public GwangjuService gwangjuService;
    public GwangjuFoodService gwangjuFoodService;
    public GwangjuTownService gwangjuTownService;
    public UlsanService ulsanService;
    public UlsanFoodService ulsanFoodService;
    public UlsanTownService ulsanTownService;
    public BusanService busanService;
    public BusanFoodService busanFoodService;
    public BusanTownService busanTownService;
    public JejuService jejuService;
    public JejuFoodService jejuFoodService;
    public JejuTownService jejuTownService;

    public DistrictController () {
        sc = Container.getScanner();
        session = Container.getSession();

        memberService = Container.memberService;
        districtService = Container.districtService;
        seoulService = Container.seoulService;
        seoulFoodService = Container.seoulFoodService;
        seoulTownService = Container.seoulTownService;
        gyeonggiService = Container.gyeonggiService;
        gyeonggiFoodService = Container.gyeonggiFoodService;
        gyeonggiTownService = Container.gyeonggiTwonService;
        incheonService = Container.incheonService;
        incheonFoodService = Container.incheonFoodService;
        incheonTownService = Container.incheonTownService;
        daejeonService = Container.daejeonService;
        daejeonFoodService = Container.daejeonFoodService;
        daejeonTownService = Container.daejeonTownService;
        daeguService = Container.daeguService;
        daeguFoodService = Container.daeguFoodService;
        daeguTownService = Container.daeguTownService;
        gwangjuService = Container.gwangjuService;
        gwangjuFoodService = Container.gwangjuFoodService;
        gwangjuTownService = Container.gwangjuTownService;
        ulsanService = Container.ulsanService;
        ulsanFoodService = Container.ulsanFoodService;
        ulsanTownService = Container.ulsanTownService;
        busanService = Container.busanService;
        busanFoodService = Container.busanFoodService;
        busanTownService = Container.busanTownService;
        jejuService = Container.jejuService;
        jejuFoodService = Container.jejuFoodService;
        jejuTownService = Container.jejuTownService;

    }
    public void doAction(String cmd, String actionMethodName) {
        this.cmd = cmd;

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
            case "맛집추가":
                addseoultown();
                break;
            default:
                System.out.println("존재하지 않는 명령어 입니다.");
                break;
        }
    }

    private void showSeoul() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Seoul seoul = seoulService.getSeoulByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

//        Member loginedMember = session.getLoginedMember();

//        if ( foundArticle.memberId != loginedMember.id ) {
//            System.out.printf("권한이 없습니다.\n");
//            return;
//        }

        System.out.printf("서울지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, seoul.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        SeoulFood seoulfood = seoulFoodService.getSeoulFoodByFoodType(foodtype);
        if ( seoulfood == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }


        System.out.printf("서울지역에 %s 중 원하시는 위치를 입력해주세요.\n", seoulfood.town);
        String town = sc.nextLine();

        List<SeoulTown> printseoultown = seoulTownService.getSeoulTownByResname(foodtype, town);

        System.out.println(" 번호 |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호    ");
        for ( int i = printseoultown.size() - 1; i >= 0 ; i-- ) {
            SeoulTown seoultown = printseoultown.get(i);

            System.out.printf(" %4d | %4s  | %4s | %10s | %6s | %4s\n", seoultown.id, seoultown.foodtype, seoultown.town, seoultown.resname, seoultown.address, seoultown.num);
        }
    }

    private void showGyeonggi() {
        System.out.println("== 메뉴목록 ==\n" + "==   한식   ==\n" + "==   양식   ==\n" + "==   중식   ==\n" + "==   일식   ==\n" + "==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Gyeonggi gyeonggi = gyeonggiService.getGyeonggiByFood(food);
        if (food == null) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return;
        }

        System.out.printf("경기지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, gyeonggi.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        GyeonggiFood gyeonggifood = gyeonggiFoodService.getGyeonggiFoodByFoodType(foodtype);
        if (gyeonggifood == null) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return;
        }

        System.out.printf("경기지역에 %s 중 원하시는 위치를 입력해주세요.\n", gyeonggifood.town);
        String town = sc.nextLine();

        List<GyeonggiTown> printgyeonggitown = gyeonggiTownService.getGyeonggiTownByResname(foodtype, town);
        if (printgyeonggitown == null) {
            System.out.println("해당지역은 지원하지 않습니다.");
            return;
        }


        System.out.println(" 번호 |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호    ");

        for (int i = printgyeonggitown.size() - 1; i >= 0; i--) {
            GyeonggiTown gyeonggitown = printgyeonggitown.get(i);

            System.out.printf(" %4d | %4s  | %4s | %10s | %6s | %4s\n", gyeonggitown.id, gyeonggitown.regDate, gyeonggitown.food, gyeonggitown.town, gyeonggitown.resname, gyeonggitown.address, gyeonggitown.num);

        }
    }
    private void showIncheon() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Incheon incheon = incheonService.getIncheonByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }


        System.out.printf("인천지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, incheon.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        IncheonFood incheonFood = incheonFoodService.getIncheonFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        System.out.printf("인천지역에 %s 중 원하시는 위치를 입력해주세요.\n", incheonFood.town);
        String town = sc.nextLine();

        List<IncheonTown> printincheontown = incheonTownService.getIncheonTownByResname(foodtype, town);
        if (printincheontown == null) {
            System.out.println("해당지역은 지원하지 않습니다.");
            return;
        }

        System.out.println(" 번호 |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호    ");


        for (int i = printincheontown.size() - 1; i >= 0; i--) {
            IncheonTown incheontown = printincheontown.get(i);

            System.out.printf(" %4d | %4s  | %4s | %10s | %6s | %4s\n", incheontown.id, incheontown.regDate, incheontown.food, incheontown.town, incheontown.resname, incheontown.address, incheontown.num);

        }
    }

    private void showDaejeon() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Daejeon daejeon = daejeonService.getDaejeonByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        System.out.printf("대전지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, daejeon.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        DaejeonFood daejeonFood = daejeonFoodService.getDaejeonFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        System.out.printf("대전지역에 %s 중 원하시는 위치를 입력해주세요.\n", daejeonFood.town);
        String town = sc.nextLine();

        List<DaejeonTown> printdaejeontown = daejeonTownService.getDaejeonTownByResname(foodtype, town);
        if (printdaejeontown == null) {
            System.out.println("해당지역은 지원하지 않습니다.");
            return;
        }

        System.out.println(" 번호 |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호    ");


        for (int i = printdaejeontown.size() - 1; i >= 0; i--) {
            DaejeonTown daejeontown = printdaejeontown.get(i);

            System.out.printf(" %4d | %4s  | %4s | %10s | %6s | %4s\n", daejeontown.id, daejeontown.regDate, daejeontown.food, daejeontown.town, daejeontown.resname, daejeontown.address, daejeontown.num);

        }
    }

    private void showDaegu() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Daegu daegu = daeguService.getDaeguByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        System.out.printf("대구지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, daegu.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        DaeguFood daeguFood = daeguFoodService.getDaeguFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        System.out.printf("대구지역에 %s 중 원하시는 위치를 입력해주세요.\n", daeguFood.town);
        String town = sc.nextLine();

        List<DaeguTown> printdaegutown = daeguTownService.getDaeguTownByResname(foodtype, town);
        if (printdaegutown == null) {
            System.out.println("해당지역은 지원하지 않습니다.");
            return;
        }

        System.out.println(" 번호 |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호    ");


        for (int i = printdaegutown.size() - 1; i >= 0; i--) {
            DaeguTown daegutown = printdaegutown.get(i);

            System.out.printf(" %4d | %4s  | %4s | %10s | %6s | %4s\n", daegutown.id, daegutown.regDate, daegutown.food, daegutown.town, daegutown.resname, daegutown.address, daegutown.num);

        }
    }

    private void showGwangju() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Gwangju gwangju = gwangjuService.getGwangjuByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        System.out.printf("광주지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, gwangju.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        GwangjuFood gwangjuFood = gwangjuFoodService.getGwangjuFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        System.out.printf("광주지역에 %s 중 원하시는 위치를 입력해주세요.\n", gwangjuFood.town);
        String town = sc.nextLine();

        List<GwangjuTown> printgwangjutown = gwangjuTownService.getGwangjuTownByResname(foodtype, town);
        if (printgwangjutown == null) {
            System.out.println("해당지역은 지원하지 않습니다.");
            return;
        }

        System.out.println(" 번호 |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호    ");


        for (int i = printgwangjutown.size() - 1; i >= 0; i--) {
            GwangjuTown gwangjutown = printgwangjutown.get(i);

            System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", gwangjutown.id, gwangjutown.regDate, gwangjutown.food, gwangjutown.town, gwangjutown.resname, gwangjutown.address, gwangjutown.num);

        }
    }

    private void showUlsan() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Ulsan ulsan = ulsanService.getUlsanByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        ulsanFood = ulsan;

        System.out.printf("울산지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, ulsanFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        UlsanFood ulsanFood = ulsanFoodService.getUlsanFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        ulsanFoodType = ulsanFood;
        System.out.printf("울산지역에 %s 중 원하시는 위치를 입력해주세요.\n", ulsanFoodType.town);
        String resname = sc.nextLine();

        UlsanTown ulsantown = ulsanTownService.getUlsanTownByResname(resname);

        ulsanTown = ulsantown;
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", ulsantown.id, ulsantown.regDate, ulsantown.food, ulsantown.town, ulsantown.resname, ulsantown.address, ulsantown.num);
    }

    private void showBusan() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Busan busan = busanService.getBusanByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        busanFood = busan;

        System.out.printf("부산지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, busanFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        BusanFood busanFood = busanFoodService.getBusanFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        busanFoodType = busanFood;
        System.out.printf("부산지역에 %s 중 원하시는 위치를 입력해주세요.\n", busanFoodType.town);
        String resname = sc.nextLine();

        BusanTown busantown = busanTownService.getBusanTownByResname(resname);

        busanTown = busantown;
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", busantown.id, busantown.regDate, busantown.food, busantown.town, busantown.resname, busantown.address, busantown.num);
    }

    private void showJeju() {
        System.out.println("== 메뉴목록 ==\n"+"==   한식   ==\n"+"==   양식   ==\n"+"==   중식   ==\n"+"==   일식   ==\n"+"==  동남아  ==\n");
        System.out.printf("메뉴를 선택해 주세요\n");
        String food = sc.nextLine();

        Jeju jeju = jejuService.getJejuByFood(food);
        if ( food == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        jejuFood = jeju;

        System.out.printf("제주지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, jejuFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        JejuFood jejuFood = jejuFoodService.getJejuFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        jejuFoodType = jejuFood;
        System.out.printf("제주지역에 %s 중 원하시는 위치를 입력해주세요.\n", jejuFoodType.town);
        String resname = sc.nextLine();

        JejuTown jejutown = jejuTownService.getJejuTownByResname(resname);

        jejuTown = jejutown;
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", jejutown.id, jejutown.regDate, jejutown.food, jejutown.town, jejutown.resname, jejutown.address, jejutown.num);
    }

    private void addseoultown() {
        System.out.printf("음식종류 : ");
        String foodtype = sc.nextLine();
        System.out.printf("지역 : ");
        String town = sc.nextLine();
        System.out.printf("식당이름 : ");
        String resname = sc.nextLine();
        System.out.printf("주소 : ");
        String address = sc.nextLine();
        System.out.printf("전화번호 : ");
        String num = sc.nextLine();

        int id = Container.seoulTownDao.getNewId();
//        int memberId = session.getLoginedMember().getId();
        int boardId = session.getCurrentBoard().getId();
        //id는 새로 생성되는것이니까 안넣어도 된다. java랑 sql에서모두 제거
        int newId = seoulTownService.add( id, foodtype, town, resname, address, num, boardId);

        System.out.printf("%d번 게시물이 생성되었습니다.\n", newId);
    }


}
