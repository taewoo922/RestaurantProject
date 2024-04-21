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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `article` */

insert  into `article`(`id`,`regDate`,`updateDate`,`title`,`body`,`memberId`,`boardId`,`hit`) values 
(1,'2024-04-18 12:11:31','2024-04-18 12:11:31','제목','내용1',1,1,0),
(2,'2024-04-18 12:11:31','2024-04-18 12:11:31','제목2','내용2',2,2,0),
(3,'2024-04-18 12:11:31','2024-04-18 12:11:31','제목3','내용3',3,3,0);

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `articleReply` */

insert  into `articleReply`(`id`,`regDate`,`updateDate`,`body`,`memberId`,`articleId`) values 
(1,'2024-04-18 12:11:31','2024-04-18 12:11:31','댓글1',1,1),
(2,'2024-04-18 12:11:31','2024-04-18 12:11:31','댓글2',2,2);

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
(1,'2024-04-18 12:11:31','2024-04-18 12:11:31','notice','공지'),
(2,'2024-04-18 12:11:31','2024-04-18 12:11:31','free','자유'),
(3,'2024-04-18 12:11:31','2024-04-18 12:11:31','food','메뉴'),
(4,'2024-04-18 12:11:31','2024-04-18 12:11:31','foodtype','메뉴종류'),
(5,'2024-04-18 12:11:31','2024-04-18 12:11:31','town','지역맛집');

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
(1,'2024-04-18 12:11:31','국물요리','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(2,'2024-04-18 12:11:31','구이류','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(3,'2024-04-18 12:11:31','볶음류','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(4,'2024-04-18 12:11:31','분식','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4),
(7,'2024-04-18 12:11:31','찜,탕','남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',4);

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
(1,'2024-04-18 12:11:31','국물요리','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(2,'2024-04-18 12:11:31','구이류','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(3,'2024-04-18 12:11:31','볶음류','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(4,'2024-04-18 12:11:31','분식','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','중구,동구,서구,남구,북구,달서구,달성군,수성구',4),
(7,'2024-04-18 12:11:31','찜,탕','중구,동구,서구,남구,북구,달서구,달성군,수성구',4);

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
(1,'2024-04-18 12:11:31','국물요리','중구,동구,서구,대덕구,유성구',4),
(2,'2024-04-18 12:11:31','구이류','중구,동구,서구,대덕구,유성구',4),
(3,'2024-04-18 12:11:31','볶음류','중구,동구,서구,대덕구,유성구',4),
(4,'2024-04-18 12:11:31','분식','중구,동구,서구,대덕구,유성구',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','중구,동구,서구,대덕구,유성구',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','중구,동구,서구,대덕구,유성구',4),
(7,'2024-04-18 12:11:31','찜,탕','중구,동구,서구,대덕구,유성구',4);

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `district` */

insert  into `district`(`id`,`regDate`,`food`,`foodtype`,`boardId`) values 
(1,'2024-04-21 19:17:16','한식','국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕',3),
(2,'2024-04-21 19:17:16','일식','밥류(초밥,돈부리,장어덮밥,오므라이스,카레라이스,텐동),면류(우동,라멘,소바)',3),
(3,'2024-04-21 19:17:16','중식','면류(짜장면,짬뽕,도삭면,기스면,우육면),탕류(마라탕,누룽지탕,불도장,훠궈),만두류(딤섬,소롱포,춘권,만터우),요리류(탕수육,깐풍기,고추잡채,양장피,유산슬 등)',3),
(4,'2024-04-21 19:17:16','양식','파스타, 리조또, 스테이크, 수제버거, 스튜, 라자냐, 케밥',3);

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
(1,'2024-04-18 12:11:31','국물요리','동구,서구,남구,북구,광산구',4),
(2,'2024-04-18 12:11:31','구이류','동구,서구,남구,북구,광산구',4),
(3,'2024-04-18 12:11:31','볶음류','동구,서구,남구,북구,광산구',4),
(4,'2024-04-18 12:11:31','분식','동구,서구,남구,북구,광산구',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','동구,서구,남구,북구,광산구',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','동구,서구,남구,북구,광산구',4),
(7,'2024-04-18 12:11:31','찜,탕','동구,서구,남구,북구,광산구',4);

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `gyeonggiFood` */

insert  into `gyeonggiFood`(`id`,`regDate`,`foodtype`,`town`,`boardId`) values 
(1,'2024-04-18 12:11:31','국물요리','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(2,'2024-04-18 12:11:31','구이류','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(3,'2024-04-18 12:11:31','볶음류','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(4,'2024-04-18 12:11:31','분식','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4),
(7,'2024-04-18 12:11:31','찜,탕','고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',4);

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
(1,'2024-04-18 12:11:31','국물요리','고양','정돈 도마수육 순대국','경기 고양시 일산서구 호수로856번길 73-14 1층','031-925-7772',5);

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
(1,'2024-04-18 12:11:31','국물요리','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(2,'2024-04-18 12:11:31','구이류','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(3,'2024-04-18 12:11:31','볶음류','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(4,'2024-04-18 12:11:31','분식','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4),
(7,'2024-04-18 12:11:31','찜,탕','중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',4);

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
(1,'2024-04-18 12:11:31','국물요리','제주시,서귀포시',4),
(2,'2024-04-18 12:11:31','구이류','제주시,서귀포시',4),
(3,'2024-04-18 12:11:31','볶음류','제주시,서귀포시',4),
(4,'2024-04-18 12:11:31','분식','제주시,서귀포시',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','제주시,서귀포시',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','제주시,서귀포시',4),
(7,'2024-04-18 12:11:31','찜,탕','제주시,서귀포시',4);

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
  `favoritefood` char(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `loginId` (`loginId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `member` */

insert  into `member`(`id`,`regDate`,`updateDate`,`loginId`,`loginPassword`,`name`,`favoritefood`) values 
(1,'2024-04-18 12:11:31','2024-04-18 12:11:31','admin','admin','관리자',''),
(2,'2024-04-18 12:11:31','2024-04-18 12:11:31','user1','user1','홍길동',''),
(3,'2024-04-18 12:11:31','2024-04-18 12:11:31','user2','user2','홍길순',''),
(4,'2024-04-21 17:14:36','2024-04-21 17:14:36','1','1','1','한식');

/*Table structure for table `nonmember` */

DROP TABLE IF EXISTS `nonmember`;

CREATE TABLE `nonmember` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `foodtype` char(100) NOT NULL,
  `randommenu` char(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `nonmember` */

insert  into `nonmember`(`id`,`regDate`,`foodtype`,`randommenu`) values 
(1,'2024-04-21 17:48:17','양식','파스타'),
(2,'2024-04-21 17:48:22','양식','리조또'),
(3,'2024-04-21 17:48:28','양식','스테이크'),
(4,'2024-04-21 17:48:36','양식','수제버거'),
(5,'2024-04-21 17:48:40','양식','스튜'),
(6,'2024-04-21 17:48:44','양식','라자냐'),
(7,'2024-04-21 17:48:48','양식','케밥'),
(8,'2024-04-21 17:49:02','한식','분식'),
(9,'2024-04-21 17:49:09','한식','쌈밥'),
(10,'2024-04-21 17:49:17','한식','죽'),
(11,'2024-04-21 17:49:26','한식','비빔밥'),
(12,'2024-04-21 17:49:34','한식','수육국밥'),
(13,'2024-04-21 17:49:39','한식','순대국'),
(14,'2024-04-21 17:49:45','한식','감자탕'),
(15,'2024-04-21 17:49:52','한식','삼겹살'),
(16,'2024-04-21 17:50:16','한식','철판볶음밥'),
(17,'2024-04-21 17:50:36','중식','짜장면'),
(18,'2024-04-21 17:50:41','중식','짬뽕'),
(19,'2024-04-21 17:50:46','중식','우육면'),
(20,'2024-04-21 17:50:51','중식','마라탕'),
(21,'2024-04-21 17:51:04','중식','훠궈'),
(22,'2024-04-21 17:51:14','중식','딤섬'),
(23,'2024-04-21 17:51:19','중식','소롱포'),
(24,'2024-04-21 17:51:30','중식','탕수육'),
(25,'2024-04-21 17:51:34','중식','깐풍기'),
(26,'2024-04-21 17:51:39','중식','고추잡채'),
(27,'2024-04-21 17:51:42','중식','양장피'),
(28,'2024-04-21 17:51:46','중식','유산슬'),
(29,'2024-04-21 17:52:00','일식','초밥'),
(30,'2024-04-21 17:52:04','일식','돈부리'),
(31,'2024-04-21 17:52:09','일식','장어덮밥'),
(32,'2024-04-21 17:52:13','일식','오므라이스'),
(33,'2024-04-21 17:52:18','일식','텐동'),
(34,'2024-04-21 17:52:23','일식','우동'),
(35,'2024-04-21 17:52:39','일식','라멘'),
(36,'2024-04-21 17:52:45','일식','소바'),
(37,'2024-04-21 17:52:50','한식','냉면'),
(38,'2024-04-21 17:52:58','한식','칼국수'),
(39,'2024-04-21 17:53:05','동남아','쌀국수');

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
(1,'2024-04-18 12:11:31','국물요리','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(2,'2024-04-18 12:11:31','구이류','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(3,'2024-04-18 12:11:31','볶음류','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(4,'2024-04-18 12:11:31','분식','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4),
(7,'2024-04-18 12:11:31','찜,탕','종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',4);

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
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `seoulTown` */

insert  into `seoulTown`(`id`,`regDate`,`foodtype`,`town`,`resname`,`address`,`num`,`boardId`) values 
(1,'2024-04-18 12:11:31','국물요리','종로','은설설렁탕','서울 종로구 북촌로5가길 44-6 은설설렁탕','0507-1391-2997',5),
(2,'2024-04-21 21:59:47','국물요리','종로','광화문국밥','서울 중구 세종대로21길 53','02-738-5688',5),
(3,'2024-04-21 22:00:57','국물요리','종로','청진동해장국 북창점','서울 중구 남대문로1길 18','02-753-7580',5),
(4,'2024-04-21 22:02:24','국물요리','종로','호남집','서울 종로구 동호로 398 광장시장 동문A9호','02-2269-9366',5),
(5,'2024-04-21 22:03:57','국물요리','종로','미성옥','서울 중구 명동길 25-11','02-776-8929',5),
(6,'2024-04-21 22:05:20','국물요리','용산','홍가진국','서울 용산구 원효로 241-1','0507-1407-3339',5),
(7,'2024-04-21 22:05:57','국물요리','용산','가마솥족발순대국','서울 용산구 후암로 62','02-776-2223',5),
(8,'2024-04-21 22:06:33','국물요리','용산','이조순대국','서울 용산구 원효로41길 54 이조순대국','02-717-3387',5),
(9,'2024-04-21 22:07:30','국물요리','용산','금강산식당','서울 용산구 청파로 303','02-713-6650',5),
(10,'2024-04-21 22:08:14','국물요리','용산','천하뼈다귀감자탕 보광점','서울 용산구 보광로 17','02-795-9074',5),
(11,'2024-04-21 22:08:56','국물요리','마포','영동감자탕','서울 마포구 월드컵북로5길 17 서교동, 영동감자탕','02-3141-8885',5),
(12,'2024-04-21 22:09:59','국물요리','마포','월강부산돼지국밥','서울 마포구 동교로 241-1 월강부산돼지국밥','02-326-5800',5),
(13,'2024-04-21 22:10:21','국물요리','마포','비사벌전주콩나물국밥 합정점','서울 마포구 독막로 35','02-333-7580',5),
(14,'2024-04-21 22:10:52','국물요리','마포','그레이스국밥 합정점','서울 마포구 마포대로12길 18','02-6409-0900',5),
(15,'2024-04-21 22:11:29','국물요리','마포','오이소 연남본점','서울 마포구 성미산로17길 105 1층','0507-1307-6829',5),
(16,'2024-04-21 22:12:37','국물요리','서대문','우자매순대국','서울 서대문구 거북골로24길 65 1층','02-304-6346',5),
(17,'2024-04-21 22:16:05','국물요리','서대문','소푸리콩나물국밥','서울 서대문구 성산로 331','02-333-2280',5),
(18,'2024-04-21 22:17:08','국물요리','서대문','부산돼지국밥','서울 서대문구 증가로31길 45','02-374-5822',5),
(19,'2024-04-21 22:17:43','국물요리','서대문','어반할미','서울 서대문구 경기대로 26-26 어바니엘충정로 B1층','0507-1466-0929',5),
(20,'2024-04-21 22:19:07','국물요리','서대문','자연미가','서울 서대문구 북아현로 83','02-362-1213',5),
(21,'2024-04-21 22:19:57','국물요리','성동','한경화설렁탕','서울 성동구 아차산로13길 48','02-467-8595',5),
(22,'2024-04-21 22:20:48','국물요리','성동','수제양정순대국 본점','서울 성동구 성덕정길 94','02-469-6665',5),
(23,'2024-04-21 22:21:30','국물요리','성동','굴과찜사랑','서울 성동구 행당로17길 23','02-2296-9922',5),
(24,'2024-04-21 22:22:04','국물요리','성동','장성식당','서울 성동구 용답길 157-31 1층','02-2249-6322',5),
(25,'2024-04-21 22:23:35','국물요리','성동','하동진','서울 성동구 행당로17길 17','02-6405-7001',5),
(26,'2024-04-21 22:25:02','국물요리','영등포','단디만','서울 영등포구 국제금융로6길 33 맨하탄빌딩(구 여의도백화점) 지하 1층 38호','0507-1315-8990',5),
(27,'2024-04-21 22:25:58','국물요리','영등포','제일어버이순대','서울 영등포구 여의대방로 379 제일빌딩2층 213호','0507-1414-1712',5),
(28,'2024-04-21 22:26:25','국물요리','영등포','일출옥','서울 영등포구 국회대로50길 20 1층상가 130호','0507-1384-9625',5),
(29,'2024-04-21 22:27:02','국물요리','영등포','고성소머리국밥','서울 영등포구 선유로 119','02-2633-5900',5),
(30,'2024-04-21 22:27:47','국물요리','영등포','구석집','서울 영등포구 국회대로36길 3-1 1층 구석집','0507-1475-1232',5),
(31,'2024-04-21 22:28:39','국물요리','관악','정남옥 서울대입구점	','서울 관악구 관악로 148 지층','0507-1473-1064',5),
(32,'2024-04-21 22:29:13','국물요리','관악','기절초풍왕순대','서울 관악구 봉천로62길 2','0507-1473-1064',5),
(33,'2024-04-21 22:29:46','국물요리','관악','산야로 콩나물국밥','서울 관악구 관악로 111','02-889-3390',5),
(34,'2024-04-21 22:30:26','국물요리','관악','이가소머리국밥','서울 관악구 신림로7나길 32','02-888-1530',5),
(35,'2024-04-21 22:30:52','국물요리','관악','장터국밥 감자탕','서울 관악구 남부순환로214길 14 1층','0507-1414-4147',5),
(36,'2024-04-21 22:31:33','국물요리','서초','방배동순대국','서울 서초구 효령로31길 46','02-598-9597',5),
(37,'2024-04-21 22:31:59','국물요리','서초','칠백한우국밥','서울 서초구 사평대로 365 대로변 1층','0507-1457-7021',5),
(38,'2024-04-21 22:32:33','국물요리','서초','콩나루콩나물국밥 직영점','서울 서초구 강남대로37길 55-3','02-3471-6468',5),
(39,'2024-04-21 22:32:54','국물요리','서초','서초명가','서울 서초구 방배로13길 18 1층','02-522-1599',5),
(40,'2024-04-21 22:33:32','국물요리','서초','천지인설렁탕 & 함흥냉면 잠원점','서울 서초구 강남대로101안길 17 자은빌딩 1층','0507-1360-3651',5),
(41,'2024-04-21 22:34:15','국물요리','강남','하영호신촌설렁탕 본점','서울 강남구 논현로28길 36','0507-1411-5636',5),
(42,'2024-04-21 22:34:57','국물요리','강남','농민백암순대 본점','서울 강남구 선릉로86길 40-4','02-555-9603',5),
(43,'2024-04-21 22:35:53','국물요리','강남','전주식당','서울 강남구 논현로150길 16 1층','02-548-3175',5),
(44,'2024-04-21 22:36:58','국물요리','강남','도곡 한우소머리국밥','서울 강남구 도곡로 172 도곡 한우소머리국밥','02-2057-0252',5),
(45,'2024-04-21 22:37:50','국물요리','강남','중앙해장','서울 강남구 영동대로86길 17 육인빌딩','02-558-7905',5),
(46,'2024-04-21 22:38:42','국물요리','동작','한국밥 노량진점','서울 동작구 만양로 105 한성빌딩','02-3280-9882',5),
(47,'2024-04-21 22:39:07','국물요리','동작','부자국밥','서울 동작구 신대방11길 34 1층 부자국밥','0507-1330-2570',5),
(48,'2024-04-21 22:39:34','국물요리','동작','서일순대국','서울 동작구 여의대방로24길 16','0507-1332-7769',5),
(49,'2024-04-21 22:40:18','국물요리','동작','소문난순대국','서울 동작구 동작대로29나길 38','02-2061-1820',5),
(50,'2024-04-21 22:41:01','국물요리','동작','등나무집','서울 동작구 대림로 52','02-843-8989',5),
(51,'2024-04-21 22:42:36','국물요리','송파','진미옥설렁탕 본점','서울 송파구 가락로16길 3-12 성창빌딩 1층','02-400-2131',5),
(52,'2024-04-21 22:43:09','국물요리','송파','또바라기돼지국밥 문정본점','서울 송파구 법원로 114 엠스테이트 e동 지하164호','0507-1490-1136',5),
(53,'2024-04-21 22:43:34','국물요리','송파','온수반 송파점','서울 송파구 백제고분로 469 1층 온수반','0507-1453-0691',5),
(54,'2024-04-21 22:43:55','국물요리','송파','조박사토종순대국','서울 송파구 올림픽로35길 112 장미상가B동 지하44호','02-424-6233',5),
(55,'2024-04-21 22:44:38','국물요리','송파','안동국시 소담','서울 송파구 위례성대로 48 반도빌딩 2층','02-415-1855',5),
(56,'2024-04-21 22:45:40','국물요리','강동','순대국집','서울 강동구 천호대로158길 15','02-478-5370',5),
(57,'2024-04-21 22:46:25','국물요리','강동','산성식당','서울 강동구 천호대로158길 15','02-478-5370',5),
(58,'2024-04-21 22:47:40','국물요리','강동','온고식당','서울 강동구 성안로3길 86 1층, 온고식당','0507-1411-9413',5),
(59,'2024-04-21 22:48:22','국물요리','강동','복조리설렁탕함흥냉면','서울 강동구 양재대로116길 50 1층','0507-1461-0093',5),
(60,'2024-04-21 22:49:11','국물요리','강동','굴이야기굴국밥	','서울 강동구 천중로43길 72','02-484-4840',5),
(61,'2024-04-21 22:49:44','국물요리','강서','오국밥 마곡점','서울 강서구 공항대로 186 마곡로뎀타워 123호 124호','02-2666-8507',5),
(62,'2024-04-21 22:50:04','국물요리','강서','개성순대국','서울 강서구 초록마을로2길 42','0507-1302-7238',5),
(63,'2024-04-21 22:50:48','국물요리','강서','장가네돼지국밥','서울 강서구 곰달래로49길 29 산호빌딩','02-2603-6262',5),
(64,'2024-04-21 22:51:24','국물요리','강서','원조나주곰탕','서울 강서구 양천로14길 10','02-2666-8292',5),
(65,'2024-04-21 22:52:27','국물요리','강서','민속돌솥설렁탕','서울 강서구 강서로 426 1층','02-6080-6006',5);

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
(1,'2024-04-18 12:11:31','국물요리','동구,중구,남구,북구,울주군',4),
(2,'2024-04-18 12:11:31','구이류','동구,중구,남구,북구,울주군',4),
(3,'2024-04-18 12:11:31','볶음류','동구,중구,남구,북구,울주군',4),
(4,'2024-04-18 12:11:31','분식','동구,중구,남구,북구,울주군',4),
(5,'2024-04-18 12:11:31','건강식(쌈밥,가정식,나물)','동구,중구,남구,북구,울주군',4),
(6,'2024-04-18 12:11:31','죽&비빔밥','동구,중구,남구,북구,울주군',4),
(7,'2024-04-18 12:11:31','찜,탕','동구,중구,남구,북구,울주군',4);

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
