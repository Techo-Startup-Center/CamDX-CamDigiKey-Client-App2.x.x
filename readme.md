How to recompile and run CamDigiKey client app

How to run:
1. Install JDK 17 for compilation
2. chmod +x mvnw && source .env
3. Compile and package project: ./mvnw clean package
4. Run jar in folder target: java -jar app-2.0.0.jar
5. Test your application on port: 9005
6. Enjoy!

How to run in docker:
1. Install JDK 17 for compilation
2. Run chmod +x mvnw
3. Run cmmod +x deploy.sh
4. Run the ./deploy.sh scrip
5. Run container from image in your docker engine port: 9005
6. Enjoy!
