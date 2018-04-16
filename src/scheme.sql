DROP TABLE IF EXISTS `Orders`;

create table `Orders` (
	o_id INT(20) NOT NULL AUTO_INCREMENT
	COMMENT 'id',
	order_date DATETIME NOT NULL
	COMMENT 'date',
	order_price DECIMAL(10,2) DEFAULT NULL
	comment 'price',
	customer VARCHAR(32) NOT NULL
	comment 'customer',
	primary key `o_id`(`o_id`)
)
comment 'orders';

DROP TABLE IF EXISTS `students`;
create table `students` (
	id INT(20) NOT NULL AUTO_INCREMENT
	COMMENT 'id',
	user_name varchar(32) NOT NULL
	COMMENT 'user_name',
	course varchar(32) not NULL
	comment 'course',
	score VARCHAR(32) default NULL
	comment 'score',
	primary key `id`(`id`)
)
comment 'students';