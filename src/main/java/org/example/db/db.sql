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

SELECT *
FROM `member`
WHERE loginId = '1234';

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


SELECT * FROM gyeonggiTown;

SELECT *
FROM seoulTown
WHERE foodtype = '분식'
AND town = '성동';

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


CREATE TABLE seoulTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO seoulTown
SET regDate = NOW(),
foodtype = '국물요리',
town = '종로',
resname = '은설설렁탕',
address = '서울 종로구 북촌로5가길 44-6 은설설렁탕',
num = '0507-1391-2997',
boardId = 5;

CREATE TABLE gyeonggiFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);
CREATE TABLE gyeonggiTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);


INSERT INTO gyeonggiTown
SET regDate = NOW(),
foodtype = '국물요리',
town = '고양',
resname = '정돈 도마수육 순대국',
address = '경기 고양시 일산서구 호수로856번길 73-14 1층',
num = '031-925-7772',
boardId = 5;

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

CREATE TABLE incheonFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

CREATE TABLE incheonTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO incheonFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',
boardId = 4;

INSERT INTO incheonFood
SET regDate = NOW(),
foodtype = '구이류',
town = '중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',
boardId = 4;

INSERT INTO incheonFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',
boardId = 4;

INSERT INTO incheonFood
SET regDate = NOW(),
foodtype = '분식',
town = '중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',
boardId = 4;

INSERT INTO incheonFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',
boardId = 4;

INSERT INTO incheonFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',
boardId = 4;

INSERT INTO incheonFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '중구,동구,서구,강화군,미추홀구,연수구,남동구,부평구,계양구',
boardId = 4;

CREATE TABLE daejeonFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

CREATE TABLE daejeonTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO daejeonFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '중구,동구,서구,대덕구,유성구',
boardId = 4;

INSERT INTO daejeonFood
SET regDate = NOW(),
foodtype = '구이류',
town = '중구,동구,서구,대덕구,유성구',
boardId = 4;

INSERT INTO daejeonFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '중구,동구,서구,대덕구,유성구',
boardId = 4;

INSERT INTO daejeonFood
SET regDate = NOW(),
foodtype = '분식',
town = '중구,동구,서구,대덕구,유성구',
boardId = 4;

INSERT INTO daejeonFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '중구,동구,서구,대덕구,유성구',
boardId = 4;

INSERT INTO daejeonFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '중구,동구,서구,대덕구,유성구',
boardId = 4;

INSERT INTO daejeonFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '중구,동구,서구,대덕구,유성구',
boardId = 4;

CREATE TABLE daeguFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);
CREATE TABLE daeguTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO daeguFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '중구,동구,서구,남구,북구,달서구,달성군,수성구',
boardId = 4;

INSERT INTO daeguFood
SET regDate = NOW(),
foodtype = '구이류',
town = '중구,동구,서구,남구,북구,달서구,달성군,수성구',
boardId = 4;

INSERT INTO daeguFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '중구,동구,서구,남구,북구,달서구,달성군,수성구',
boardId = 4;

INSERT INTO daeguFood
SET regDate = NOW(),
foodtype = '분식',
town = '중구,동구,서구,남구,북구,달서구,달성군,수성구',
boardId = 4;

INSERT INTO daeguFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '중구,동구,서구,남구,북구,달서구,달성군,수성구',
boardId = 4;

INSERT INTO daeguFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '중구,동구,서구,남구,북구,달서구,달성군,수성구',
boardId = 4;

INSERT INTO daeguFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '중구,동구,서구,남구,북구,달서구,달성군,수성구',
boardId = 4;

CREATE TABLE gwangjuFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

CREATE TABLE gwangjuTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO gwangjuFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '동구,서구,남구,북구,광산구',
boardId = 4;

INSERT INTO gwangjuFood
SET regDate = NOW(),
foodtype = '구이류',
town = '동구,서구,남구,북구,광산구',
boardId = 4;

INSERT INTO gwangjuFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '동구,서구,남구,북구,광산구',
boardId = 4;

INSERT INTO gwangjuFood
SET regDate = NOW(),
foodtype = '분식',
town = '동구,서구,남구,북구,광산구',
boardId = 4;

INSERT INTO gwangjuFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '동구,서구,남구,북구,광산구',
boardId = 4;

INSERT INTO gwangjuFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '동구,서구,남구,북구,광산구',
boardId = 4;

INSERT INTO gwangjuFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '동구,서구,남구,북구,광산구',
boardId = 4;

SELECT * FROM jejuFood;
SELECT * FROM board;

CREATE TABLE ulsanFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

CREATE TABLE ulsanTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO ulsanFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '동구,중구,남구,북구,울주군',
boardId = 4;

INSERT INTO ulsanFood
SET regDate = NOW(),
foodtype = '구이류',
town = '동구,중구,남구,북구,울주군',
boardId = 4;

INSERT INTO ulsanFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '동구,중구,남구,북구,울주군',
boardId = 4;

INSERT INTO ulsanFood
SET regDate = NOW(),
foodtype = '분식',
town = '동구,중구,남구,북구,울주군',
boardId = 4;

INSERT INTO ulsanFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '동구,중구,남구,북구,울주군',
boardId = 4;

INSERT INTO ulsanFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '동구,중구,남구,북구,울주군',
boardId = 4;

INSERT INTO ulsanFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '동구,중구,남구,북구,울주군',
boardId = 4;

CREATE TABLE busanFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

CREATE TABLE busanTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO busanFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',
boardId = 4;

INSERT INTO busanFood
SET regDate = NOW(),
foodtype = '구이류',
town = '남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',
boardId = 4;

INSERT INTO busanFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',
boardId = 4;

INSERT INTO busanFood
SET regDate = NOW(),
foodtype = '분식',
town = '남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',
boardId = 4;

INSERT INTO busanFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',
boardId = 4;

INSERT INTO busanFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',
boardId = 4;

INSERT INTO busanFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '남구,동구,서구,중구,해운대구,기장군,북구,사상구,강서구,영도구,진구,수영구,동래구',
boardId = 4;

CREATE TABLE jejuFood (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

CREATE TABLE jejuTown (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	foodtype CHAR(100) NOT NULL,
	town TEXT NOT NULL,
	resname TEXT NOT NULL,
	address TEXT NOT NULL,
	num TEXT NOT NULL,
	boardId INT(10) UNSIGNED NOT NULL,
	INDEX boardId(`boardId`)
	);

INSERT INTO jejuFood
SET regDate = NOW(),
foodtype = '국물요리',
town = '제주시,서귀포시',
boardId = 4;

INSERT INTO jejuFood
SET regDate = NOW(),
foodtype = '구이류',
town = '제주시,서귀포시',
boardId = 4;

INSERT INTO jejuFood
SET regDate = NOW(),
foodtype = '볶음류',
town = '제주시,서귀포시',
boardId = 4;

INSERT INTO jejuFood
SET regDate = NOW(),
foodtype = '분식',
town = '제주시,서귀포시',
boardId = 4;

INSERT INTO jejuFood
SET regDate = NOW(),
foodtype = '건강식(쌈밥,가정식,나물)',
town = '제주시,서귀포시',
boardId = 4;

INSERT INTO jejuFood
SET regDate = NOW(),
foodtype = '죽&비빔밥',
town = '제주시,서귀포시',
boardId = 4;

INSERT INTO jejuFood
SET regDate = NOW(),
foodtype = '찜,탕',
town = '제주시,서귀포시',
boardId = 4;