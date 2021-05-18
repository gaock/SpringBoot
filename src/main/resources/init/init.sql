show databases;
use share;
show tables;

# 盈利表
create table earn_info(
	date date primary key not null,
	earn_rate varchar(50) not null,
    hs_300 varchar(50) not null,
    comp_rate varchar(50) not null,
    used_rate varchar(50) not null
);

insert into earn_info(date, earn_rate, hs_300, comp_rate, used_rate)
values('2021-5-18', '0.03', '-0.01', '0.04', '0.99');

select * from earn_info;


# 最近最优表
create table last_best_tic_info(
	id int primary key auto_increment,
    t_id varchar(50),
    name varchar(200),
    buy_price varchar(50),
    sold_pric varchar(50),
    earn_rate varchar(50),
    used_date int
);

insert into last_best_tic_info(t_id, name,buy_price , sold_pric, earn_rate, used_date)
values('sz0002123', '测试xxxxxxx有限公司', '12.23', '14.15', '0.14', 3);
select * from last_best_tic_info;


create table tran_sig(
	id int primary key auto_increment,
    date date,
    t_id varchar(50),
    name varchar(200),
    op varchar(10) ,
    num int,
    simple_price varchar(50),
    really_price varchar(50),
    tran_earn varchar(50),
    mid_money varchar(50)
);
insert into tran_sig(date, t_id, name, op , num, simple_price, really_price, tran_earn, mid_money)
values('2021-05-18', 'sz00002121', '测试***8sdasdsa', '买' ,'1000000', '14.41', '14.21', '', '10');
select * from tran_sig;


create table acct_info(
	date date primary key not null,
    total_money varchar(50),
    tic_money varchar(50),
    cash varchar(50)
);
insert into acct_info(date, total_money, tic_money, cash)
values('2021-05-18', '1231321.21', '10213.31', '111111');
select * from acct_info;


