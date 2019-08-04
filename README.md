
This repository contains an example of using SpringBoot java framework with a RESTful api

You can test the project using the following requests in Postman or any similar tool:


1-
POST http://localhost:8080/register/student
Body:
{
	"name" : "ali",
	"age" : 1288,
	"registrationNumber" : "11101"
}

2-
GET http://localhost:8080/student/allstudent

	3-
PUT http://localhost:8080/update/student
Body:
{
	"name" : "ali",
	"age" : 1288,
	"registrationNumber" : "11101"
}
4-
Post http://localhost:8080/register/student
Body:
{
	"name" : "Hussain",
	"age" : 111,
	"registrationNumber" : "120"
}
5- 
Delete http://localhost:8080/delete/student
	Body:
	{
	"name" : "Hussain",
	"age" : 111,
	"registrationNumber" : "120"
}









