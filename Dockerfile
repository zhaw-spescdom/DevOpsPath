FROM azul/zulu-openjdk:14
RUN apt-get update && apt-get install -y curl \
  && curl -sL https://deb.nodesource.com/setup_14.x | bash - \
  && apt-get install -y nodejs \
  && curl -L https://www.npmjs.com/install.sh | sh

WORKDIR /usr/src/app

COPY . .

RUN cd frontend && npm install
RUN cd backend && chmod +x gradlew
RUN cd backend && ./gradlew test

EXPOSE 4200
CMD [ "java", "-Xmx300m -Xms300m -Xmn20m -Xss256k -XX:MaxMetaspaceSize=120m -XX:MaxDirectMemorySize=5m -Dfile.encoding=UTF-8 -cp backend/build/libs/devops-all.jar ch.zhaw.iwi.devops.Main" ]