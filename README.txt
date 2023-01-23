# hello-spring

sudo apt update
sudo apt-get install -y openjdk-17-jdk maven

mvn clean install
docker build --tag hellospring .
docker run -it -p 80:8080 -d hellospring
