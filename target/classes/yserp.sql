/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.5.27 : Database - yserp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yserp` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yserp`;

/*Table structure for table `attribute` */

DROP TABLE IF EXISTS `attribute`;

CREATE TABLE `attribute` (
  `attribute_id` int(11) NOT NULL COMMENT '属性ID',
  `attribute_name` varchar(20) DEFAULT NULL,
  `classify_id` int(11) NOT NULL COMMENT '属性分类ID',
  PRIMARY KEY (`attribute_id`,`classify_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `attribute` */

insert  into `attribute`(`attribute_id`,`attribute_name`,`classify_id`) values (1,'今麦郎',1),(2,'鲁香园酱菜',1),(3,'亚太罐头',1),(3,'饮料',2),(4,'可口可乐',1),(4,'酒类',2),(5,'面品',2);

/*Table structure for table `attribute_classify` */

DROP TABLE IF EXISTS `attribute_classify`;

CREATE TABLE `attribute_classify` (
  `classify_id` int(11) NOT NULL COMMENT '商品属性分类ID',
  `classify_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`classify_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `attribute_classify` */

insert  into `attribute_classify`(`classify_id`,`classify_name`) values (1,'品牌'),(2,'分类');

/*Table structure for table `classification` */

DROP TABLE IF EXISTS `classification`;

CREATE TABLE `classification` (
  `classification_id` int(11) NOT NULL COMMENT '分类ID',
  `classification_name` varchar(30) DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`classification_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `classification` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `department_id` int(11) NOT NULL,
  `department_name` varchar(50) DEFAULT NULL,
  `department_type` int(10) DEFAULT NULL COMMENT '单位类型(0公司1批发2店铺3办事处4供应商)',
  `business_area` int(11) DEFAULT NULL COMMENT '经营面积',
  `contacts` varchar(20) DEFAULT NULL COMMENT '联系人',
  `contacts_tel` varchar(30) DEFAULT NULL COMMENT '联系人电话',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `superior` int(11) DEFAULT NULL COMMENT '上级部门',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `inventory` */

DROP TABLE IF EXISTS `inventory`;

CREATE TABLE `inventory` (
  `warehouse_id` int(11) NOT NULL COMMENT '仓库ID',
  `product_id` int(11) NOT NULL COMMENT '商品ID',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`warehouse_id`,`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `inventory` */

/*Table structure for table `module` */

DROP TABLE IF EXISTS `module`;

CREATE TABLE `module` (
  `module_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '模块id',
  `module_name` varchar(20) DEFAULT NULL COMMENT '模块名称',
  `classification_id` int(11) DEFAULT NULL COMMENT '分类id',
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `module` */

/*Table structure for table `order_info` */

DROP TABLE IF EXISTS `order_info`;

CREATE TABLE `order_info` (
  `order_num` varchar(50) NOT NULL,
  `order_state` varchar(10) DEFAULT NULL,
  `trade_customer` int(11) DEFAULT NULL COMMENT '交易客户',
  `trade_type` int(11) DEFAULT NULL COMMENT '交易类型(10采购收11采购退,20送货21收退货,30零售31零售退货)',
  `entry_user` int(11) DEFAULT NULL COMMENT '录单用户',
  `entry_time` date DEFAULT NULL COMMENT '录单时间',
  `comein_warehouse` int(11) DEFAULT NULL COMMENT '收货仓库',
  PRIMARY KEY (`order_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_info` */

/*Table structure for table `order_item` */

DROP TABLE IF EXISTS `order_item`;

CREATE TABLE `order_item` (
  `order_num` varchar(50) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  `settlementprice` decimal(10,2) DEFAULT NULL COMMENT '结算单价',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `product_line` int(11) DEFAULT NULL COMMENT '行号',
  `subtotal` decimal(10,0) DEFAULT NULL COMMENT '小计',
  PRIMARY KEY (`order_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `order_item` */

/*Table structure for table `position` */

DROP TABLE IF EXISTS `position`;

CREATE TABLE `position` (
  `position_id` int(11) NOT NULL AUTO_INCREMENT,
  `position_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`position_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `position` */

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `product_id` int(11) NOT NULL COMMENT '商品编码',
  `product_name` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `product_retailprice` decimal(10,2) DEFAULT NULL COMMENT '零售价',
  `product_costprice` decimal(10,2) DEFAULT NULL COMMENT '进货价',
  `product_deliveryprice` decimal(10,2) DEFAULT NULL COMMENT '批发价',
  `product_unit` int(10) DEFAULT NULL COMMENT '单位',
  `product_image` varchar(30) DEFAULT NULL COMMENT '图片路径',
  `commodity_group` int(10) DEFAULT NULL COMMENT '商品组',
  `entry_date` date DEFAULT NULL COMMENT '录入时间',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product` */

insert  into `product`(`product_id`,`product_name`,`product_retailprice`,`product_costprice`,`product_deliveryprice`,`product_unit`,`product_image`,`commodity_group`,`entry_date`) values (1,'今麦郎矿泉水','1.00','0.50','0.79',1,'/product/1.jpg',1,'2020-01-09'),(2,'亚太水果罐头','3.00','1.30','1.80',2,'/product/2.jpg',1,'2020-01-09'),(3,'雪碧','1.50','3.00','2.20',2,'/product/3.jpg',1,'2020-01-10');

/*Table structure for table `product_attribute` */

DROP TABLE IF EXISTS `product_attribute`;

CREATE TABLE `product_attribute` (
  `classify_id` int(11) NOT NULL COMMENT '商品属性分类id',
  `product_id` int(11) NOT NULL COMMENT '商品id',
  `attribute_id` int(11) DEFAULT NULL COMMENT '属性id',
  PRIMARY KEY (`classify_id`,`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `product_attribute` */

insert  into `product_attribute`(`classify_id`,`product_id`,`attribute_id`) values (1,1,1),(1,3,4);

/*Table structure for table `unit` */

DROP TABLE IF EXISTS `unit`;

CREATE TABLE `unit` (
  `unit_id` int(11) NOT NULL,
  `unit_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`unit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `unit` */

insert  into `unit`(`unit_id`,`unit_name`) values (1,'瓶'),(2,'箱');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `position` int(11) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `is_departure` varchar(10) DEFAULT NULL COMMENT '是否离职',
  `wx_id` varchar(30) DEFAULT NULL COMMENT '微信',
  `telephone` varchar(30) DEFAULT NULL COMMENT '手机',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

/*Table structure for table `warehouse` */

DROP TABLE IF EXISTS `warehouse`;

CREATE TABLE `warehouse` (
  `warehouse_id` int(11) NOT NULL,
  `warehouse_name` varchar(50) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `warehouse_address` varchar(255) DEFAULT NULL,
  `is_default` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`warehouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `warehouse` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
