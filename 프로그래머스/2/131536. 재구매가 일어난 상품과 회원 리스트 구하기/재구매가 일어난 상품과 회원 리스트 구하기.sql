-- 코드를 입력하세요
# 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여 , 재구매한 회원 id와 재구매한 상품 id를 출력 
# 회원 Id를 기준으로 오름차순 정렬 
# 회원 id가 같다면 상품 id를 기준으로 내림차순 정렬
SELECT DISTINCT
    user_id,
    product_id
FROM
    online_sale
WHERE
    (user_id, product_id) IN (
        SELECT
            user_id,
            product_id
        FROM
            online_sale
        GROUP BY
            user_id,
            product_id
        HAVING
            COUNT(*) > 1
    )
ORDER BY
    user_id ASC, product_id DESC;



