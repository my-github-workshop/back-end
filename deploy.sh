#!/bin/bash

# Exit on any error
set -e

sudo /opt/google-cloud-sdk/bin/gcloud docker push us.gcr.io/${PROJECT_NAME}/back-end
sudo chown -R ubuntu:ubuntu /home/ubuntu/.kube
kubectl patch deployment back-end -p '{"spec":{"template":{"spec":{"containers":[{"name":"back-end","image":"us.gcr.io/github-workshop/back-end:'"$CIRCLE_SHA1"'"}]}}}}'
