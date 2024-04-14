package org.example.controller;

import org.example.Container;
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
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"구이류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"볶음류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"분식" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"건강식" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"죽&비빔밥" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"찜" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"탕" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"면류", "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"탕류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"만두" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
//        Container.seoulFoodDao.add(new SeoulFood(Container.seoulFoodDao.getNewId(), Util.getNowDateStr(),"요리류" , "종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서"));
        Container.seoulTownDao.add(new SeoulTown(Container.seoulTownDao.getNewId(), "국물요리" , "종로","합천돼지국밥","서울특별시 종로구 낙원동 290-1","02-742-4142"));

        Container.gyeonggiDao.add(new Gyeonggi(Container.gyeonggiDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.gyeonggiFoodDao.add(new GyeonggiFood(Container.gyeonggiFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천"));
        Container.gyeonggiTownDao.add(new GyeonggiTown(Container.gyeonggiTownDao.getNewId(), "국물요리" , "고양","정돈 도마수육 순대국","경기 고양시 일산서구 호수로856번길 73-14 1층","031-925-7772"));

        Container.incheonDao.add(new Incheon(Container.incheonDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.incheonFoodDao.add(new IncheonFood(Container.incheonFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구"));
        Container.incheonTownDao.add(new IncheonTown(Container.incheonTownDao.getNewId(), "국물요리" , "중구","기와집 굴 대구","인천 중구 운중로21번길 21 1층","032-752-7076"));

        Container.daejeonDao.add(new Daejeon(Container.daejeonDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.daejeonFoodDao.add(new DaejeonFood(Container.daejeonFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "중구,동구,서구,대덕구,유성구"));
        Container.daejeonTownDao.add(new DaejeonTown(Container.daejeonTownDao.getNewId(), "국물요리" , "중구","태평소국밥","대전 중구 태평로 116","042-522-5757"));

        Container.daeguDao.add(new Daegu(Container.daeguDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.daeguFoodDao.add(new DaeguFood(Container.daeguFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "중구,동구,서구,남구,북구,달서구,달성군,수성구"));
        Container.daeguTownDao.add(new DaeguTown(Container.daeguTownDao.getNewId(), "국물요리" , "중구","마산식당","대구 중구 경상감영길 101 중앙상가","053-253-6304"));

        Container.gwangjuDao.add(new Gwangju(Container.gwangjuDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.gwangjuFoodDao.add(new GwangjuFood(Container.gwangjuFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "동구,서구,남구,북구,광산구"));
        Container.gwangjuTownDao.add(new GwangjuTown(Container.gwangjuTownDao.getNewId(), "국물요리" , "동구","나주식당","광주 동구 동계천로53번길 2","062-224-6943"));

        Container.ulsanDao.add(new Ulsan(Container.ulsanDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.ulsanFoodDao.add(new UlsanFood(Container.ulsanFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "동구,중구,남구,북구,울주군"));
        Container.ulsanTownDao.add(new UlsanTown(Container.ulsanTownDao.getNewId(), "국물요리" , "동구","속초순대국","울산 동구 명덕4길 10 2층","0507-1435-2361"));

        Container.busanDao.add(new Busan(Container.busanDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.busanFoodDao.add(new BusanFood(Container.busanFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구"));
        Container.busanTownDao.add(new BusanTown(Container.busanTownDao.getNewId(), "국물요리" , "동구","속초순대국","울산 동구 명덕4길 10 2층","0507-1435-2361"));

        Container.jejuDao.add(new Jeju(Container.jejuDao.getNewId(), Util.getNowDateStr(), "한식", "국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕"));
        Container.jejuFoodDao.add(new JejuFood(Container.jejuFoodDao.getNewId(), Util.getNowDateStr(), "국물요리", "제주시,서귀포시"));
        Container.jejuTownDao.add(new JejuTown(Container.jejuTownDao.getNewId(), "국물요리" , "제주시","김재훈고사리육개장","제주 제주시 구남로2길 19 김재훈고사리육개장","0507-1301-2601"));

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
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", seoultown.id, seoultown.regDate, seoultown.food, seoultown.town, seoultown.resname, seoultown.address, seoultown.num);

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

        System.out.printf("경기지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, gyeonggiFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        GyeonggiFood gyeonggifood = gyeonggiFoodService.getGyeonggiFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        gyeonggiFoodType = gyeonggifood;
        System.out.printf("경기지역에 %s 중 원하시는 위치를 입력해주세요.\n", gyeonggiFoodType.town);
        String resname = sc.nextLine();

        GyeonggiTown gyeonggitown = gyeonggiTownService.getGyeonggiTownByResname(resname);

        gyeonggiTown = gyeonggitown;
        System.out.println("번호 |  날짜  |  메뉴  |  지역  |   식당이름   |          주소          |    전화번호   |");
        System.out.printf("%4d | %6s | %6s | %4s | %6s | %10s | %6s\n", gyeonggitown.id, gyeonggitown.regDate, gyeonggitown.food, gyeonggitown.town, gyeonggitown.resname, gyeonggitown.address, gyeonggitown.num);
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

        incheonFood = incheon;

        System.out.printf("인천지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, incheonFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        IncheonFood incheonFood = incheonFoodService.getIncheonFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        incheonFoodType = incheonFood;
        System.out.printf("인천지역에 %s 중 원하시는 위치를 입력해주세요.\n", incheonFoodType.town);
        String resname = sc.nextLine();

        IncheonTown incheontown = incheonTownService.getIncheonTownByResname(resname);

        incheonTown = incheontown;
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", incheontown.id, incheontown.regDate, incheontown.food, incheontown.town, incheontown.resname, incheontown.address, incheontown.num);

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

        daejeonFood = daejeon;

        System.out.printf("대전지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, daejeonFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        DaejeonFood daejeonFood = daejeonFoodService.getDaejeonFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        daejeonFoodType = daejeonFood;
        System.out.printf("대전지역에 %s 중 원하시는 위치를 입력해주세요.\n", daejeonFoodType.town);
        String resname = sc.nextLine();

        DaejeonTown daejeontown = daejeonTownService.getDaejeonTownByResname(resname);

        daejeonTown = daejeontown;
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", daejeontown.id, daejeontown.regDate, daejeontown.food, daejeontown.town, daejeontown.resname, daejeontown.address, daejeontown.num);
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

        daeguFood = daegu;

        System.out.printf("대구지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, daeguFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        DaeguFood daeguFood = daeguFoodService.getDaeguFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        daeguFoodType = daeguFood;
        System.out.printf("대구지역에 %s 중 원하시는 위치를 입력해주세요.\n", daeguFoodType.town);
        String resname = sc.nextLine();

        DaeguTown daegutown = daeguTownService.getDaeguTownByResname(resname);

        daeguTown = daegutown;
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", daegutown.id, daegutown.regDate, daegutown.food, daegutown.town, daegutown.resname, daegutown.address, daegutown.num);
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

        gwangjuFood = gwangju;

        System.out.printf("광주지역에 %s(은)는 \n%s(이)가 있습니다.\n", food, gwangjuFood.foodtype);
        System.out.printf("원하시는 종류를 입력해주세요.\n");
        String foodtype = sc.nextLine();

        GwangjuFood gwangjuFood = gwangjuFoodService.getGwangjuFoodByFoodType(foodtype);
        if ( foodtype == null ) {
            System.out.println("해당메뉴는 존재하지 않습니다.");
            return ;
        }

        gwangjuFoodType = gwangjuFood;
        System.out.printf("광주지역에 %s 중 원하시는 위치를 입력해주세요.\n", gwangjuFoodType.town);
        String resname = sc.nextLine();

        GwangjuTown gwangjutown = gwangjuTownService.getGwangjuTownByResname(resname);

        gwangjuTown = gwangjutown;
        System.out.println("번호 |  날짜  |   메뉴   |  지역  |   식당이름   |              주소              |    전화번호   ");
        System.out.printf("%4d | %6s | %4s | %3s  | %6s | %10s | %6s \n", gwangjutown.id, gwangjutown.regDate, gwangjutown.food, gwangjutown.town, gwangjutown.resname, gwangjutown.address, gwangjutown.num);
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

}
