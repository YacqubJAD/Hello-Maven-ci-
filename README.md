# Hello Maven CI

![Java CI with Maven](https://github.com/YOUR_USERNAME/hello-maven-ci/actions/workflows/ci.yml/badge.svg)

A simple Java project demonstrating CI/CD with Maven and GitHub Actions.

## Features

- Maven build with JUnit tests
- Automatic builds on every push
- Docker image automatically built and pushed to GitHub Container Registry

## Run Locally

```bash
docker run --rm ghcr.io/YOUR_USERNAME/hello-maven:latest
