CamDigiKey validation micro service is a local micro service.

Requirement:
1. Install JDK
2. Window : mvnw.cmd -pl app -am spring-boot:run 
   Linux: ./mvn -pl app -am spring-boot:run 



**Usage**
Validation JWT request: 
POST http://localhost:9005 
Request object : {"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJFQ0RTQVNIQTUxMiJ9.eyJsYXN0X25hbWVfa2giOiJsYXN0X25hbWVfa2giLCJnZW5kZXIiOiJNIiwiaXNzIjoiQ2FtRFgtQ2FtRGlnaUtleSIsInRlbGVwaG9uZSI6Iis4NTUxMjM0NTY3ODkiLCJwZXJzb25hbF9jb2RlIjoiMTIzNDU2Nzg5MDEyIiwibmJmIjoxNTgyMTg1NDMxODU2LCJmaXJzdF9uYW1lX2VuIjoiZmlyc3RfbmFtZV9lbiIsImRvbWFpbiI6InJlZ2lzdHJhdGlvbnNlcnZpY2VzLmdvdi5raCIsImxhc3RfbmFtZV9lbiI6Imxhc3RfbmFtZV9lbiIsImZpcnN0X25hbWVfa2giOiJmaXJzdF9uYW1lX2toIiwiZXhwIjoxNTgyMTg1NTE4MjU2LCJpYXQiOjE1ODIxODU0MzE4NTYsImVtYWlsIjoidGVzdF9qd3RAY2FtZHguaW8iLCJqdGkiOiIzYmIzOWIwMS0xODEyLTQ3NDMtYWE1YS1jYjRkZTc1YjBlYTQifQ==.MIGHAkIBDSSNvDo1iGw20h0FQG6ELm+0kZHfmYEW57S6IH00RgoporKeMT+h2bRxDhXMUbUI98hh+XubpE84GyKTIIt6HpMCQWnOlEtDu+OD7qAFwL1v+qvaovRJpFkQ4M65Cy3c7KDmSsiWTVyS45vwujCk3+wumAud10wkhKKEQWds0BUwTFGG"}
Response object: true/false
