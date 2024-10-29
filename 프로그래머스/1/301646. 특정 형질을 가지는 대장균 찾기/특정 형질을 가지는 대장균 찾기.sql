-- 코드를 작성해주세요
-- 테이블: ECOLI_DATA
-- 컬럼: ID(대장균 개체의 ID), PARENT_ID(부모 개체의 ID), SIZE_OF_COLONY(분화되어 나온 날짜),
-- DIFFERENTATION_DATE(분화되어 나온 날짜), GENOTYPE(개체의 형질)
-- 최초의 PARENT_ID IS NULL

SELECT COUNT(ID) as COUNT
FROM ECOLI_DATA
WHERE BIN(GENOTYPE) LIKE '%101' OR BIN(GENOTYPE) LIKE '%100' OR BIN(GENOTYPE) LIKE '%001' OR BIN(GENOTYPE) = 1

-- 최적 연산
-- & 연산자: 비트 단위 AND 연산
-- 2(10)와 & 연산한 것이 2가 아님 => 즉, 두 번째 비트가 설정되지 않은 경우에만 참
-- 5(101)와 & 연산한 것이 0이 아님 => 즉, 첫 번째 비트나 세 번째 비트가 설정된 경우에만 참
SELECT COUNT(*) COUNT
FROM ECOLI_DATA
WHERE GENOTYPE & 2 != 2 AND GENOTYPE & 5 != 0
