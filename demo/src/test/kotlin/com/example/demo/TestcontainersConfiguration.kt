package com.example.demo

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.context.annotation.Bean
import org.testcontainers.activemq.ActiveMQContainer
import org.testcontainers.activemq.ArtemisContainer
import org.testcontainers.containers.CassandraContainer
import org.testcontainers.containers.GenericContainer
import org.testcontainers.containers.KafkaContainer
import org.testcontainers.containers.MSSQLServerContainer
import org.testcontainers.containers.MariaDBContainer
import org.testcontainers.containers.MongoDBContainer
import org.testcontainers.containers.MySQLContainer
import org.testcontainers.containers.Neo4jContainer
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.containers.PulsarContainer
import org.testcontainers.containers.RabbitMQContainer
import org.testcontainers.elasticsearch.ElasticsearchContainer
import org.testcontainers.oracle.OracleContainer
import org.testcontainers.utility.DockerImageName

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

	@Bean
	@ServiceConnection
	fun activemqContainer(): ActiveMQContainer {
		return ActiveMQContainer(DockerImageName.parse("apache/activemq-classic:latest"))
	}

	@Bean
	@ServiceConnection
	fun artemisContainer(): ArtemisContainer {
		return ArtemisContainer(DockerImageName.parse("apache/activemq-artemis:latest"))
	}

	@Bean
	@ServiceConnection
	fun cassandraContainer(): CassandraContainer<*> {
		return CassandraContainer(DockerImageName.parse("cassandra:latest"))
	}

	@Bean
	@ServiceConnection
	fun elasticsearchContainer(): ElasticsearchContainer {
		return ElasticsearchContainer(DockerImageName.parse("docker.elastic.co/elasticsearch/elasticsearch:7.17.10"))
	}

	@Bean
	@ServiceConnection
	fun kafkaContainer(): KafkaContainer {
		return KafkaContainer(DockerImageName.parse("confluentinc/cp-kafka:latest"))
	}

	@Bean
	@ServiceConnection
	fun mariaDbContainer(): MariaDBContainer<*> {
		return MariaDBContainer(DockerImageName.parse("mariadb:latest"))
	}

	@Bean
	@ServiceConnection
	fun mongoDbContainer(): MongoDBContainer {
		return MongoDBContainer(DockerImageName.parse("mongo:latest"))
	}

	@Bean
	@ServiceConnection
	fun mysqlContainer(): MySQLContainer<*> {
		return MySQLContainer(DockerImageName.parse("mysql:latest"))
	}

	@Bean
	@ServiceConnection
	fun neo4jContainer(): Neo4jContainer<*> {
		return Neo4jContainer(DockerImageName.parse("neo4j:latest"))
	}

	@Bean
	@ServiceConnection
	fun oracleFreeContainer(): OracleContainer {
		return OracleContainer(DockerImageName.parse("gvenzl/oracle-free:latest"))
	}

	@Bean
	@ServiceConnection
	fun pgvectorContainer(): PostgreSQLContainer<*> {
		return PostgreSQLContainer(DockerImageName.parse("pgvector/pgvector:pg16"))
	}

	@Bean
	@ServiceConnection
	fun postgresContainer(): PostgreSQLContainer<*> {
		return PostgreSQLContainer(DockerImageName.parse("postgres:latest"))
	}

	@Bean
	@ServiceConnection
	fun pulsarContainer(): PulsarContainer {
		return PulsarContainer(DockerImageName.parse("apachepulsar/pulsar:latest"))
	}

	@Bean
	@ServiceConnection
	fun rabbitContainer(): RabbitMQContainer {
		return RabbitMQContainer(DockerImageName.parse("rabbitmq:latest"))
	}

	@Bean
	@ServiceConnection(name = "redis")
	fun redisContainer(): GenericContainer<*> {
		return GenericContainer(DockerImageName.parse("redis:latest")).withExposedPorts(6379)
	}

	@Bean
	@ServiceConnection
	fun sqlServerContainer(): MSSQLServerContainer<*> {
		return MSSQLServerContainer(DockerImageName.parse("mcr.microsoft.com/mssql/server:latest"))
	}

	@Bean
	@ServiceConnection(name = "openzipkin/zipkin")
	fun zipkinContainer(): GenericContainer<*> {
		return GenericContainer(DockerImageName.parse("openzipkin/zipkin:latest")).withExposedPorts(9411)
	}

}
