import org.springframework.cloud.contract.verifier.config.TestMode

plugins {
	id("org.springframework.boot") version "3.3.2"
	id("io.spring.dependency-management") version "1.1.6"
	id("com.netflix.dgs.codegen") version "6.2.1"
	id("org.hibernate.orm") version "6.5.2.Final"
	id("org.graalvm.buildtools.native") version "0.10.2"
	id("org.cyclonedx.bom") version "1.8.2"
	id("org.springframework.cloud.contract") version "4.1.4"
	id("org.asciidoctor.jvm.convert") version "3.3.2"
	id("com.vaadin") version "24.4.6"
	kotlin("plugin.jpa") version "1.9.24"
	kotlin("jvm") version "1.9.24"
	kotlin("plugin.spring") version "1.9.24"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

extra["snippetsDir"] = file("build/generated-snippets")
extra["netflixDgsVersion"] = "9.0.0"
extra["solaceSpringCloudVersion"] = "4.1.0"
extra["springAiVersion"] = "1.0.0-M1"
extra["springBootAdminVersion"] = "3.3.2"
extra["springCloudAzureVersion"] = "5.14.0"
extra["springCloudServicesVersion"] = "4.1.3"
extra["springCloudVersion"] = "2023.0.3"
extra["springModulithVersion"] = "1.2.1"
extra["springShellVersion"] = "3.3.1"
extra["timefoldSolverVersion"] = "1.12.0"
extra["vaadinVersion"] = "24.4.6"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-activemq")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-amqp")
	implementation("org.springframework.boot:spring-boot-starter-artemis")
	implementation("org.springframework.boot:spring-boot-starter-batch")
	implementation("org.springframework.boot:spring-boot-starter-cache")
	implementation("org.springframework.boot:spring-boot-starter-data-cassandra")
	implementation("org.springframework.boot:spring-boot-starter-data-cassandra-reactive")
	implementation("org.springframework.boot:spring-boot-starter-data-couchbase")
	implementation("org.springframework.boot:spring-boot-starter-data-couchbase-reactive")
	implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch")
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-data-ldap")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
	implementation("org.springframework.boot:spring-boot-starter-data-neo4j")
	implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
	implementation("org.springframework.boot:spring-boot-starter-data-redis")
	implementation("org.springframework.boot:spring-boot-starter-data-redis-reactive")
	implementation("org.springframework.boot:spring-boot-starter-data-rest")
	implementation("org.springframework.boot:spring-boot-starter-freemarker")
	implementation("org.springframework.boot:spring-boot-starter-graphql")
	implementation("org.springframework.boot:spring-boot-starter-groovy-templates")
	implementation("org.springframework.boot:spring-boot-starter-hateoas")
	implementation("org.springframework.boot:spring-boot-starter-integration")
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-jersey")
	implementation("org.springframework.boot:spring-boot-starter-jooq")
	implementation("org.springframework.boot:spring-boot-starter-mail")
	implementation("org.springframework.boot:spring-boot-starter-mustache")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-authorization-server")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
	implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
	implementation("org.springframework.boot:spring-boot-starter-pulsar")
	implementation("org.springframework.boot:spring-boot-starter-pulsar-reactive")
	implementation("org.springframework.boot:spring-boot-starter-quartz")
	implementation("org.springframework.boot:spring-boot-starter-rsocket")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-web-services")
	implementation("org.springframework.boot:spring-boot-starter-webflux")
	implementation("org.springframework.boot:spring-boot-starter-websocket")
	implementation("ai.timefold.solver:timefold-solver-spring-boot-starter")
	implementation("com.azure.spring:spring-cloud-azure-starter")
	implementation("com.azure.spring:spring-cloud-azure-starter-active-directory")
	implementation("com.azure.spring:spring-cloud-azure-starter-actuator")
	implementation("com.azure.spring:spring-cloud-azure-starter-data-cosmos")
	implementation("com.azure.spring:spring-cloud-azure-starter-integration-storage-queue")
	implementation("com.azure.spring:spring-cloud-azure-starter-jdbc-mysql")
	implementation("com.azure.spring:spring-cloud-azure-starter-jdbc-postgresql")
	implementation("com.azure.spring:spring-cloud-azure-starter-keyvault")
	implementation("com.azure.spring:spring-cloud-azure-starter-storage")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("com.netflix.graphql.dgs:graphql-dgs-spring-graphql-starter")
	implementation("com.okta.spring:okta-spring-boot-starter:3.0.7")
	implementation("com.solace.spring.cloud:spring-cloud-starter-stream-solace")
	implementation("com.vaadin:vaadin-spring-boot-starter")
	implementation("de.codecentric:spring-boot-admin-starter-client")
	implementation("de.codecentric:spring-boot-admin-starter-server")
	implementation("io.micrometer:micrometer-registry-wavefront")
	implementation("io.micrometer:micrometer-tracing-bridge-brave")
	implementation("io.pivotal.spring.cloud:spring-cloud-services-starter-config-client")
	implementation("io.pivotal.spring.cloud:spring-cloud-services-starter-service-registry")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
	implementation("io.zipkin.reporter2:zipkin-reporter-brave")
	implementation("org.apache.kafka:kafka-streams")
	implementation("org.flywaydb:flyway-core")
	implementation("org.flywaydb:flyway-database-db2")
	implementation("org.flywaydb:flyway-database-derby")
	implementation("org.flywaydb:flyway-database-hsqldb")
	implementation("org.flywaydb:flyway-database-oracle")
	implementation("org.flywaydb:flyway-database-postgresql")
	implementation("org.flywaydb:flyway-mysql")
	implementation("org.flywaydb:flyway-sqlserver")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
	implementation("org.liquibase:liquibase-core")
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3")
	implementation("org.springframework.ai:spring-ai-azure-openai-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-azure-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-bedrock-ai-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-chroma-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-milvus-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-mistral-ai-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-mongodb-atlas-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-neo4j-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-ollama-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-openai-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-pgvector-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-pinecone-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-postgresml-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-qdrant-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-redis-store-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-stability-ai-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-transformers-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-vertex-ai-gemini-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-vertex-ai-palm2-spring-boot-starter")
	implementation("org.springframework.ai:spring-ai-weaviate-store-spring-boot-starter")
	implementation("org.springframework.amqp:spring-rabbit-stream")
	implementation("org.springframework.cloud:spring-cloud-bus")
	implementation("org.springframework.cloud:spring-cloud-config-server")
	implementation("org.springframework.cloud:spring-cloud-function-web")
	implementation("org.springframework.cloud:spring-cloud-starter")
	implementation("org.springframework.cloud:spring-cloud-starter-circuitbreaker-reactor-resilience4j")
	implementation("org.springframework.cloud:spring-cloud-starter-config")
	implementation("org.springframework.cloud:spring-cloud-starter-consul-config")
	implementation("org.springframework.cloud:spring-cloud-starter-consul-discovery")
	implementation("org.springframework.cloud:spring-cloud-starter-gateway")
	implementation("org.springframework.cloud:spring-cloud-starter-gateway-mvc")
	implementation("org.springframework.cloud:spring-cloud-starter-loadbalancer")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")
	implementation("org.springframework.cloud:spring-cloud-starter-openfeign")
	implementation("org.springframework.cloud:spring-cloud-starter-task")
	implementation("org.springframework.cloud:spring-cloud-starter-vault-config")
	implementation("org.springframework.cloud:spring-cloud-starter-zookeeper-config")
	implementation("org.springframework.cloud:spring-cloud-starter-zookeeper-discovery")
	implementation("org.springframework.cloud:spring-cloud-stream")
	implementation("org.springframework.cloud:spring-cloud-stream-binder-kafka")
	implementation("org.springframework.cloud:spring-cloud-stream-binder-kafka-streams")
	implementation("org.springframework.cloud:spring-cloud-stream-binder-pulsar")
	implementation("org.springframework.cloud:spring-cloud-stream-binder-rabbit")
	implementation("org.springframework.data:spring-data-rest-hal-explorer")
	implementation("org.springframework.integration:spring-integration-amqp")
	implementation("org.springframework.integration:spring-integration-http")
	implementation("org.springframework.integration:spring-integration-jdbc")
	implementation("org.springframework.integration:spring-integration-jms")
	implementation("org.springframework.integration:spring-integration-jpa")
	implementation("org.springframework.integration:spring-integration-kafka")
	implementation("org.springframework.integration:spring-integration-mail")
	implementation("org.springframework.integration:spring-integration-mongodb")
	implementation("org.springframework.integration:spring-integration-r2dbc")
	implementation("org.springframework.integration:spring-integration-redis")
	implementation("org.springframework.integration:spring-integration-rsocket")
	implementation("org.springframework.integration:spring-integration-security")
	implementation("org.springframework.integration:spring-integration-stomp")
	implementation("org.springframework.integration:spring-integration-webflux")
	implementation("org.springframework.integration:spring-integration-websocket")
	implementation("org.springframework.integration:spring-integration-ws")
	implementation("org.springframework.kafka:spring-kafka")
	implementation("org.springframework.modulith:spring-modulith-events-api")
	implementation("org.springframework.modulith:spring-modulith-starter-core")
	implementation("org.springframework.modulith:spring-modulith-starter-jdbc")
	implementation("org.springframework.modulith:spring-modulith-starter-jpa")
	implementation("org.springframework.modulith:spring-modulith-starter-mongodb")
	implementation("org.springframework.security:spring-security-messaging")
	implementation("org.springframework.security:spring-security-rsocket")
	implementation("org.springframework.session:spring-session-data-redis")
	implementation("org.springframework.session:spring-session-jdbc")
	implementation("org.springframework.shell:spring-shell-starter")
	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	developmentOnly("org.springframework.boot:spring-boot-docker-compose")
	runtimeOnly("com.h2database:h2")
	runtimeOnly("com.ibm.db2:jcc")
	runtimeOnly("com.microsoft.sqlserver:mssql-jdbc")
	runtimeOnly("com.mysql:mysql-connector-j")
	runtimeOnly("com.oracle.database.jdbc:ojdbc11")
	runtimeOnly("com.oracle.database.r2dbc:oracle-r2dbc")
	runtimeOnly("io.asyncer:r2dbc-mysql")
	runtimeOnly("io.micrometer:micrometer-registry-datadog")
	runtimeOnly("io.micrometer:micrometer-registry-dynatrace")
	runtimeOnly("io.micrometer:micrometer-registry-graphite")
	runtimeOnly("io.micrometer:micrometer-registry-influx")
	runtimeOnly("io.micrometer:micrometer-registry-new-relic")
	runtimeOnly("io.micrometer:micrometer-registry-prometheus")
	runtimeOnly("io.micrometer:micrometer-tracing-reporter-wavefront")
	runtimeOnly("io.r2dbc:r2dbc-h2")
	runtimeOnly("io.r2dbc:r2dbc-mssql:1.0.0.RELEASE")
	runtimeOnly("org.apache.derby:derby")
	runtimeOnly("org.apache.derby:derbytools")
	runtimeOnly("org.hsqldb:hsqldb")
	runtimeOnly("org.mariadb:r2dbc-mariadb:1.1.3")
	runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
	runtimeOnly("org.postgresql:postgresql")
	runtimeOnly("org.postgresql:r2dbc-postgresql")
	runtimeOnly("org.springframework.modulith:spring-modulith-actuator")
	runtimeOnly("org.springframework.modulith:spring-modulith-events-jms")
	runtimeOnly("org.springframework.modulith:spring-modulith-observability")
	annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.boot:spring-boot-testcontainers")
	testImplementation("com.unboundid:unboundid-ldapsdk")
	testImplementation("io.projectreactor:reactor-test")
	testImplementation("io.rest-assured:spring-web-test-client")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testImplementation("org.mybatis.spring.boot:mybatis-spring-boot-starter-test:3.0.3")
	testImplementation("org.springframework.amqp:spring-rabbit-test")
	testImplementation("org.springframework.batch:spring-batch-test")
	testImplementation("org.springframework.cloud:spring-cloud-starter-contract-stub-runner")
	testImplementation("org.springframework.cloud:spring-cloud-starter-contract-verifier")
	testImplementation("org.springframework.cloud:spring-cloud-stream-test-binder")
	testImplementation("org.springframework.graphql:spring-graphql-test")
	testImplementation("org.springframework.integration:spring-integration-test")
	testImplementation("org.springframework.kafka:spring-kafka-test")
	testImplementation("org.springframework.modulith:spring-modulith-starter-test")
	testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
	testImplementation("org.springframework.security:spring-security-test")
	testImplementation("org.springframework.shell:spring-shell-starter-test")
	testImplementation("org.testcontainers:activemq")
	testImplementation("org.testcontainers:cassandra")
	testImplementation("org.testcontainers:consul")
	testImplementation("org.testcontainers:couchbase")
	testImplementation("org.testcontainers:db2")
	testImplementation("org.testcontainers:elasticsearch")
	testImplementation("org.testcontainers:junit-jupiter")
	testImplementation("org.testcontainers:kafka")
	testImplementation("org.testcontainers:mariadb")
	testImplementation("org.testcontainers:mongodb")
	testImplementation("org.testcontainers:mssqlserver")
	testImplementation("org.testcontainers:mysql")
	testImplementation("org.testcontainers:neo4j")
	testImplementation("org.testcontainers:oracle-free")
	testImplementation("org.testcontainers:postgresql")
	testImplementation("org.testcontainers:pulsar")
	testImplementation("org.testcontainers:r2dbc")
	testImplementation("org.testcontainers:rabbitmq")
	testImplementation("org.testcontainers:vault")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

dependencyManagement {
	imports {
		mavenBom("com.solace.spring.cloud:solace-spring-cloud-bom:${property("solaceSpringCloudVersion")}")
		mavenBom("org.springframework.modulith:spring-modulith-bom:${property("springModulithVersion")}")
		mavenBom("com.vaadin:vaadin-bom:${property("vaadinVersion")}")
		mavenBom("com.netflix.graphql.dgs:graphql-dgs-platform-dependencies:${property("netflixDgsVersion")}")
		mavenBom("org.springframework.shell:spring-shell-dependencies:${property("springShellVersion")}")
		mavenBom("de.codecentric:spring-boot-admin-dependencies:${property("springBootAdminVersion")}")
		mavenBom("io.pivotal.spring.cloud:spring-cloud-services-dependencies:${property("springCloudServicesVersion")}")
		mavenBom("com.azure.spring:spring-cloud-azure-dependencies:${property("springCloudAzureVersion")}")
		mavenBom("org.springframework.ai:spring-ai-bom:${property("springAiVersion")}")
		mavenBom("ai.timefold.solver:timefold-solver-bom:${property("timefoldSolverVersion")}")
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

tasks.generateJava {
	schemaPaths.add("${projectDir}/src/main/resources/graphql-client")
	packageName = "com.example.demo.codegen"
	generateClient = true
}

hibernate {
	enhancement {
		enableAssociationManagement = true
	}
}

contracts {
	testMode = TestMode.WEBTESTCLIENT
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.contractTest {
	useJUnitPlatform()
}

tasks.test {
	outputs.dir(project.extra["snippetsDir"]!!)
}

tasks.asciidoctor {
	inputs.dir(project.extra["snippetsDir"]!!)
	dependsOn(tasks.test)
}
