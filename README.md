# ms-micronaut-http

The POC application to showcase how we can leverage GCP Cloud Build and GKE to to deploy a scalable HTTP microservice using GCP CI/CD.

# prerequist
- Manual GKE setup is required on GCP.

# configuration

Following environment variable should be initialized with correct values from GCP project and GKE point of view
```yaml
  _K8S_LABELS: ''
  _K8S_NAMESPACE: default
  _OUTPUT_BUCKET_PATH: <project_id>_cloudbuild/deploy
  _GKE_CLUSTER: <GKE Cluster Name>
  _DOCKERFILE_DIR: ''
  _K8S_YAML_PATH: kubernetes/
  _K8S_ANNOTATIONS: gcb-trigger-id=46905dee-38b0-4d66-bafb-13c13aca138d
  _GKE_LOCATION: australia-southeast1
  _IMAGE_NAME: gcr.io/<project_id>/<application_image_name>
  _DOCKERFILE_NAME: Dockerfile
  _K8S_APP_NAME: ms-micronaut-http
```
