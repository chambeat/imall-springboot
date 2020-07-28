use `imall`;

drop table if exists `goods`;

create table `goods`(
	`id` int(11) primary key auto_increment comment '商品ID',
    `g_name` nvarchar(60) comment '商品名称',
    `g_price` double comment '商品价格',
    `g_stock` int(11) comment '商品库存量',
    `g_type` nvarchar(10) comment '商品类型',
    `g_origin` nvarchar(30) comment '产地'
);
