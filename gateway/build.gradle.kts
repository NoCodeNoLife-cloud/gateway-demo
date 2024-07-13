plugins {
    id("java")
}

group = "org.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-gateway
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:4.1.3")

    // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-netflix-eureka-client
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.1.1")
    // https://mvnrepository.com/artifact/com.google.code.gson/gson
    implementation("com.google.code.gson:gson:2.10.1")

    // https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-loadbalancer
    implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer:4.1.4")
}

tasks.test {
    useJUnitPlatform()
}