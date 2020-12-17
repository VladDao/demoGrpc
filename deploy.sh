docker build -t ameleshko/grpc ./demo-grpc-server
docker build -t ameleshko/client ./demo-grpc-client
docker push ameleshko/grpc:grpc-serv
docker push ameleshko/client

kubectl create -f spec.yml
kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc postgres -o jsonpath="{.spec.clusterIP}")
kubectl expose deployment grpc-serv --type=LoadBalancer --port=8082

minikube service grpc-serv