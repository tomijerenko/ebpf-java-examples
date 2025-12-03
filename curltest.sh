#!/bin/bash

USER="Bob"
BALANCE="500"

curl -s -X POST -H "Content-Type: application/json" -d '{"username":"John"}' localhost:8080/user 1> /dev/null &
curl -s -X POST -H "Content-Type: application/json" -d "{\"username\":\"$USER\"}" localhost:8080/user 1> /dev/null&
curl -s -X POST -H "Content-Type: application/json" -d '{"username":"Billy"}' localhost:8080/user 1> /dev/null
curl -s -X PUT -H "Content-Type: application/json" -d "{\"username\":\"$USER\",\"balance\":\"$BALANCE\"}" localhost:8080/user 1> /dev/null
curl -s localhost:8080/users | jq .
