# Config management with Spring Cloud Kubernetes

## Steps to run

1. Start Colima with Kubernetes

    `colima start --cpu 4 --memory 8 --with-kubernetes`


2. Check if Kubernetes is up and running

    `kubectl cluster-info`


3. SSH into Colima

    `colima ssh`


4. Build the docker image

    `docker build --file=Dockerfile --tag=config-management-with-spring-cloud-k8s:latest --rm=true .`


5. Create Kubernetes resources

    `kubectl apply -f app-deployment.yml`


6. Hit the URL

    `http://localhost:8091`


7. Delete Kubernetes resources after testing

    `kubectl delete -f app-deployment.yml`
