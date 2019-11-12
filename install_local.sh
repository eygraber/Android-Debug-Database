#!/usr/bin/env sh

./gradlew clean :debug-db-base:assemble :debug-db-base:install

./gradlew clean :debug-db:assemble :debug-db-encrypt:assemble :debug-db:install :debug-db-encrypt:install
