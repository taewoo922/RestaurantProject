DROP DATABASE IF EXISTS sbs_proj;
CREATE DATABASE sbs_proj;
USE sbs_proj;

CREATE TABLE article (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	title CHAR(100) NOT NULL,
	`body` TEXT NOT NULL,
	memberId INT(10)UNSIGNED NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

	INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목',
`body` = '내용1',
memberId = 1,
boardId = 1;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목2',
`body` = '내용2',
memberId = 2,
boardId = 2;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목3',
`body` = '내용3',
memberId = 3,
boardId = 3;

SELECT * FROM article;

ALTER TABLE article ADD COLUMN hit INT(10) UNSIGNED NOT NULL;

CREATE TABLE articleReply (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	`body` CHAR(100) NOT NULL,
	memberId INT(10) UNSIGNED NOT NULL,
	articleId INT(10) UNSIGNED NOT NULL,
	INDEX articleId(`articleId`)
);

INSERT INTO articleReply
SET regDate = NOW(),
updateDate = NOW(),
`body` = '댓글1',
memberId = 1,
articleId = 1;

INSERT INTO articleReply
SET regDate = NOW(),
updateDate = NOW(),
`body` = '댓글2',
memberId = 2,
articleId = 2;

SELECT * FROM articleReply;

CREATE TABLE `member` (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	loginId CHAR(100) NOT NULL UNIQUE,
	loginPassword CHAR(100) NOT NULL,
	`name` CHAR(100) NOT NULL
);
INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'admin',
loginPassword = 'admin',
`name` = '관리자';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user1',
loginPassword = 'user1',
`name` = '홍길동';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user2',
loginPassword = 'user2',
`name` = '홍길순';


CREATE TABLE board (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	`code` CHAR(100) NOT NULL UNIQUE,#free/notice
	`name` CHAR(100) NOT NULL#자유/공지
);

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'notice',
`name` = '공지';

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'free',
`name` = '자유';

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'food',
`name` = '메뉴';

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'foodtype',
`name` = '메뉴종류';

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'town',
`name` = '지역맛집';

SELECT * FROM board;

SELECT A.*
FROM `article` AS A
INNER JOIN `board` AS B
ON A.boardId = B.id
WHERE B.`code` = '제'

CREATE TABLE district (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	food CHAR(100) NOT NULL,
	foodtype TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

SHOW TABLES;
DESC article;
SELECT * FROM gyeonggiFood;

INSERT INTO district
SET regDate = NOW(),
food = '한식',
foodtype = '국물요리,구이류,볶음류,분식,건강식(쌈밥,가정식,나물류위주의식당),죽&비빔밥,찜,탕',
boardId = 3;

INSERT INTO district
SET regDate = NOW(),
food = '일식',
foodtype = '밥류(초밥,돈부리,장어덮밥,오므라이스,카레라이스,텐동),면류(우동,라멘,소바)',
boardId = 3;

INSERT INTO district
SET regDate = NOW(),
food = '중식',
foodtype = '면류(짜장면,짬뽕,도삭면,기스면,우육면),탕류(마라탕,누룽지탕,불도장,훠궈),만두류(딤섬,소롱포,춘권,만터우),요리류(탕수육,깐풍기,고추잡채,양장피,유산슬 등)',
boardId = 3;

INSERT INTO district
SET regDate = NOW(),
food = '양식',
foodtype = '파스타, 리조또, 스테이크, 수제버거, 스튜, 라자냐, 케밥',
boardId = 3;

CREATE TABLE seoulFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO seoulFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',
boardId = 4;

INSERT INTO seoulFood
SET regDate = NOW(),
foodtype = '구이류',
town = '종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',
boardId = 4;

INSERT INTO seoulFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',
boardId = 4;

INSERT INTO seoulFood
SET regDate = NOW(),
foodtype = '분식',
town = '종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',
boardId = 4;

INSERT INTO seoulFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',
boardId = 4;

INSERT INTO seoulFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',
boardId = 4;

INSERT INTO seoulFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '종로,용산,마포,서대문,성동,영등포,관악,서초,강남,동작,송파,강동,강서',
boardId = 4;

CREATE TABLE gyeonggiFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

SELECT * FROM board;

INSERT INTO gyeonggiFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',
boardId = 4;

INSERT INTO gyeonggiFood
SET regDate = NOW(),
foodtype = '구이류',
town = '고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',
boardId = 4;

INSERT INTO gyeonggiFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',
boardId = 4;

INSERT INTO gyeonggiFood
SET regDate = NOW(),
foodtype = '분식',
town = '고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',
boardId = 4;

INSERT INTO gyeonggiFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',
boardId = 4;

INSERT INTO gyeonggiFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',
boardId = 4;

INSERT INTO gyeonggiFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '고양,부천,성남,의정부,하남,수원,용인,화성,남양주,이천',
boardId = 4;