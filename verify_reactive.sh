#!/usr/bin/env bash
set -euo pipefail

if [[ ${1:-} == "" ]]; then
  ./gradlew test
else
  ./gradlew ":$1:test"
fi
