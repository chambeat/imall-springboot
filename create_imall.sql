use imall;

drop table if exists `user`;
create table `user` (
	`id` int(11) primary key auto_increment comment '用户ID',
	`name` nvarchar(50) comment '真实姓名',
	`username` varchar(20) comment '帐号',
    `password` varchar(20) comment '密码'
);

