USE sakila;
#SUB QUERY : SQL문 내부에 SQL문을 선언
#FROM		: INLINE VIEW
#SELECT		: SCALAR
#WHERE		: SUB QUERY

SELECT * FROM country WHERE country_id = 107;
SELECT * FROM city WHERE country_id = 107;
SELECT country_id FROM city WHERE city = 'Aden';

SELECT 
	(SELECT country FROM country WHERE country_id = (SELECT country_id FROM city WHERE city = 'Aden')) country,
    city
FROM city WHERE country_id =(SELECT country_id FROM city WHERE city = 'Aden');

USE world;
SELECT * FROM country;
SELECT AVG(population) FROM country;
SELECT region 지역, AVG(population) "지역별 평균인구",
(SELECT AVG(population) FROM country) "전체 평균인구"
FROM country GROUP BY region;

#LIMIT
#LIMIT 줄번호,뽑아올개수
SELECT * FROM country ORDER BY code desc LIMIT 10,10;

USE testworld;
SELECT * FROM test;
SELECT NOW() FROM dual;

SELECT intdata FROM test WHERE strdata='apple' ORDER BY intdata LIMIT 1,100;

CREATE TABLE USER(
	userid VARCHAR(300),
    userpw VARCHAR(300),
    username VARCHAR(300),
    userage INT,
    userphone VARCHAR(300),
    useraddr VARCHAR(1000),
    CONSTRAINT PRIMARY KEY(userid)
);
SELECT * FROM user;


