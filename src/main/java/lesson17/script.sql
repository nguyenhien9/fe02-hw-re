-- execise 3
USE ronin_test;
SELECT * FROM products
WHERE category IN ('Công cụ', 'Thiết bị điện', 'Phụ kiện');

SELECT * FROM users
WHERE fullname LIKE 'a%';

SELECT COUNT(*) as status
FROM users
WHERE status = 'active';

SELECT COUNT(*) as stock
FROM products
WHERE stock <= 0;


SELECT name, price
FROM products
ORDER BY price DESC
LIMIT 10;


