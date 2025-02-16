SELECT COUNT(*) FISH_COUNT, CAST(SUBSTRING(TIME, 6, 2) 
AS UNSIGNED) MONTH 
FROM FISH_INFO
GROUP BY CAST(SUBSTRING(TIME, 6, 2) AS UNSIGNED)
ORDER BY MONTH ASC