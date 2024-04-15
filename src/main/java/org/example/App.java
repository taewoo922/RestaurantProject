package org.example;

import org.example.container.Container;
import org.example.controller.*;
import org.example.db.DBConnection;


import java.util.Scanner;

public class App {
    public App (){
        DBConnection.DB_NAME = "sbs_proj";
        DBConnection.DB_USER = "sbsst";
        DBConnection.DB_PASSWORD = "sbs123414";
        DBConnection.DB_PORT = 3306;

        Container.getDBConnection().connect();
    }
    public void start() {
        System.out.println("== 프로그램 시작 ==");

        Scanner sc = new Scanner(System.in);

        System.out.println("== 접속 페이지==");
        System.out.println("접속 방식을 입력해 주세요");
        System.out.println("1. 회원 로그인 : 회원 로그인");
        System.out.println("2. 비회원 로그인: 비회원 로그인");
        System.out.println("3. 회원가입 : 회원 가입");

        MemberController memberController = new MemberController(sc);
        ArticleController articleController = new ArticleController(sc);
        DistrictController districtController = new DistrictController(sc);
        ExportController exportController = new ExportController(sc);

//        articleController.makeTestData();
//        memberController.makeTestData();
        districtController.makeTestData();

        while ( true ) {
            System.out.printf("명령어) ");
            String cmd = sc.nextLine();
            cmd = cmd.trim();

            if ( cmd.length() == 0 ) {
                continue;
            }

            if ( cmd.equals("exit") ) {
                break;
            }

            String[] cmdBits = cmd.split(" "); // article write / member join

            if ( cmdBits.length == 1 ) {
                System.out.println("존재하지 않는 명령어 입니다.");
                continue;
            }

            String controllerName = cmdBits[0]; // article / member
            String actionMethodName = cmdBits[1]; // write / join

            Controller controller = null;

            if ( controllerName.equals("article") ) {
                controller = articleController;
            }
            else if ( controllerName.equals("member") ) {
                controller = memberController;
            }
            else if ( controllerName.equals("지역") ) {
                controller = districtController;
            }
            else if ( controllerName.equals("export") ) {
                controller = exportController;
            }
            else {
                System.out.println("존재하지 않는 명령어입니다.");
                continue;
            }

            String actionName = controllerName + "/" + actionMethodName;

            switch ( actionName ) {
                case "article/write":
                case "article/delete":
                case "article/modify":
                case "memeber/logout":
                    if ( Container.getSession().isLogined() == false ) {
                        System.out.println("로그인 후 이용해주세요.");
                        continue;
                    }
                    break;
            }

            switch ( actionName ) {
                case "member/login":
                case "memeber/join":
                    if (Container.getSession().isLogined() ) {
                        System.out.println("로그아웃 후 이용해주세요.");
                        continue;
                    }
                    break;
            }


            controller.doAction(cmd, actionMethodName);
        }


        sc.close();
        System.out.println("== 프로그램 끝 ==");
    }
}