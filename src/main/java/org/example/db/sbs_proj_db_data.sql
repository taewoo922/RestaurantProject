/*
SQLyog Community v13.2.1 (64 bit)
MySQL - 10.4.32-MariaDB : Database - sbs_proj
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sbs_proj` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `sbs_proj`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `title` char(100) NOT NULL,
  `body` text NOT NULL,
  `memberId` int(10) unsigned NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  `hit` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `article` */

insert  into `article`(`id`,`regDate`,`updateDate`,`title`,`body`,`memberId`,`boardId`,`hit`) values 
(2,'2024-04-01 16:35:27','2024-04-03 14:31:07','2','2',2,2,14),
(3,'2024-04-01 16:35:27','2024-04-01 16:35:27','제목3','내용3',3,3,6),
(5,'2024-04-02 18:42:35','2024-04-17 14:16:44','다시','다다',1,2,0),
(6,'2024-04-16 18:21:01','2024-04-16 18:21:01','test','test',7,1,0);

/*Table structure for table `articleReply` */

DROP TABLE IF EXISTS `articleReply`;

CREATE TABLE `articleReply` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `body` char(100) NOT NULL,
  `memberId` int(10) unsigned NOT NULL,
  `articleId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `articleId` (`articleId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `articleReply` */

insert  into `articleReply`(`id`,`regDate`,`updateDate`,`body`,`memberId`,`articleId`) values 
(1,'2024-04-01 17:16:37','2024-04-01 17:16:37','댓글1',1,1),
(2,'2024-04-01 17:16:37','2024-04-01 17:16:37','댓글2',2,2),
(3,'2024-04-03 16:16:57','2024-04-03 16:16:57','유익한 글이네요',1,2),
(4,'2024-04-03 16:36:17','2024-04-03 16:36:17','유익한 글잉네요',1,2),
(5,'2024-04-03 16:42:27','2024-04-03 16:42:27','ㅎㄷㄷ',1,2),
(6,'2024-04-03 17:32:47','2024-04-03 17:32:47','안녕하세요',1,2);

/*Table structure for table `board` */

DROP TABLE IF EXISTS `board`;

CREATE TABLE `board` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `code` char(100) NOT NULL,
  `name` char(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `board` */

insert  into `board`(`id`,`regDate`,`updateDate`,`code`,`name`) values 
(1,'2024-04-01 17:15:03','2024-04-01 17:15:03','notice','공지'),
(2,'2024-04-01 17:15:03','2024-04-01 17:15:03','free','자유'),
(3,'2024-04-15 18:08:15','2024-04-15 18:08:15','food','메뉴'),
(4,'2024-04-15 18:08:40','2024-04-15 18:08:40','foodtype','메뉴종류'),
(5,'2024-04-15 18:09:03','2024-04-15 18:09:03','town','지역맛집');

/*Table structure for table `busanFood` */

DROP TABLE IF EXISTS `busanFood`;

CREATE TABLE `busanFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `busanFood` */

insert  into `busanFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-16 15:35:16','국물요리','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(2,'2024-04-16 15:35:16','구이류','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(3,'2024-04-16 15:35:16','볶음류','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(4,'2024-04-16 15:35:16','분식','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(5,'2024-04-16 15:35:16','건강식(쌈밥,가정식,나물)','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(6,'2024-04-16 15:35:16','죽&비빔밥','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(7,'2024-04-16 15:35:16','찜,탕','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4);

/*Table structure for table `busanTown` */

DROP TABLE IF EXISTS `busanTown`;

CREATE TABLE `busanTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `busanTown` */

/*Table structure for table `daeguFood` */

DROP TABLE IF EXISTS `daeguFood`;

CREATE TABLE `daeguFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `daeguFood` */

insert  into `daeguFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-16 15:07:57','국물요리','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(2,'2024-04-16 15:07:57','구이류','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(3,'2024-04-16 15:07:57','볶음류','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(4,'2024-04-16 15:07:57','분식','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(5,'2024-04-16 15:07:57','건강식(쌈밥,가정식,나물)','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(6,'2024-04-16 15:07:57','죽&비빔밥','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(7,'2024-04-16 15:07:57','찜,탕','중구,동구,서구,남구,북구,달서구,달성군,수성구',4);

/*Table structure for table `daeguTown` */

DROP TABLE IF EXISTS `daeguTown`;

CREATE TABLE `daeguTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `daeguTown` */

/*Table structure for table `daejeonFood` */

DROP TABLE IF EXISTS `daejeonFood`;

CREATE TABLE `daejeonFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `daejeonFood` */

insert  into `daejeonFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-16 15:04:52','국물요리','중구,동구,서구,대덕구,유성구',4),
(2,'2024-04-16 15:04:52','구이류','중구,동구,서구,대덕구,유성구',4),
(3,'2024-04-16 15:04:52','볶음류','중구,동구,서구,대덕구,유성구',4),
(4,'2024-04-16 15:04:52','분식','중구,동구,서구,대덕구,유성구',4),
(5,'2024-04-16 15:04:52','건강식(쌈밥,가정식,나물)','중구,동구,서구,대덕구,유성구',4),
(6,'2024-04-16 15:04:52','죽&비빔밥','중구,동구,서구,대덕구,유성구',4),
(7,'2024-04-16 15:06:04','찜,탕','중구,동구,서구,대덕구,유성구',4);

/*Table structure for table `daejeonTown` */

DROP TABLE IF EXISTS `daejeonTown`;

CREATE TABLE `daejeonTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `daejeonTown` */

/*Table structure for table `district` */

DROP TABLE IF EXISTS `district`;

CREATE TABLE `district` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `food` char(100) NOT NULL,
  `foodtype` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `district` */

insert  into `district`(`id`,`regDate`,`food`,`foodtype`,`boardId`) values 
(1,'2024-04-15 18:09:32','한식','국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕',3),
(2,'2024-04-15 18:09:32','일식','밥류(초밥,돈부리,장어덮밥,오므라이스,카레라이스,텐동),면류(우동,라멘,소바)',3),
(3,'2024-04-15 18:09:32','중식','면류(짜장면,짬뽕,도삭면,기스면,우육면),탕류(마라탕,누룽지탕,불도장,훠궈),만두류(딤섬,소롱포,춘권,만터우),요리류(탕수육,깐풍기,고추잡채,양장피,유산슬 등)',3),
(4,'2024-04-15 18:09:32','양식','파스타, 리조또, 스테이크, 수제버거, 스튜, 라자냐, 케밥',3);

/*Table structure for table `gwangjuFood` */

DROP TABLE IF EXISTS `gwangjuFood`;

CREATE TABLE `gwangjuFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `gwangjuFood` */

insert  into `gwangjuFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-16 15:12:08','국물요리','동구,서구,남구,북구,광산구',4),
(2,'2024-04-16 15:12:08','구이류','동구,서구,남구,북구,광산구',4),
(3,'2024-04-16 15:12:08','볶음류','동구,서구,남구,북구,광산구',4),
(4,'2024-04-16 15:12:08','분식','동구,서구,남구,북구,광산구',4),
(5,'2024-04-16 15:12:08','건강식(쌈밥,가정식,나물)','동구,서구,남구,북구,광산구',4),
(6,'2024-04-16 15:12:08','죽&비빔밥','동구,서구,남구,북구,광산구',4),
(7,'2024-04-16 15:12:08','찜,탕','동구,서구,남구,북구,광산구',4);

/*Table structure for table `gwangjuTown` */

DROP TABLE IF EXISTS `gwangjuTown`;

CREATE TABLE `gwangjuTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `gwangjuTown` */

/*Table structure for table `gyeonggiFood` */

DROP TABLE IF EXISTS `gyeonggiFood`;

CREATE TABLE `gyeonggiFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `gyeonggiFood` */

insert  into `gyeonggiFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-15 18:30:26','국물요리','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(3,'2024-04-15 18:34:23','구이류','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(4,'2024-04-15 18:34:23','볶음류','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(5,'2024-04-15 18:34:23','분식','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(6,'2024-04-15 18:34:23','건강식(쌈밥,가정식,나물)','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(7,'2024-04-15 18:34:23','죽&비빔밥','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(8,'2024-04-15 18:34:23','찜,탕','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4);

/*Table structure for table `gyeonggiTown` */

DROP TABLE IF EXISTS `gyeonggiTown`;

CREATE TABLE `gyeonggiTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `gyeonggiTown` */

insert  into `gyeonggiTown`(`id`,`regDate`,`foodtype`,`town`,`resname`,`address`,`num`,`boardId`) values 
(1,'2024-04-17 18:41:16','국물요리','고양','정돈 도마수육 순대국','경기 고양시 일산서구 호수로856번길 73-14 1층','031-925-7772',5);

/*Table structure for table `incheonFood` */

DROP TABLE IF EXISTS `incheonFood`;

CREATE TABLE `incheonFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `incheonFood` */

insert  into `incheonFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-15 18:38:11','국물요리','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(2,'2024-04-15 18:39:05','구이류','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(3,'2024-04-15 18:39:05','볶음류','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(4,'2024-04-15 18:39:05','분식','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(5,'2024-04-15 18:39:05','건강식(쌈밥,가정식,나물)','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(6,'2024-04-15 18:39:05','죽&비빔밥','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(7,'2024-04-15 18:39:05','찜,탕','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4);

/*Table structure for table `incheonTown` */

DROP TABLE IF EXISTS `incheonTown`;

CREATE TABLE `incheonTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `incheonTown` */

/*Table structure for table `jejuFood` */

DROP TABLE IF EXISTS `jejuFood`;

CREATE TABLE `jejuFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `jejuFood` */

insert  into `jejuFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-16 15:36:42','국물요리','제주시,서귀포시',4),
(2,'2024-04-16 15:36:42','구이류','제주시,서귀포시',4),
(3,'2024-04-16 15:36:42','볶음류','제주시,서귀포시',4),
(4,'2024-04-16 15:36:42','분식','제주시,서귀포시',4),
(5,'2024-04-16 15:36:42','건강식(쌈밥,가정식,나물)','제주시,서귀포시',4),
(6,'2024-04-16 15:36:42','죽&비빔밥','제주시,서귀포시',4),
(7,'2024-04-16 15:36:42','찜,탕','제주시,서귀포시',4);

/*Table structure for table `jejuTown` */

DROP TABLE IF EXISTS `jejuTown`;

CREATE TABLE `jejuTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `jejuTown` */

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `loginId` char(100) NOT NULL,
  `loginPassword` char(100) NOT NULL,
  `name` char(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `loginId` (`loginId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `member` */

insert  into `member`(`id`,`regDate`,`updateDate`,`loginId`,`loginPassword`,`name`) values 
(1,'2024-04-01 17:19:48','2024-04-01 17:19:48','admin','admin','관리자'),
(2,'2024-04-01 17:19:48','2024-04-01 17:19:48','user1','user1','홍길동'),
(3,'2024-04-01 17:19:48','2024-04-01 17:19:48','user2','user2','홍길순'),
(4,'2024-04-02 18:06:38','2024-04-02 18:06:38','user7','user7','kkk'),
(5,'2024-04-16 17:45:05','2024-04-16 17:45:05','1234','1234','aaa'),
(6,'2024-04-16 17:46:16','2024-04-16 17:46:16','11111','11111','ㅁㄴㅇㅁㄹ'),
(7,'2024-04-16 18:20:22','2024-04-16 18:20:22','kk','kk','kk');

/*Table structure for table `seoulFood` */

DROP TABLE IF EXISTS `seoulFood`;

CREATE TABLE `seoulFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `seoulFood` */

insert  into `seoulFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-15 18:15:19','국물요리','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(2,'2024-04-15 18:17:14','구이류','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(3,'2024-04-15 18:17:14','볶음류','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(4,'2024-04-15 18:17:14','분식','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(5,'2024-04-15 18:17:14','건강식(쌈밥,가정식,나물)','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(6,'2024-04-15 18:17:14','죽&비빔밥','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(7,'2024-04-15 18:17:14','찜,탕','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4);

/*Table structure for table `seoulTown` */

DROP TABLE IF EXISTS `seoulTown`;

CREATE TABLE `seoulTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `seoulTown` */

insert  into `seoulTown`(`id`,`regDate`,`foodtype`,`town`,`resname`,`address`,`num`,`boardId`) values 
(1,'2024-04-16 15:42:38','국물요리','종로','은설설렁탕','서울 종로구 북촌로5가길 44-6 은설설렁탕','0507-1391-2997',5),
(3,'2024-04-17 14:25:13','국물요리','종로','합천돼지국밥','서울특별시 종로구 낙원동 290-1','02-742-4142',5),
(14,'2024-04-17 17:20:44','분식','성동','마미ㅗㄴ','성동구 어딘가에','02-134-1234',1),
(15,'2024-04-17 17:32:01','국물요리','종로','합천돼지국밥','서울특별시 종로구 낙원동 290-1','02-742-4142',1);

/*Table structure for table `ulsanFood` */

DROP TABLE IF EXISTS `ulsanFood`;

CREATE TABLE `ulsanFood` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `ulsanFood` */

insert  into `ulsanFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-16 15:33:42','국물요리','동구,중구,남구,북구,울주군',4),
(2,'2024-04-16 15:33:42','구이류','동구,중구,남구,북구,울주군',4),
(3,'2024-04-16 15:33:42','볶음류','동구,중구,남구,북구,울주군',4),
(4,'2024-04-16 15:33:42','분식','동구,중구,남구,북구,울주군',4),
(5,'2024-04-16 15:33:42','건강식(쌈밥,가정식,나물)','동구,중구,남구,북구,울주군',4),
(6,'2024-04-16 15:33:42','죽&비빔밥','동구,중구,남구,북구,울주군',4),
(7,'2024-04-16 15:33:42','찜,탕','동구,중구,남구,북구,울주군',4);

/*Table structure for table `ulsanTown` */

DROP TABLE IF EXISTS `ulsanTown`;

CREATE TABLE `ulsanTown` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `town` text NOT NULL,
  `resname` text NOT NULL,
  `address` text NOT NULL,
  `num` text NOT NULL,
  `boardId` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `ulsanTown` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
