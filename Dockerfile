FROM qaware/distroless-zulu-payara-micro:8u212-5.191

COPY ./target/lombok-service.war /opt/payara/deployments
