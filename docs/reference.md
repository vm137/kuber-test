docker build -f docker/DockerFile . -t kuber:v1
docker images
docker run -p 8080:8080 kuber:v1

$ kubectl create deployment hello-minikube --image=kuber:v1
$ kubectl expose deployment hello-minikube --type=NodePort --port=8080

http://localhost:8080

minikube service hello-minikube -url
kubectl delete services hello-minikube
kubectl delete deployment hello-minikube

D:\WORK\kuber-test\backend>helm install backend .
kubectl port-forward service/backend 8080:80

helm get all backend
