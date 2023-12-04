-- 코드를 입력하세요
-- 동일한 날짜, 회원 ID, 상품 ID 조합에 대해서는 하나의 판매 데이터만 존재합니다.
-- ➡️ 중복제거 DISTINCT
SELECT YEAR(SALES_DATE) AS YEAR,MONTH(SALES_DATE) AS MONTH,
GENDER,COUNT(DISTINCT A.USER_ID) AS USERS
FROM ONLINE_SALE A
JOIN USER_INFO B ON A.USER_ID = B.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR(SALES_DATE),MONTH(SALES_DATE),GENDER
ORDER BY YEAR(SALES_DATE),MONTH(SALES_DATE),GENDER;

# SELECT 절:

# YEAR(SALES_DATE) AS YEAR: SALES_DATE 열에서 연도를 추출하고 "YEAR"라는 별칭을 부여합니다.
# MONTH(SALES_DATE) AS MONTH: SALES_DATE 열에서 월을 추출하고 "MONTH"라는 별칭을 부여합니다.
# GENDER: 사용자의 성별 정보를 나타냅니다.
# COUNT(DISTINCT A.USER_ID) AS USERS: 고유 사용자 수를 계산하여 "USERS"라는 별칭을 부여합니다.
# FROM 절:

# ONLINE_SALE A: "ONLINE_SALE" 테이블을 "A"라는 별칭으로 지정합니다.
# USER_INFO B: "USER_INFO" 테이블을 "B"라는 별칭으로 지정합니다.
# JOIN USER_ID = B.USER_ID: "A" 테이블의 USER_ID와 "B" 테이블의 USER_ID를 기준으로 두 테이블을 결합합니다.
# WHERE 절:

# GENDER IS NOT NULL: 성별 정보가 있는 경우에 해당하는 행만 선택합니다.
# GROUP BY 절:

# GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER: 연도, 월 및 성별에 따라 데이터를 그룹화합니다.
# ORDER BY 절:

# ORDER BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER: 연도, 월, 성별 순서로 결과를 정렬합니다.