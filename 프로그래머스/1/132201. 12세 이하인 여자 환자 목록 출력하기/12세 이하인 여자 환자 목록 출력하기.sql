-- 코드를 입력하세요
# 12세 이하인 여자환자의 환자 이름, 환자 번호, 성별코드, 나이 , 전화번호를 조회 
# 전화번호가 없는 경우 'NONE' 출력
# 나이를 기준으로 내림차순 정렬, 나이가 같다면 환자 이름을 기준으로 오름차순 정렬 
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
FROM PATIENT
WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NO;
