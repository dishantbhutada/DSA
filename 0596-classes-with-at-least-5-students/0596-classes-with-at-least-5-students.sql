SELECT CLASS
FROM COURSES 
GROUP BY class
having count(*)>= 5 ;