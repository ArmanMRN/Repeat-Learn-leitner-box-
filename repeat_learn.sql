create database if not exists repeat_learn;

create table if not exists repeat_learn.words(
id integer primary key auto_increment,
word varchar(250),
meaning text,
repeat_level enum('0','1','2','3','4','5') not null,
enter_time integer,
next_repeat_time integer,
is_finished boolean);
