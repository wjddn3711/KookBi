#수강신청 프로그램(학생정보 / 과목정보 / 교수님 / 강의실 / 신청목록)
#수하물 관리 시스템
#김사과	캐리어,기타,폭탄	서울	파리	대한항공	K001	146000

#2022001	김사과	컴공과	너무쉬운Java	 정다솔	30	컨퍼런스홀 201
#2022001	김사과	컴공과	너무쉬운DBMS	 정다솔	30	컨퍼런스홀 201
#2022001	김사과	컴공과	너무쉬운Python 류정원	35	제1공학관 101
#2022001	김사과	컴공과	너무쉬운HTML	 한동석	35	율곡관 304

#학생 [ 학번 이름 전공 나이 학년 ]
#과목 [ 과목코드 과목명 커리큘럼 교수번호 강의실번호 ]
#교수 [ 교수번호 교수이름 직급 급여 학과번호 ]
#강의실 [ 강의실번호 위치 정원 학과번호 담당자 ]
#신청목록 [ 목록번호 학번 과목코드 ]
#학과

USE testworld;
DROP TABLE test;
CREATE TABLE TEST(
	PK VARCHAR(300) PRIMARY KEY,
    NUM1 INT,
    NUM2 DECIMAL(5,2),
    STR1 VARCHAR(300),
    STR2 VARCHAR(300)
);
#데이터 추가
#컬럼명 생략시 테이블 구성 컬럼 순서대로 값을 넘겨준다.
INSERT INTO test VALUES('PK001',10000,100.32,'STR1 DATA','STR2 DATA');

#PK 값이 동일하면 UNIQUE 제약조건 충돌로 데이터 삽입 불가
INSERT INTO test VALUES('PK001',15000,111.11,'STR1 DATA','STR2 DATA');

#컬럼명을 지정해주면 해당 컬럼에 들어갈 값들만 넘겨준다.(컬럼 순서를 바꾸면 바뀐 순서대로 데이터 작성)
INSERT INTO test VALUES('PK002',20000,NULL,'STR1 DATA',NULL);
INSERT INTO test (pk,num1,str1) VALUES('PK002',20000,'STR1 DATA');
INSERT INTO test (str2,pk,num2) VALUES('STR2 DATA','PK003',150.15);

#데이터 삭제
DELETE FROM test WHERE pk='PK003';
DELETE FROM test WHERE NUM1>=0 AND NUM1<=20000;
DELETE FROM test WHERE NUM1 BETWEEN 0 AND 20000;

#컬럼명 IN (값1, 값2) : 컬럼명 = 값1 OR 컬럼명 = 값2 / 컬럼의 값이 뒤에 오는 값들중에 있다면 참
DELETE FROM test WHERE pk = 'PK001' OR pk = 'PK002';
DELETE FROM test WHERE pk IN ('PK001','PK002');

#데이터 수정
UPDATE test SET num2 = 222.22 WHERE pk='PK002';
UPDATE test SET str1 = 'CHANGED STR1' WHERE pk IN ('PK001','PK002');
#모든 num1 컬럼의 값을 1.3배 하고싶다!
UPDATE test SET NUM1 = NUM1*1.3;

#데이터 검색
SELECT pk,num2 FROM test;
#* : 전부라는 뜻
SELECT * FROM test;

SELECT * FROM test WHERE num1>10000;
#문자열 대소비교 가능(사전순으로 뒤에 있는것이 더 큰 값)
#'asdfasfasgdasgdafsdfasdf' < 'b'
SELECT * FROM test WHERE pk>'PK001';
#조건에 해당하는 행이 없을 때
SELECT * FROM test WHERE pk = 'PK004';

#세개의 꽃 데이터 추가, 화분 3개 추가하기
SELECT * FROM flower;
SELECT * FROM pot;
INSERT INTO pot VALUES(1,'대리석','네모','다솔컴퍼니',100000,'중');
INSERT INTO flower VALUES(1,'장미','빨간색','h:15cm','내가어떻게알아',10000,'봄',1);
#animal, member 테이블도 3개씩 추가하기
SELECT * FROM animal;
INSERT INTO animal VALUES('D001','포메라니안',5,'2019-03-15',NULL);
SELECT * FROM member;
INSERT INTO member VALUES('apple','김사과','서울시 강남구 역삼동','01012341234','돈이 굉장히 많음. 상속만 10조를 받은듯 함');
SELECT * FROM list;

#동물 한마리의 나이 한살 더 올리기
UPDATE animal SET age = age+1 WHERE code = 'D001';
#동물을 입양해간 member 한명 탈퇴시키기
INSERT INTO list VALUES(1,'apple','D001');

DELETE FROM list WHERE num = 1;
DELETE FROM member WHERE id = 'apple';

USE world;
SELECT * FROM city;
SELECT * FROM country;
SELECT * FROM countrylanguage;

#country 테이블
#소속 대륙(Continent)이 Asia인 나라들(*) 검색
SELECT * FROM country WHERE continent = 'Asia';
#소속 대륙이 Europe이 아닌 나라의 이름과 GNP 검색
SELECT name,gnp FROM country WHERE continent <> 'Europe';
#인구수(Population)가 1000만 이하인 나라 검색
SELECT * FROM country WHERE population <= 10000000;
#인구수가 7000만 이상인 나라 검색
SELECT * FROM country WHERE population >= 70000000;
#인구수는 4500만 이상이면서 넓이(SurfaceArea)가 10만제곱km 이하인 나라 검색
SELECT * FROM country WHERE population>=45000000 AND surfacearea <=100000;
#소속 대륙은 Asia이고 건국연도(IndepYear)가 1948인 나라 검색
SELECT * FROM country WHERE continent = 'Asia' AND indepyear = 1948;
#지역(Region)이 동아프리카 이고 건국연도가 1970~1980인 나라 검색
SELECT * FROM country WHERE region = 'Eastern Africa' AND indepyear BETWEEN 1970 AND 1980;

#DUAL : 간단한 연산, 간단한 값들을 검색하기 위한 1행짜리 내장 테이블
SELECT NOW() FROM DUAL;
#AS(ALIAS) : 별칭
SELECT 1+2*37/124-117+0.144*7 AS RESULT FROM dual;
SELECT 1+2*37/124-117+0.144*7 AS "RE SULT" FROM dual;





