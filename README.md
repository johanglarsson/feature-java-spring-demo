# Game service

This service demonstrates two things:

1. Java package structure according to a simplified DDD context.
2. [Score K8s](https://docs.score.dev/) as a tool for generating kubernetes manifests

## Usage

Install Score K8s

`brew install score-spec/tap/score-k8s`

Run manifest:

`score-k8s generate score.yaml --namespace <target namespace> --image ocker.io/library/game-service:0.0.1-SNAPSHOT`
