-- 코드를 입력하세요
-- 아픈 동물의 아이디와 이름을 조회하는 SQL 문 작성 

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick';