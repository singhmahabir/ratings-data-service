# ratings-data-service
ratings-data-service
	input -> userId
	output -> bookId's with rating and comment of users

exposed the url below

GET localhost:9093/ratings/{userId}
POST localhost:9093/ratings/user


"data.sql" which is available in src/main/resources will exucuted at the time of deployment 
here name must be same as data.sql

insert into User
values(hibernate_sequence.NEXTVAL,'1234','Good book for java ',4, 'msdeo4u');

insert into User
values(hibernate_sequence.NEXTVAL,'2345','Average book ',3, 'msdeo4u');

POST Body 
{
	"userId": "msdeo",
	"bookId": "1234",
    "rating": 3,
    "comment": "Average book"
}
