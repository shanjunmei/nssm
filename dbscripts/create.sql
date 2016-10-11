CREATE TABLE `t_user` (
  `f_id` varchar(44) NOT NULL,
  `f_number` varchar(50) DEFAULT NULL,
  `f_name` varchar(50) DEFAULT NULL,
  `f_create_time` datetime DEFAULT NULL,
  `f_last_modify_time` datetime DEFAULT NULL,
  PRIMARY KEY (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
