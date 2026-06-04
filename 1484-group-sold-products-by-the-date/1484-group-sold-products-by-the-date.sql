select sell_date, 
count(distinct product) as num_sold,
GROUP_CONCAT(DISTINCT PRODUCT ORDER BY product ) as products
from Activities
GROUP BY sell_date
ORDER BY sell_date;
