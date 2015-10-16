create table cloneProperties (
	id identity,
	srcIndexName varchar(30) not null,
	dstIndexName varchar(50) not null,
	dstHostName varchar(13),
	dstHostUserName varchar(30)
);