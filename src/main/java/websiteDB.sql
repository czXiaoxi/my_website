create TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) not NULL,
  password varchar(20) not null, 
  `address` varchar(200) not NULL,
  phone_number varchar(20)not null,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


create TABLE `estore` (
  `goods_id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(50) not NULL,
  category varchar(20) not null, 
  `describe` varchar(200) not NULL,
  price double not null,
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

create TABLE `shopping_cart` (
  `user_id` int(11) NOT NULL,
  `goods_id` varchar(50) not NULL,
  goods_name varchar(50) not NULL, 
  `count` int not NULL,
  price double not null,
  total_price double not null
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

