FROM openjdk:11-jre-slim-buster

RUN useradd -ms /bin/bash appuser
USER appuser:appuser

ENTRYPOINT ["java","-cp","app:app/lib/*","eu.benschroeder.actionstestbackend.ActionsTestBackendApplication"]

VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
