# 서브쿼리 사용 
SELECT i.id AS id, n.fish_name AS fish_name, i.length AS length
FROM fish_info i
JOIN fish_name_info n ON i.fish_type = n.fish_type
JOIN(
    SELECT fish_type, MAX(length) AS length
    FROM fish_info
    GROUP BY fish_type
)AS max_lengths ON i.fish_type = max_lengths.fish_type 
                AND i.length = max_lengths.length;

