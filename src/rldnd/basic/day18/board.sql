create table board (
bdno int auto_increment,
title varchar(100) not null,
userid varchar(18) not null,
regdate datetime default current_timestamp,
views int default 0,
thumbup int default 0,
contents text,
primary key(bdno)
);

insert into board (title, userid, contents)
values ('제곧내~ 제곧내~','파이썬러버','아잉~ 냉무~');

select bdno, title, userid, mid(regdate,1,10), views, thumbup from board
order by bdno desc;

select * from board
where bdno = 5;
