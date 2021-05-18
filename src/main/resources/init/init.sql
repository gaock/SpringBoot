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
# 交易信号
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

# 账户盈余信息
create table acct_info(
	date date primary key not null,
    total_money varchar(50),
    tic_money varchar(50),
    cash varchar(50)
)
