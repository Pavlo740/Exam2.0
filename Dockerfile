FROM openjdk
RUN mkdir /app
COPY src/ /app
WORKDIR /app
CMD java Main.java