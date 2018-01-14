FROM payara/micro:5-SNAPSHOT

COPY ./target/lombok-service.war /opt/payara/deployments
