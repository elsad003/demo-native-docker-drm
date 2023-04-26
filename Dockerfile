FROM bellsoft/liberica-native-image-kit-container:jdk-17-nik-22.3-musl

WORKDIR /application

EXPOSE 8080

COPY . .

RUN ./mvnw -Pnative native:compile

ENTRYPOINT ./target/demo-native-docker