-- 코드를 입력하세요
# SHIPMENT_ID -> 출하번호
# FLAVOR -> 맛
# TOTAL_ORDER -> 상반기 아이스크림 총 주문량 
# 총 주문량을 기준으로 내림차순 정렬 총주문량이 같다면 출하 번호를 기준으로 오름차순 정렬하는 조회 
SELECT flavor 
from first_half
order by total_order desc ,shipment_id asc;