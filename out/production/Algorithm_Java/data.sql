insert into `Orders`(`order_date`,`order_price`,`customer`) values ('2008-12-29 21:12:56','1000','Bush');
insert into `Orders`(`order_date`,`order_price`,`customer`) values ('2008-11-23 21:12:56','1600','Carter');
insert into `Orders`(`order_date`,`order_price`,`customer`) values ('2008-10-05 21:12:56','700','Bush');
insert into `Orders`(`order_date`,`order_price`,`customer`) values ('2008-09-18 21:12:56','300','Bush');
insert into `Orders`(`order_date`,`order_price`,`customer`) values ('2008-08-06 21:12:56','2000','Adams');
insert into `Orders`(`order_date`,`order_price`,`customer`) values ('2008-07-21 21:12:56','100','Carter');





LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;

INSERT INTO `students` (`id`, `user_name`, `course`, `score`)
VALUES
	(1,'a','chinese','you'),
	(2,'a','math','liang'),
	(3,'a','english',NULL),
	(4,'b','chinese',NULL),
	(5,'b','math','jige'),
	(6,'b','english','you'),
	(7,'c','chiese','you'),
	(8,'c','math','liang'),
	(9,'c','english','you');

/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
