SELECT user_id, concat(upper(LEFT(name,1)), lower(right(name, length(name)-1))) as name
from users 
 order by user_id;