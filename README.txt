# hello-spring

sudo apt update
sudo apt-get install -y openjdk-17-jdk maven git

git clone https://github.com/Jaibw/hello-spring.git
cd hello-spring/

mvn clean install
docker build --tag hellospring .
docker run -it -p 80:8080 -d hellospring

Try to access http://PublicIP/hello like http://ec2-18-182-66-63.ap-northeast-1.compute.amazonaws.com/hello
