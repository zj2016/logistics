CREATE DATABASE logistics;

USE logistics;

CREATE TABLE admin (
  id int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) NOT NULL COMMENT '登录名',
  password varchar(32) NOT NULL COMMENT '登录密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员表';


CREATE TABLE orderinfo (
  id int(11) NOT NULL AUTO_INCREMENT,
  o_id varchar(32) NOT NULL COMMENT '订单编号',
  j_name varchar(200) NOT NULL COMMENT '寄件人',
  j_phone varchar(11) not null COMMENT '寄件人手机号',
  j_addr varchar(200) not null COMMENT '寄件人地址',
  s_name varchar(200) not null COMMENT '收件人',
  s_phone varchar(11) not null COMMENT '收件人手机号',
  s_addr varchar(200) not null COMMENT '收件人地址',
  w_desc varchar(200) comment '物品描述',
  w_type varchar(200) comment '物品类型',
  w_weight int not null default 1 comment '物品重量kg',
  w_bulk int not null default 1 comment '物品体积',
  y_type varchar(200) not null comment '运送类型',
  price int not null comment '运费',
  status int default 0 comment '状态',
  create_time int not null comment '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='订单信息';


CREATE TABLE way (
  id int(11) NOT NULL AUTO_INCREMENT,
  w_no varchar(50) not null comment '路线编号',
  addr varchar(100) not null comment '地址',
  create_time int not null comment '创建时间',
  o_id varchar(32) NOT NULL COMMENT '订单编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='路线信息';

CREATE TABLE tools (
  id int(11) NOT NULL AUTO_INCREMENT,
  t_no varchar(32) NOT NULL COMMENT '工具编号',
  y_type varchar(200) not null comment '运送类型',
  num int not null default 1 comment '数量',
  max_weight int not null comment '最大重量',
  max_bulk int not null comment '最大体积',
  img varchar(1000) comment '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='运输工具信息';

CREATE TABLE goods (
  id int(11) NOT NULL AUTO_INCREMENT,
  w_type varchar(200) NOT NULL COMMENT '物品类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='物品类型';

