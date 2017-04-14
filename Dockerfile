FROM sebastian-daschner.com:1000/wildfly:5

COPY target/cloud-native-ee.war /opt/wildfly/standalone/deployments/
