FROM quay.io/redsift/sandbox-java:v1.8.0
MAINTAINER Deepak Prabhakara email: deepak@redsift.io version: 1.1.101

ARG version=2.11.8

RUN export DEBIAN_FRONTEND=noninteractive && \
    apt-get update && \
    apt-get install -y wget && \
    mkdir /tmp/scala && cd /tmp/scala && \
    wget http://www.scala-lang.org/files/archive/scala-$version.deb && \
    wget http://dl.bintray.com/sbt/debian/sbt-0.13.9.deb && \
    dpkg -i scala-$version.deb && \
    dpkg -i sbt-0.13.9.deb && \
    apt-get update && \
    apt-get install -y scala sbt && \
    apt-get purge -y && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* && \
    rm -rf /tmp/scala

COPY root /

ENTRYPOINT ["/bin/bash"]
