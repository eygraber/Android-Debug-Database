#!/usr/bin/env sh

./gradlew clean :debug-db-base:assemble :debug-db-base:bintrayUpload

./gradlew clean :debug-db:assemble :debug-db-encrypt:assemble :debug-db:bintrayUpload :debug-db-encrypt:bintrayUpload
