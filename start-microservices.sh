# JAVA_HOME=SEU_JAVA_HOME

cd infra
docker-compose up -d

cd ../discover
nohup mvn spring-boot:run &

cd ../gateway
nohup mvn spring-boot:run &

cd ../customers
nohup mvn spring-boot:run &

cd ../products
nohup mvn spring-boot:run &

cd ../orders
nohup mvn spring-boot:run &
